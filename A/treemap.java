import java.util.Comparator;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
    	Comparator<IpAddress> cmp = new Comparator<IpAddress>(){
                    @Override
        	public int compare(IpAddress o1, IpAddress o2) {
            	return o1.getCount() - o2.getCount();
            }};
        TreeMap<IpAddress,Integer> tm = new TreeMap<IpAddress,Integer>(cmp); 
        IpAddress[] add = new IpAddress[7];//null
        for(IpAddress ip : add){
            if(tm.containsKey(ip)){
                int i = tm.get(ip);
                ip.setCount(1+i);
                tm.put(ip,ip.getCount());
            }else {
                ip.setCount(1);
                tm.put(ip,ip.getCount());
            }
        }
    }
    class IpAddress {
            private String ip;
            private int count;
            
            @Override
            public int hashCode() {
                    final int prime = 31;
                    int result = 1;
                    result = prime * result + ((ip == null) ? 0 : ip.hashCode());
                    return result;
            }
            @Override
            public boolean equals(Object obj) {
                    if (this == obj)
                            return true;
                    if (obj == null)
                            return false;
                    if (getClass() != obj.getClass())
                            return false;
                    IpAddress other = (IpAddress) obj;
                    if (ip == null) {
                            if (other.ip != null)
                                    return false;
                    } else if (!ip.equals(other.ip))
                            return false;
                    return true;
            }
            public String getIp(){
                    return ip;
            }
            public void setIp(String ip) {
                    this.ip = ip;
            }
            public int getCount() {
                    return count;
            }
            public void setCount(int count) {
                    this.count = count;
            }
    }
}