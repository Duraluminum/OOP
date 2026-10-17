// package task2;

// interface IButton {
//     void paint();
// }

// interface ITextField {
//     void draw();
// }

// interface ISelect {
//     void display();
// }

// class WindowsButton implements IButton {
//     public void paint() {
//         System.out.println("I am Windows button");
//     }
// }

// class MacButton implements IButton {
//     public void paint() {
//         System.out.println("I am MacOS button");
//     }
// }

// class WindowsTextField implements ITextField {
//     public void draw() {
//         System.out.println("I am Windows text field");
//     }
// }

// class MacTextField implements ITextField {
//     public void draw() {
//         System.out.println("I am MacOS text field");
//     }
// }

// class WindowSelect implements ISelect {
//     public void display() {
//         System.out.println("I am Windows select");
//     }
// }

// class MacSelect implements ISelect {
//     public void display() {
//         System.out.println("I am MacOS select");
//     }
// }

// interface IGUIFactory {
//     IButton createButton();
//     ITextField creaTextField();
//     ISelect createSelect();
// }

// class WindowsGUIFactory implements IGUIFactory {
//     public IButton createButton() {
//         return new WindowsButton();
//     }

//     public ITextField createTextField() {
//         return new WindowsTextField();
//     }

//     public ITextField createSelect() {
//         return new WindowsSelect();
//     }
// }

// class MacGUIFactory implements IGUIFactory {
//     public IButton createButton() {
//         return new MacButton();
//     }

//     public ITextField createTextField() {
//         return new MacTextField();
//     }

//     public ISelect createSelect() {
//         return new MacSelect();
//     }
// }

// // ...