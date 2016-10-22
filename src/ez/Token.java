/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez;

/**
 *
 * @author TELC
 */
public class Token {
    private String lexic, lexicType;
    private int lexicToken;

    public Token(String lexic, String lexicType, int lexicToken) {
        this.lexic = lexic;
        this.lexicType = lexicType;
        this.lexicToken = lexicToken;
    }

    public String getLexic() {
        return lexic;
    }

    public void setLexic(String lexic) {
        this.lexic = lexic;
    }

    public String getLexicType() {
        return lexicType;
    }

    public void setLexicType(String lexicType) {
        this.lexicType = lexicType;
    }

    public int getLexicToken() {
        return lexicToken;
    }

    public void setLexicToken(int lexicToken) {
        this.lexicToken = lexicToken;
    }
    
    
}
