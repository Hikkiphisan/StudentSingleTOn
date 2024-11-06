public class Student {
    private int id;
    private String name;

    private static Student instance;

    public Student() {
    }

    public static Student getInstance() {
        try{
            if (instance == null) {
                instance = new Student();
            }
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
        return instance;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
