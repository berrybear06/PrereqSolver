package prereqsolver.pipeline;

import prereqsolver.runtime.TokenType;


/**
 * Immutable Token record.
 */
public record Token(TokenType tokenType, String literal) {

    // Compact Constructor for tokens without literals (AND, OR, etc.)
    public Token(TokenType tokenType) {
        this(tokenType, null);
    }

    @Override
    public String toString() {
        if (literal != null) {
            return tokenType + "(" + literal + ")";
        }
        return tokenType.toString();
    }
}