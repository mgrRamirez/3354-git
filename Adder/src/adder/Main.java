package adder;

class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide atleast two argument");
        }
    }

    private static int addArguments(String[] args) {
        int flag= 0;
	int index = 0;
	int sum = 0;
	if(args[0].equals("-"))
	{
		flag = 1;
		index = 1;
	}
	for(int i = index; i < args.length;i++)
	{
		if(flag==0)
			sum += Integer.valueOf(args[i]);
		if(flag ==1)
			sum -= Integer.valueOf(args[i]);
	}
        return sum;
    }
}