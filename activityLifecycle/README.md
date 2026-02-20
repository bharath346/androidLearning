Activity Lifecycle


          onCreate()
               |
          onStart()
               |
          onResume()  <-- Activity is running
               |
           (user leaves)
               |
           onPause()
               |
       /---------------\
      |                 |
  onStop()           onResume() (if returning)
      |                 |
  onRestart() ---------/
      |
  onStart()
      |
  onResume()
      |
  onDestroy()  <-- Activity finished


a) onCreate()

Called once when the activity is created.

Initialize UI, set layout, bind views.

b) onStart()

Activity is about to become visible.

Use it for refreshing UI, starting animations, or initializing components that should appear.

c) onResume()

Activity is in foreground, user can interact.

Resume tasks paused in onPause().

d) onPause()

Called when activity loses focus, partially visible (like when a dialog appears or a new activity comes in front).

Save unsaved data, stop animations, or release CPU-heavy operations.

e) onStop()

Activity is completely hidden.

Release resources like network calls, sensors, GPS.

f) onRestart()

Called when an activity is coming back to foreground from stopped state.

Usually used to refresh data.


g) onDestroy()

Called when activity is finishing or system is destroying it.

Cleanup any remaining resources.