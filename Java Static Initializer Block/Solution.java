static boolean flag = true;
static Scanner input = new Scanner(System.in);
static int B = input.nextInt();
static int H = input.nextInt();
static{
    try{
        if (B<=0 || H<=0){
            flag=false;
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}