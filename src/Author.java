import java.util.Objects;

public class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surName, author.surName);
    }


    public int hashCode() {
        return Objects.hash(name, surName);
    }


    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public String getSurName() {
        return this.surName;
        //

    }

}
