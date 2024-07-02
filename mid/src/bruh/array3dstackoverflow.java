package bruh;

public class array3dstackoverflow {

	public static void main(String[] args) {
		double total=0;
		int counter=0;
		double calls [][][] = 
	        {
	                {{500,600,800},{700,800,900},{899,929,828},{292,900,727},{234,424,586},{997,734,876},{235,543,948}},
	                {{112,223,893},{234,848,455},{454,929,435},{727,827,636},{334,828,929},{382,938,929},{233,456,346}},
	                {{221,434,911},{374,647,338},{364,921,726},{919,823,221},{112,334,737},{912,261,562},{535,654,821}},
	                {{233,838,912},{263,523,393},{737,373,928},{828,736,636},{325,324,876},{434,858,495},{239,458,959}}
	        };
	        for(int weeks=0;weeks<4;weeks++) {
	                    for(int callNum=0;callNum<7;callNum++) {
	                        for(int dept=0;dept<3;dept++) {
	                        counter+=(calls[weeks][callNum][dept]);
	                        counter++;
	                    }
	                }
	            }
	        for (int week = 0; week < calls.length; week++) {
	            for (int days = 0; days < calls[week].length; days++) {
	                for (int resp = 0; resp < calls[week][days].length; resp++) {
	                    total += (calls[week][days][resp]);
	                }

	            }
	            System.out.println("Week " + (week + 1) + "= " + total);
	            total = 0.0;
	        }


	}

}
