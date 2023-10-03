package homework.BraceChecker;

public class BraceChecker {

    private String text;

    BraceChecker(String text){
        this.text = text;
    }


    public void chack(){
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0){
                        System.out.println("error. " + c + " closed, but not opend. at" + i);
                    }else if(pop != '('){
                        System.out.println("error " + c + " closed, but opend " + (char)pop + " at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0){
                        System.out.println("error. " + c + " closed, but not opend. at" + i);
                    }else if(pop != '{'){
                        System.out.println("error " + c + " closed, but opend " + (char)pop + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0){
                        System.out.println("error. " + c + " closed, but not opend. at" + i);
                    }else if(pop != '['){
                        System.out.println("error " + c + " closed, but opend " + (char)pop + " at " + i);
                    }
                    break;
            }
        }
        while (stack.getIndex() != -1){
            System.out.println("error opend " + (char)stack.pop());
        }

    }

}
