// The purpose of this class is only to complete the third challenge of this exercise: Create final class, method, variable.

package ClubDeFutbol;

final class ConsoleLineClass { // Final Class.

    final String consoleLine = "-----------------------------------------------------------"; // Final Variable

    final void printLine(){ // Final Method.
        System.out.println(consoleLine);
    }
}

// This class is being used in interface 'Training', which methods are being used in 'Inter' class