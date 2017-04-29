<b>Name: Observer 
Category: Behavioural Pattern
</b>

<b>Usecase:</b> Allows multiple watchers to get status update on Object being tracked.

<b>Example:</b> Stock Market Price Change can be tracked by Watchers such as Stock Traders.

Java Provides Observable and Observer Class to facilitate implementation.

Tracked Objects extend <b>Observable</b> class, and use <b>setChanges()</b> and <b>notifyObsevers()</b> API to notifiy trackers

Trackers implements <b>Observer</b> class and must implement <b>update(Observerable o, Object arg)</b> method to get tracked object.
