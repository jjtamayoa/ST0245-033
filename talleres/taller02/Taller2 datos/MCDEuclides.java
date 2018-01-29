
public class MCDEuclides{
     int mcd(int p,int q){
        if(p%q==0){
            return q;
        }
        return mcd(q,p%q);
    }
}
