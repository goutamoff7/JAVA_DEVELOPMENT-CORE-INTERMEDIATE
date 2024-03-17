package annotationDemo; 
import java.lang.annotation.Annotation; //in-built Annotation interface in java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//lets make an custom annotation to embed additional details to Goutam class
@Retention(RetentionPolicy.RUNTIME) //refers to the runtime, available to java compiler and JVM .
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER, ElementType.TYPE,ElementType.ANNOTATION_TYPE}) 
// ElementType is an enum
//TYPE : Class, interface (including annotation interface)
//PARAMETER : Formal parameter declaration
//ANNOTATION_TYPE : Annotation interface declaration (Formerly known as an annotation type.
@interface StudentDetails  // Multi-Valued Annotation
{
    String college();
    String qualification() default "Under Graduate"; // no need to give value for qualification, by default it will set
}

@StudentDetails (college="Sanaka")    
interface CustomAnnotation     // Annotation used in TYPE: interface
{

}

@StudentDetails (college="Sanaka")
@Retention(RetentionPolicy.SOURCE) //refers to the source code, discarded during compilation. It will not be available in the compiled class.
@Target(ElementType.TYPE)
@interface TestAnnotation { }   // Annotation used in ANNOTATION_TYPE : annotation interface, Marker Annotation


@Retention(RetentionPolicy.CLASS) //refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
@Target(ElementType.TYPE)
@interface TestAnnotation2  // Single valued Annotation
{ 
    int[] a() default {10,20}; // 1-D Array allowed
}

//Applying the annotation
@TestAnnotation2
class A{}

//Applying annotation
@StudentDetails (college="WBSI",qualification="Diploma") // Annotation used in TYPE : class 
class Goutam 
{
    
    String name;
    @StudentDetails (college="Sanaka") // Annotation used in FIELD : rno
    int rno;
    private float marks;

    @StudentDetails (college="Sanaka") // Annotation used in CONSTRUCTOR
    Goutam()
    {
        System.out.println("Constructor of Goutam class" );
    }
    
    @StudentDetails (college="Sanaka") // Annotation used in METHOD
    public float getMarks()
    {
        return marks;
    }

    public void setMarks(float marks)
    {
        this.marks=marks;
    }

}

public class CustomAnnotation_Demo1 {
    public static void main(String[] args) {
        
        @StudentDetails (college="Sanaka") // Annotation used in LOCAL_VARIABLE
        Goutam g = new Goutam();
        g.setMarks(78.5f); 
        System.out.println(g.getMarks());

        Class c = g.getClass();
        Annotation a = c.getAnnotation(StudentDetails.class);
        StudentDetails sd = (StudentDetails)a;
        System.out.println(sd.college());
        System.out.println(sd.annotationType());
        System.out.println(sd.qualification());
    }

}
