import java.io.File;

class LearningFiles {

    public static void main(String[] args) {

        File imgFile = new File("C:\\Users\\Laurent\\Desktop\\Datacamp Courses\\projects\\static files\\schoolbus.jpg");
        System.out.println(imgFile.getName());
        System.out.println(imgFile.length());

        File txtFile = new File("C:\\Users\\Laurent\\Desktop\\Datacamp Courses\\projects\\lols.txt");
        System.out.println(txtFile.exists());
        System.out.println(txtFile.length());

        // File projectDir = new File("C:\\Users\\Laurent\\Desktop\\Datacamp
        // Courses\\projects");
        // System.out.print(Arrays.toString(projectDir.list()));

        // for(String name:projectDir.list()){
        // System.out.println(name);
        // }

    }

}