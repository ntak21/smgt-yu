import java.awt.Component;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

class JavaLibs5026211087{

    private static Component frame;
    
        public static void main(String[] args) {
        
        JOptionPane.showConfirmDialog(frame,
             "Happy International Movie Day! Imagine yourself as a script writer. Do you think you can make a good storyline?", "International Movie Day",
             JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
       
        JOptionPane.showMessageDialog(null,
                "Let's find out how this famous movie would be if it was written by you!",
                "International Movie Day",PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "First, please answer the following questions!",
                "International Movie Day",PLAIN_MESSAGE);
       
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What's your last name?",
                "Name",
                2,
                null,
                null,
                "Write your name here.");
        
        String input2 = (String)JOptionPane.showInputDialog(null,
                "How many hours in a week do you spend watching movies? ",
                "Name",
                2,
                null,
                null,
                "Number of hours");
        
        String input3 = (String)JOptionPane.showInputDialog(null,
                "Who is your favorite character from cartoon movies/series?",
                "Name",
                2,
                null,
                null,
                " ");
        
        String input4 = (String)JOptionPane.showInputDialog(null,
                "If Spider Man was Indonesian, what do you think his favorite food is?",
                "Name",
                2,
                null,
                null,
                " ");
        String input6 = (String)JOptionPane.showInputDialog(null,
                "What animal don't you like?",
                "Name",
                2,
                null,
                null,
                " ");
        String input7 = (String)JOptionPane.showInputDialog(null,
                "Where you want to spend your holiday?",
                "Name",
                2,
                null,
                null,
                " ");
        String input8 = (String)JOptionPane.showInputDialog(null,
                "This one character is an old-wise man. What name would you give him?",
                "Name",
                2,
                null,
                null,
                " ");
        String input9 = (String)JOptionPane.showInputDialog(null,
                 "What would you do if you see zombies? I'll... them.",
                "Name",
                2,
                null,
                null,
                " ");
        String input10 = (String)JOptionPane.showInputDialog(null,
                 "What's your favorite fruit?",
                "Name",
                2,
                null,
                null,
                " ");
    
          JOptionPane.showMessageDialog(null,
                "No wonder why this movie is very famous.The script you write deserved an oscar!\n"
                  + "Harry Potter and The Order of" + " " + input8 + "\n\n"
                  + "Harry Potter is spending another summer with his dreadful Uncle Vernon when a group of evil spirits called " + input4 + "\n"
                  + "attack him. After using magic spell Wingardium" + " " + input1 + " " + "to defend himself, Harry is visited by a group" + "\n"
                  + "of wizard and whisked off to " + " " + input7 + " " + ", London. This place is the home of Harry’s godfather, Sirius Black,\n"
                  + "and also the headquarters of The Order of" + " " + input8+ " " + "The Order is a group of wizard dedicated to fight Tom Riddle,\n"
                  + "the lord of darkness, or also known as Lord" + " " + input3 + ". " + "Some" + input6 + " " + "believe that Lord"+ " " + input3 + "is \n"
                  + "still alive, so Harry and his bestfriends form their troops under the name" + " " + input8 +"'s army. They recruited" + " " + input2 + "\n"
                  + "students from Hogwarts and secretly teach them how to" + " " + input9 + " " + "other wizard with" + input10 + "\n",
                   "International Movie Day",PLAIN_MESSAGE);
          
        
    }

    
}

