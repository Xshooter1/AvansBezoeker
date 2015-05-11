/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package avansbezoeker;

/**
 *
 * @author Dominique Rietveld
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher teacher1 = new Teacher("Henk de Vries","DB les geven","PVO voorzitten");
        Teacher teacher2 = new Teacher("Arie Sjofel","EC les geven","");
        AvansVisitor student1 = new Student("Sjaak Bromsnor","DB les volgen");
        teacher1.print();
        teacher2.print();
        student1.print();
    }

}
