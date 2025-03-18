<h2>video</h2>
<h1>https://drive.google.com/file/d/1eIH5HmvbSeF-xTvKYAO_NmDunXkTZXfv/view?usp=sharing</h1>


In the "Without Creator" approach, we directly create the Student objects in the main function.
In the "With Creator" approach, we separate the creation logic into a different class (StudentCreator), which is responsible for creating new StudentWithCreator objects.
This separation of responsibilities can be useful in scenarios where the creation logic of objects might get more complex, or you want to follow a design pattern like the Builder Pattern.

Example Flow:
Class Definition:

StudentWithCreator: Holds the data and logic for student details.
StudentCreator: Creates the student objects.
Main Program:

A StudentCreator object is used to create students and manage their creation.
