// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: graphLexer.jflex

// Declarations
package org.graph.backend;

import java_cup.runtime.*;

// Translation rules

@SuppressWarnings("fallthrough")
public class GraphLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\u10fe\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\25\0\1\1\7\0\1\2\1\3\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\12\12\7\0\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\22\1\25\1\26\1\27\1\30\1\31\1\22"+
    "\1\32\1\33\1\34\1\35\1\36\3\22\1\37\4\0"+
    "\1\22\1\0\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\22\1\25\1\26\1\27"+
    "\1\30\1\31\1\22\1\32\1\33\1\34\1\35\1\36"+
    "\3\22\1\37\265\0\2\40\115\0\1\41\u0180\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\12\13\1\0\10\13\1\0\2\13"+
    "\1\0\7\13\1\12\1\0\3\13\1\0\6\13\1\0"+
    "\2\13\1\0\7\13\1\0\4\13\1\0\1\14\1\15"+
    "\4\13\1\0\2\13\1\0\4\13\1\0\1\13\1\16"+
    "\1\13\1\0\2\13\1\0\2\13\1\0\1\13\1\0"+
    "\2\13\1\17\1\0\1\13\1\0\2\20\1\13\1\21"+
    "\2\13\1\0\2\13\1\0\1\22\1\13\1\0\1\23"+
    "\1\13\1\0\1\23\1\13\1\0\2\13\1\0\1\13"+
    "\1\0\1\13\1\24\1\13\1\0\1\13\2\25\1\13"+
    "\1\0\1\13\1\0\2\26\1\27\1\13\1\27\1\13"+
    "\1\0\1\30\1\13\1\0\1\13\2\31\2\32\1\33"+
    "\2\34\2\35\2\13\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\42\0\42\0\42\0\42\0\42"+
    "\0\42\0\42\0\146\0\210\0\252\0\314\0\356\0\u0110"+
    "\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe\0\u0220"+
    "\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330"+
    "\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440"+
    "\0\u0462\0\u01dc\0\u0484\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e"+
    "\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e"+
    "\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c\0\u074e"+
    "\0\u0770\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\u081a\0\252\0\252"+
    "\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4\0\u08e6\0\u0908\0\u092a"+
    "\0\u094c\0\u096e\0\u0990\0\u09b2\0\u09d4\0\u09f6\0\252\0\u0a18"+
    "\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4\0\u0b06\0\u0b28"+
    "\0\u0b4a\0\u0b6c\0\u0b8e\0\252\0\u0bb0\0\u0bd2\0\u0bf4\0\252"+
    "\0\42\0\u0c16\0\252\0\u0c38\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0"+
    "\0\u0ce2\0\252\0\u0d04\0\u0d26\0\252\0\u0d48\0\u0d6a\0\42"+
    "\0\u0d8c\0\u0dae\0\u0dd0\0\u0df2\0\u0e14\0\u0e36\0\u0e58\0\u0e7a"+
    "\0\252\0\u0e9c\0\u0ebe\0\u0ee0\0\252\0\42\0\u0f02\0\u0f24"+
    "\0\u0f46\0\u0f68\0\252\0\42\0\252\0\u0f8a\0\42\0\u0fac"+
    "\0\u0fce\0\252\0\u0ff0\0\u1012\0\u1034\0\252\0\42\0\252"+
    "\0\42\0\252\0\252\0\42\0\252\0\42\0\u1056\0\u1078"+
    "\0\252";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\14\1\15\1\16\3\15\1\17"+
    "\3\15\1\20\1\15\1\21\1\22\1\23\1\24\3\15"+
    "\1\25\1\15\2\2\43\0\1\3\50\0\1\26\1\0"+
    "\1\13\41\0\1\27\13\15\1\30\1\31\7\15\1\32"+
    "\14\0\1\27\25\15\14\0\1\27\1\33\3\15\1\34"+
    "\3\15\1\35\11\15\1\36\2\15\1\37\13\0\1\27"+
    "\17\15\1\40\5\15\14\0\1\27\10\15\1\41\14\15"+
    "\1\42\13\0\1\27\1\43\3\15\1\44\20\15\14\0"+
    "\1\27\1\15\1\45\23\15\14\0\1\27\15\15\1\46"+
    "\7\15\14\0\1\27\4\15\1\47\10\15\1\50\7\15"+
    "\14\0\1\27\4\15\1\51\20\15\14\0\1\52\37\0"+
    "\1\53\1\0\1\27\25\15\14\0\1\27\1\54\24\15"+
    "\14\0\1\27\10\15\1\55\10\15\1\56\3\15\1\57"+
    "\13\0\1\27\22\15\1\60\2\15\14\0\1\27\5\15"+
    "\1\61\17\15\14\0\1\27\12\15\1\62\12\15\14\0"+
    "\1\27\17\15\1\63\5\15\14\0\1\27\1\64\16\15"+
    "\1\65\5\15\34\0\1\66\21\0\1\27\1\67\24\15"+
    "\14\0\1\27\14\15\1\70\10\15\31\0\1\71\24\0"+
    "\1\27\17\15\1\72\5\15\14\0\1\27\6\15\1\73"+
    "\16\15\14\0\1\27\11\15\1\74\13\15\14\0\1\27"+
    "\12\15\1\75\12\15\14\0\1\27\2\15\1\76\22\15"+
    "\14\0\1\27\11\15\1\77\6\15\1\100\4\15\1\0"+
    "\1\101\12\0\1\27\17\15\1\102\5\15\14\0\1\15"+
    "\41\0\1\27\17\15\1\103\5\15\14\0\1\27\13\15"+
    "\1\104\11\15\14\0\1\27\4\15\1\105\20\15\30\0"+
    "\1\106\25\0\1\27\12\15\1\107\12\15\14\0\1\27"+
    "\4\15\1\110\20\15\14\0\1\27\4\15\1\111\20\15"+
    "\14\0\1\27\2\15\1\112\22\15\14\0\1\27\3\15"+
    "\1\113\21\15\14\0\1\27\23\15\1\114\1\15\17\0"+
    "\1\115\36\0\1\27\5\15\1\116\17\15\14\0\1\27"+
    "\4\15\1\117\20\15\21\0\1\120\34\0\1\27\1\121"+
    "\24\15\14\0\1\27\17\15\1\122\5\15\14\0\1\27"+
    "\4\15\1\123\20\15\14\0\1\27\10\15\1\124\14\15"+
    "\1\125\13\0\1\27\21\15\1\126\3\15\14\0\1\27"+
    "\15\15\1\127\7\15\14\0\1\27\1\130\24\15\15\0"+
    "\1\131\40\0\1\27\3\15\1\132\21\15\14\0\1\27"+
    "\10\15\1\133\14\15\1\134\13\0\1\27\1\135\24\15"+
    "\14\0\1\27\17\15\1\136\5\15\15\0\1\137\40\0"+
    "\1\27\20\15\1\140\4\15\1\0\1\141\12\0\1\27"+
    "\22\15\1\142\2\15\14\0\1\27\17\15\1\143\5\15"+
    "\14\0\1\27\1\144\24\15\37\0\1\145\16\0\1\27"+
    "\10\15\1\146\14\15\1\147\13\0\1\27\1\150\24\15"+
    "\15\0\1\151\40\0\1\27\14\15\1\152\10\15\14\0"+
    "\1\27\15\15\1\153\7\15\14\0\1\27\21\15\1\154"+
    "\3\15\14\0\1\27\6\15\1\155\16\15\23\0\1\156"+
    "\32\0\1\27\1\157\24\15\14\0\1\27\3\15\1\160"+
    "\21\15\20\0\1\161\35\0\1\27\4\15\1\162\20\15"+
    "\14\0\1\27\12\15\1\163\12\15\27\0\1\164\26\0"+
    "\1\27\17\15\1\165\5\15\14\0\1\27\10\15\1\166"+
    "\14\15\1\167\33\0\1\170\21\0\1\27\21\15\1\171"+
    "\3\15\36\0\1\172\17\0\1\27\12\15\1\173\12\15"+
    "\14\0\1\27\1\174\24\15\27\0\1\175\26\0\1\27"+
    "\2\15\1\176\22\15\17\0\1\177\36\0\1\27\11\15"+
    "\1\200\13\15\14\0\1\27\15\15\1\201\7\15\14\0"+
    "\1\27\15\15\1\202\7\15\32\0\1\203\23\0\1\27"+
    "\14\15\1\204\10\15\14\0\1\27\15\15\1\205\7\15"+
    "\32\0\1\206\23\0\1\27\12\15\1\207\12\15\27\0"+
    "\1\210\26\0\1\27\15\15\1\211\7\15\32\0\1\212"+
    "\23\0\1\27\4\15\1\213\20\15\21\0\1\214\34\0"+
    "\1\27\15\15\1\215\7\15\14\0\1\27\3\15\1\216"+
    "\21\15\32\0\1\217\23\0\1\27\1\220\24\15\15\0"+
    "\1\221\40\0\1\27\1\222\24\15\14\0\1\27\14\15"+
    "\1\223\10\15\31\0\1\224\24\0\1\27\6\15\1\225"+
    "\16\15\14\0\1\27\15\15\1\226\7\15\32\0\1\227"+
    "\23\0\1\27\17\15\1\230\5\15\34\0\1\231\21\0"+
    "\1\27\15\15\1\232\7\15\14\0\1\27\17\15\1\233"+
    "\5\15\34\0\1\234\21\0\1\27\15\15\1\235\7\15"+
    "\32\0\1\236\23\0\1\27\22\15\1\237\2\15\14\0"+
    "\1\27\12\15\1\240\12\15\14\0\1\27\15\15\1\241"+
    "\7\15\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4250];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\7\11\13\1\1\0\10\1\1\0"+
    "\2\1\1\0\10\1\1\0\3\1\1\0\6\1\1\0"+
    "\2\1\1\0\7\1\1\0\4\1\1\0\6\1\1\0"+
    "\2\1\1\0\4\1\1\0\3\1\1\0\2\1\1\0"+
    "\2\1\1\0\1\1\1\0\3\1\1\0\1\1\1\0"+
    "\1\1\1\11\4\1\1\0\2\1\1\0\2\1\1\0"+
    "\2\1\1\0\1\11\1\1\1\0\2\1\1\0\1\1"+
    "\1\0\3\1\1\0\2\1\1\11\1\1\1\0\1\1"+
    "\1\0\1\1\1\11\2\1\1\11\1\1\1\0\2\1"+
    "\1\0\2\1\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public GraphLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Lexical error: " + yytext() + " in line: " + yyline+1 + " & col " + yycolumn+1);
            }
          // fall through
          case 31: break;
          case 2:
            { /* ignore */
            }
          // fall through
          case 32: break;
          case 3:
            { return new Symbol(sym.PARENTHESES_START, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 33: break;
          case 4:
            { return new Symbol(sym.PARENTHESES_END, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 34: break;
          case 5:
            { return new Symbol(sym.MULTIPLICATION, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 35: break;
          case 6:
            { return new Symbol(sym.ADDITION, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 36: break;
          case 7:
            { return new Symbol(sym.COMMA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 37: break;
          case 8:
            { return new Symbol(sym.SUBSTRACTION, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 38: break;
          case 9:
            { return new Symbol(sym.DIVISION, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 39: break;
          case 10:
            { return new Symbol(sym.NUMBER, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 40: break;
          case 11:
            { return new Symbol(sym.NAME, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 41: break;
          case 12:
            { return new Symbol(sym.AZUL, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 42: break;
          case 13:
            { return new Symbol(sym.CAFE, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 43: break;
          case 14:
            { return new Symbol(sym.ROJO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 44: break;
          case 15:
            { return new Symbol(sym.CURVA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 45: break;
          case 16:
            { return new Symbol(sym.LINEA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 46: break;
          case 17:
            { return new Symbol(sym.NEGRO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 47: break;
          case 18:
            { return new Symbol(sym.VERDE, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 48: break;
          case 19:
            { return new Symbol(sym.ANIMAR, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 49: break;
          case 20:
            { return new Symbol(sym.OBJETO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 50: break;
          case 21:
            { return new Symbol(sym.ROSADO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 51: break;
          case 22:
            { return new Symbol(sym.CELESTE, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 52: break;
          case 23:
            { return new Symbol(sym.CIRCULO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 53: break;
          case 24:
            { return new Symbol(sym.NARANJA, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 54: break;
          case 25:
            { return new Symbol(sym.AMARILLO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 55: break;
          case 26:
            { return new Symbol(sym.ANTERIOR, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 56: break;
          case 27:
            { return new Symbol(sym.CUADRADO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 57: break;
          case 28:
            { return new Symbol(sym.GRAFICAR, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 58: break;
          case 29:
            { return new Symbol(sym.POLIGONO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 59: break;
          case 30:
            { return new Symbol(sym.RECTANGULO, yyline+1, yycolumn+1, yytext());
            }
          // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
