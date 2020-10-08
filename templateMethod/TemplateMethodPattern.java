/**
 * The template method pattern defines the skeleton
 * of an algorithm in an operation, deferring some
 * steps to subclasses. The template method lets
 * subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 * 
 * @author Daniel Valle
 */

package templateMethod;

abstract class EngineeringCareer {
    public EngineeringCareer() {
        System.out.println("starting an engineering career...");
    }

    public void careerPath() {
        commonMath();
        commonSkills();
        specialization();
    }

    private void commonMath() {
        System.out.println("learning common math background...");
    }

    private void commonSkills() {
        System.out.println("learning common skills...");
    }

    public abstract void specialization();
}

class SoftwareSpecialization extends EngineeringCareer {
    @Override
    public void specialization() {
        System.out.println("software specialization path...");
    }
}

class HardwareSpecialization extends EngineeringCareer {
    @Override
    public void specialization() {
        System.out.println("hardware specialization path...");
    }
}

public class TemplateMethodPattern {
    public static void main(String[] args) {
        EngineeringCareer student1 = new SoftwareSpecialization();
        EngineeringCareer student2 = new HardwareSpecialization();

        student1.careerPath();
        student2.careerPath();
    }
}