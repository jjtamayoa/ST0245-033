
/**
 * @authors Omar Becerra - Juan José Tamayo 
 */
public class TorreHanoi{
    public static void hanoi(int numeroFichas){
          t(numeroFichas,'A','B','C');
    }
    
    private static void t ( int numberDisk , char from ,char inter , char to ) {
            if ( numberDisk == 1)
                     System.out.println(" Disco 1 desde " + from + " a " + to );
            else {
                    t ( numberDisk - 1 , from , to , inter );
                    System.out.println(" Disco " + numberDisk + " desde " + from +" a " + to );
                    t ( numberDisk - 1 , inter , from , to );
            }
    }
}

