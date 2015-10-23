
/**
 *
 * @author Yves Marin & John Jay Mercines
 */
public class MatrixApp {
    public static void main(String args[]){
        Matrix MatrixClass = new Matrix();
        
        Matrix trixA = new Matrix();
        Matrix trixB = new Matrix();
        
        System.out.println("matrix a");
        trixA.setCell(0,0,1);
        trixA.setCell(0,1,2);
        trixA.setCell(0,2,3);
        trixA.setCell(0,3,4);
        trixA.setCell(1,0,5);
        trixA.setCell(1,1,6);
        trixA.setCell(1,2,7);
        trixA.setCell(1,3,8);
        trixA.setCell(2,0,9);
        trixA.setCell(2,1,0);
        trixA.setCell(2,2,1);
        trixA.setCell(2,3,2);
        trixA.setCell(3,0,3);
        trixA.setCell(3,1,4);
        trixA.setCell(3,2,5);
        trixA.setCell(3,3,6);
        trixA.displayMatrix();
        
        System.out.println("-----------------------");
        
        System.out.println("matrix b");
        trixB.setCell(0,0,1);
        trixB.setCell(0,1,2);
        trixB.setCell(0,2,3);
        trixB.setCell(0,3,4);
        trixB.setCell(1,0,5);
        trixB.setCell(1,1,6);
        trixB.setCell(1,2,7);
        trixB.setCell(1,3,8);
        trixB.setCell(2,0,9);
        trixB.setCell(2,1,0);
        trixB.setCell(2,2,1);
        trixB.setCell(2,3,2);
        trixB.setCell(3,0,3);
        trixB.setCell(3,1,4);
        trixB.setCell(3,2,5);
        trixB.setCell(3,3,6);
        trixB.displayMatrix();
        
        System.out.println("-----------------------");
        
        MatrixClass.addMatrices(trixA, trixB);
        MatrixClass.displayMatrix();
    }
    
    
}
