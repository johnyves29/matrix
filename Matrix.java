
/**
 *
 * @author Yves Marin & John Jay Mercines
 */
class Matrix {
    
    final int size = 4;
    private int[][] squares = new int [size][size];
    
    //        
            public void addMatrices(Matrix a, Matrix b){
                int x,y;
                for(x = 0; x<size ;x++){
                    for(y = 0;y<size;y++ ){
                        squares[x][y]=a.getCell(x, y) + b.getCell(x, y);
                    }       
                }   
            }
            
             public int getCell(int x, int y){
             return squares[x][y];
             }
             
            public void setCell(int x, int y, int value){
                this.squares[x][y] = value;   
            }
            
            
            public void displayMatrix(){
                int x,y;
                for(x=0;x<size;x++){
                    for(y=0;y<size;y++){
                        System.out.print(this.getCell(x,y) + "\t");
                    }
                   System.out.println();
                }
                
            }
}

