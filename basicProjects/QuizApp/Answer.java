public class Answer {

    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    

    public Answer(String opt1, String opt2, String opt3, String opt4) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }


    @Override
    public String toString() {
        return "Answer [opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + "]";
    }



    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }   
    
}
