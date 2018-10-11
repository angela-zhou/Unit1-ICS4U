package activity6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SchoolInformation extends Application {

	static final int GAP         = 15;
	static final int LARGE_FONT  = 24;
	static final int MEDIUM_FONT = 18;
	static final int SMALL_FONT  = 12;

	//Global variables
	Student student1;

	@Override
	public void start(Stage myStage) throws Exception {
		int numOfColumns = 3;
		Image defaultImg = new Image(getClass().getResource("images/default profile pic.png").toString());

		VBox root = new VBox(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));
		
		Label lblTitle = new Label("School Information");
		lblTitle.setFont(Font.font(LARGE_FONT));
		root.getChildren().add(lblTitle);

		/**
		 * Students
		 */
		// Title
		Label lblStudentTitle = new Label("Students");
		lblStudentTitle.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblStudentTitle);

		// Tile Pane
		TilePane students = new TilePane();
		root.getChildren().add(students);
		students.setHgap(GAP);
		students.setVgap(GAP);
		students.setPadding(new Insets(GAP, GAP, GAP, GAP));
		students.setPrefColumns(numOfColumns);

		// First Student
		VBox vbxStudent1 = new VBox(GAP);
		students.getChildren().add(vbxStudent1);

		Student student1 = new Student(4.5, "Software Engineering", 2020);
		student1.setName("Andrew Adams");

		ImageView imgProfile1 = new ImageView(defaultImg);

		Label lblName1     = new Label(                                       student1.getName());
		Label lblGPA1      = new Label("GPA: "             + Double.toString( student1.getGPA()));
		Label lblMajor1    = new Label("Major: "           +                  student1.getMajor());
		Label lblGradYear1 = new Label("Graduation Year: " + Integer.toString(student1.getGraduationYear()));

		vbxStudent1.getChildren().addAll(imgProfile1, lblName1, lblGPA1, lblMajor1, lblGradYear1);

		// Second Student
		VBox vbxStudent2 = new VBox(GAP);
		students.getChildren().add(vbxStudent2);

		Student student2 = new Student(3.5, "Computer Science", 2020);
		student2.setName("Bobby Brown");

		ImageView imgProfile2 = new ImageView(defaultImg);

		Label lblName2     = new Label(                                       student2.getName());
		Label lblGPA2      = new Label("GPA: "             + Double.toString( student2.getGPA()));
		Label lblMajor2    = new Label("Major: "           +                  student2.getMajor());
		Label lblGradYear2 = new Label("Graduation Year: " + Integer.toString(student2.getGraduationYear()));

		vbxStudent2.getChildren().addAll(imgProfile2, lblName2, lblGPA2, lblMajor2, lblGradYear2);

		// Third Student
		VBox vbxStudent3 = new VBox(GAP);
		students.getChildren().add(vbxStudent3);

		Student student3 = new Student(4.0, "Accounting", 2020);
		student3.setName("Clarissa Cherney");

		ImageView imgProfile3 = new ImageView(defaultImg);

		Label lblName3     = new Label(                                       student3.getName());
		Label lblGPA3      = new Label("GPA: "             + Double.toString( student3.getGPA()));
		Label lblMajor3    = new Label("Major: "           +                  student3.getMajor());
		Label lblGradYear3 = new Label("Graduation Year: " + Integer.toString(student3.getGraduationYear()));

		vbxStudent3.getChildren().addAll(imgProfile3, lblName3, lblGPA3, lblMajor3, lblGradYear3);

		/**
		 * Employees
		 */
		// Title
		Label lblEmployeesTitle = new Label("Employees");
		lblEmployeesTitle.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblEmployeesTitle);

		// Tile Pane
		TilePane employees = new TilePane();
		root.getChildren().add(employees);
		employees.setHgap(GAP);
		employees.setVgap(GAP);
		employees.setPadding(new Insets(GAP, GAP, GAP, GAP));
		employees.setPrefColumns(numOfColumns);

		// Salaried Employee
		VBox vbxSalariedEmployee = new VBox(GAP);
		employees.getChildren().add(vbxSalariedEmployee);

		SalariedEmployees salariedEmployee = new SalariedEmployees(115513.00);
		salariedEmployee.setName("Daisy Davis");

		ImageView imgProfile4 = new ImageView(defaultImg);

		Label lblName4  = new Label(                             salariedEmployee.getName());
		Label lblSalary = new Label("Salary: " + Double.toString(salariedEmployee.getAnnualSalary()));

		vbxSalariedEmployee.getChildren().addAll(imgProfile4, lblName4, lblSalary);

		// Hourly Employee
		VBox vbxHourlyEmployee = new VBox(GAP);
		employees.getChildren().add(vbxHourlyEmployee);

		HourlyEmployees HourlyEmployee = new HourlyEmployees(15.50, 8.5, 38.75);
		HourlyEmployee.setName("Edward Evans");

		ImageView imgProfile5 = new ImageView(defaultImg);

		Label lblName5       = new Label(                                   HourlyEmployee.getName());
		Label lblHourlyRate  = new Label("Hourly Rate: $" + Double.toString(HourlyEmployee.getHourlyRate()));
		Label lblHoursWorked = new Label("Hours Worked: " + Double.toString(HourlyEmployee.getHoursWorked()));
		Label lblUnionDues   = new Label("Union Dues: $"  + Double.toString(HourlyEmployee.getUnionDues()));

		vbxHourlyEmployee.getChildren().addAll(imgProfile5, lblName5, lblHourlyRate, lblHoursWorked, lblUnionDues);

		Scene scene = new Scene(root);
		myStage.setTitle("School Information");
		myStage.setScene(scene);
		myStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
