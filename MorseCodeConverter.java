//Dennis Lin
//CSI 310
//Programming assignment 3 -- Chapter 10

import javax.swing.JOptionPane;


class TranslatorMorse {
  public static void main( String [] args ) {

//strings for the English alphabet and numbers
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    String numbers = "1234567890";

//Arrays for Morse Code alphabet and numbers
    String lettersMorse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
  "..-", "...-", ".--", "-..-", "-.--", "--..", "|" };
    String numbersMorse[] = { ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

// Asks for which type of translation
    String type = JOptionPane.showInputDialog( "Type \"1\" if you would like to translate from English to Morse Code. Type \"2\" if you would like to translate from Morse Code to English." );

// English to Morse
    if ( type.equals( "1" ) ) {
      char character;
      String inputStringOriginal = JOptionPane.showInputDialog( "Enter the English you would like to translate to Morse Code using only letters, digits, and spaces:" );
      String inputString = inputStringOriginal.toUpperCase();
      String output[] = new String[inputString.length()];
      int x;
      int y;
      int b;
// Translate each individual character
      for ( x = 0; x < inputString.length(); x++ ) {
  character = inputString.charAt( x );
// Translate letters and spaces
  for ( y = 0; y < letters.length(); y++ ) {
    if (character == letters.charAt( y ))
    output[x] = lettersMorse[y];
}
// Translate digits
  for ( b = 0; b < numbers.length(); b++ ) {
    if (character == numbers.charAt( b ))
    output[x] = numbersMorse[b];
}
}
// Display the translated results
      int z = 0;
      for ( z = 0; z < output.length; z++ ) {
        System.out.print( output[z] + " " );
}
}
// Morse to English
    if ( type.equals( "2" ) ) {
// Receive input string
      String inputStringOriginal = JOptionPane.showInputDialog( "Enter the Morse Code you would like to translate to English using the \"-\" (hyphen) as a dash and the \".\" (period) as a dot. Separate letters with spaces and indicate spaces between words with one \"|\" with a space on either side of it." );
      String inputString = inputStringOriginal + " ";
// Translate and display
      int e;
      int f;

//tokenising the string splitting on spaces
      String[] tokens = inputString.split(" ");

// Translate if letter or space and print
      for (int i = 0; i < tokens.length; i++){
        for ( e = 0; e < letters.length(); e++ ) {
          if ( tokens[i].equals( lettersMorse[e] ) )
            System.out.print( letters.charAt( e ) );
  }
// Translate if number and print
        for ( f = 0; f < numbers.length(); f++ ) {
          if ( tokens[i].equals( numbersMorse[f] ) )
            System.out.print( numbers.charAt( f ) );
  }
}
}
}
}

