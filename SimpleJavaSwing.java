import javax.swing.JOptionPane;
public class javaswing {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your fullname: ");
        while(!name.matches("[ a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null,"Invalid name!\nName must be letters only.");
            name = JOptionPane.showInputDialog("Enter your fullname: ");
        }
        String age = JOptionPane.showInputDialog("Enter your age: ");
        while(!age.matches("[ 0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"Invalid age!\nName must be numbers only.");
            age = JOptionPane.showInputDialog("Enter your age: ");
        }
        JOptionPane.showMessageDialog(null,"You are "+name.toUpperCase()+" and you are "+age+" years old.");
	}

}