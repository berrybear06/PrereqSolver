package prereqsolver.runtime;

/**
 * An enumeration of TokenTypes.
 */
public enum TokenType {
    COURSE,     // e.g. "CS 2110"
    AND,        // "and", "&", resolved commas
    OR,         // "or", "one of", resolved commas

    LPAREN,     // "("
    RPAREN,     // ")"

    COMMA,      // The temporary placeholder
    SLASH,      // Converts to `AND`
    SEMICOLON,  // The hard separator
    PERIOD,     // Another hard separator

    EOF         // End of file
}
