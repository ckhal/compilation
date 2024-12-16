package Tp2copmilation;

public class DescendantParser {
    private String input; 
    private int index;    

    public DescendantParser(String input) {
        this.input = input;
        this.index = 0;
    }

    public boolean parse() {
        return S() && index == input.length();
    }

   
    private boolean S() {
        int save = index; 

       
        if (match('b')) {
            if (S()) {
                if (match('b')) {
                    return true;
                }
            }
        }

     
        index = save;
        if (match('c')) {
            if (A()) {
                if (match('c')) {
                    return true;
                }
            }
        }

        return false; 
    }

    private boolean A() {
        int save = index;

        if (match('b')) {
            if (A()) {
                if (A()) {
                    return true;
                }
            }
        }

        index = save;
        if (match('c')) {
            if (A()) {
                if (S()) {
                    if (A()) {
                        if (match('b')) {
                            return true;
                        }
                    }
                }
            }
        }

        index = save;
        if (match('d')) {
            if (match('c')) {
                if (match('b')) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean match(char c) {
        if (index < input.length() && input.charAt(index) == c) {
            index++;
            return true;
        }
        return false;
    }
}

