class Student {
    int name;
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public int getName() {
        return "nadeepa";
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int name, int id) {
        this.name = name;
        this.id = id;
    }
}
