# Unit 1, Activity 6: JavaFX API Documentation

Link: https://docs.oracle.com/javase/8/javafx/api/index.html

Question | MouseEvent | Control | Canvas
---------|------------|---------|-------
1 | java.lang.Object, java.util.EventObject, javafx.event.Event, javafx.scene.input.InputEvent | java.lang.Object, javafx.scene.Node, javafx.scene.Parent, javafx.scene.layout.Region | java.lang.Object, javafx.scene.Node|
2 | N/A | Styleable, EventTarget, Skinnable | Styleable, EventTarget |
3 | MouseDragEvent | Accordion, HTMLEditor, ListView, TextInputControl| N/A |
4 | No, MouseEvent(EventType<? extends MouseEvent> eventType, double x, double y, double screenX, double screenY, MouseButton button, int clickCount, boolean shiftDown, boolean controlDown, boolean altDown, boolean metaDown, boolean primaryButtonDown, boolean middleButtonDown, boolean secondaryButtonDown, boolean synthesized, boolean popupTrigger, boolean stillSincePress, PickResult pickResult) and MouseEvent(Object source, EventTarget target, EventType<? extends MouseEvent> eventType, double x, double y, double screenX, double screenY, MouseButton button, int clickCount, boolean shiftDown, boolean controlDown, boolean altDown, boolean metaDown, boolean primaryButtonDown, boolean middleButtonDown, boolean secondaryButtonDown, boolean synthesized, boolean popupTrigger, boolean stillSincePress, PickResult pickResult) | Yes, abstract is called in the header| No, Canvas() and Canvas(double width, double height) |
5 | 	copyFor(Object newSource, EventTarget newTarget) and 	copyFor(Object newSource, EventTarget newTarget, EventType<? extends MouseEvent> eventType) | N/A | N/A |
6 | getSceneX() and setDragDetect(boolean dragDetect) | getSkin() and setSkin(Skin<?> value)| getHeight() and setHeight(double value)|
