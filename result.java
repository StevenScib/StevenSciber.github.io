import javax.swing.JOptionPane;
public class result {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the number of subjects:");
        int Subjects = Integer.parseInt(input);
        int totalMarks = 0;
        for (int i = 1; i <= Subjects; i++) {
            String markInput = JOptionPane.showInputDialog("Enter the mark (0-100) for subject " + i + ":");
            int mark = Integer.parseInt(markInput);
            totalMarks = totalMarks + mark;
        }
        int average = totalMarks / Subjects;
        JOptionPane.showMessageDialog(null, "The average result is: " + average +"% across your "+Subjects+" subjects");
    }
}