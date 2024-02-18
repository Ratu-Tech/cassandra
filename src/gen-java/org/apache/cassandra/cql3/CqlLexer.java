// $ANTLR 3.5.2 Cql__.g 2023-08-09 16:01:04

    package org.apache.cassandra.cql3;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__197=197;
	public static final int T__198=198;
	public static final int T__199=199;
	public static final int T__200=200;
	public static final int T__201=201;
	public static final int T__202=202;
	public static final int T__203=203;
	public static final int T__204=204;
	public static final int T__205=205;
	public static final int T__206=206;
	public static final int T__207=207;
	public static final int T__208=208;
	public static final int T__209=209;
	public static final int T__210=210;
	public static final int T__211=211;
	public static final int T__212=212;
	public static final int T__213=213;
	public static final int T__214=214;
	public static final int T__215=215;
	public static final int T__216=216;
	public static final int T__217=217;
	public static final int T__218=218;
	public static final int T__219=219;
	public static final int T__220=220;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int DURATION=11;
	public static final int DURATION_UNIT=12;
	public static final int E=13;
	public static final int EMPTY_QUOTED_NAME=14;
	public static final int EXPONENT=15;
	public static final int F=16;
	public static final int FLOAT=17;
	public static final int G=18;
	public static final int H=19;
	public static final int HEX=20;
	public static final int HEXNUMBER=21;
	public static final int I=22;
	public static final int IDENT=23;
	public static final int INTEGER=24;
	public static final int J=25;
	public static final int K=26;
	public static final int K_ACCESS=27;
	public static final int K_ADD=28;
	public static final int K_AGGREGATE=29;
	public static final int K_AGGREGATES=30;
	public static final int K_ALL=31;
	public static final int K_ALLOW=32;
	public static final int K_ALTER=33;
	public static final int K_AND=34;
	public static final int K_APPLY=35;
	public static final int K_AS=36;
	public static final int K_ASC=37;
	public static final int K_ASCII=38;
	public static final int K_AUTHORIZE=39;
	public static final int K_BATCH=40;
	public static final int K_BEGIN=41;
	public static final int K_BIGINT=42;
	public static final int K_BLOB=43;
	public static final int K_BOOLEAN=44;
	public static final int K_BY=45;
	public static final int K_CALLED=46;
	public static final int K_CAST=47;
	public static final int K_CLUSTER=48;
	public static final int K_CLUSTERING=49;
	public static final int K_COLUMNFAMILY=50;
	public static final int K_COMPACT=51;
	public static final int K_CONTAINS=52;
	public static final int K_COUNT=53;
	public static final int K_COUNTER=54;
	public static final int K_CREATE=55;
	public static final int K_CUSTOM=56;
	public static final int K_DATACENTERS=57;
	public static final int K_DATE=58;
	public static final int K_DECIMAL=59;
	public static final int K_DEFAULT=60;
	public static final int K_DELETE=61;
	public static final int K_DESC=62;
	public static final int K_DESCRIBE=63;
	public static final int K_DISTINCT=64;
	public static final int K_DOUBLE=65;
	public static final int K_DROP=66;
	public static final int K_DURATION=67;
	public static final int K_ENTRIES=68;
	public static final int K_EXECUTE=69;
	public static final int K_EXISTS=70;
	public static final int K_FILTERING=71;
	public static final int K_FINALFUNC=72;
	public static final int K_FLOAT=73;
	public static final int K_FROM=74;
	public static final int K_FROZEN=75;
	public static final int K_FULL=76;
	public static final int K_FUNCTION=77;
	public static final int K_FUNCTIONS=78;
	public static final int K_GRANT=79;
	public static final int K_GROUP=80;
	public static final int K_HASHED=81;
	public static final int K_IF=82;
	public static final int K_IN=83;
	public static final int K_INDEX=84;
	public static final int K_INET=85;
	public static final int K_INITCOND=86;
	public static final int K_INPUT=87;
	public static final int K_INSERT=88;
	public static final int K_INT=89;
	public static final int K_INTERNALS=90;
	public static final int K_INTO=91;
	public static final int K_IS=92;
	public static final int K_JSON=93;
	public static final int K_KEY=94;
	public static final int K_KEYS=95;
	public static final int K_KEYSPACE=96;
	public static final int K_KEYSPACES=97;
	public static final int K_LANGUAGE=98;
	public static final int K_LIKE=99;
	public static final int K_LIMIT=100;
	public static final int K_LIST=101;
	public static final int K_LOGIN=102;
	public static final int K_MAP=103;
	public static final int K_MATERIALIZED=104;
	public static final int K_MAXWRITETIME=105;
	public static final int K_MBEAN=106;
	public static final int K_MBEANS=107;
	public static final int K_MODIFY=108;
	public static final int K_NEGATIVE_INFINITY=109;
	public static final int K_NEGATIVE_NAN=110;
	public static final int K_NOLOGIN=111;
	public static final int K_NORECURSIVE=112;
	public static final int K_NOSUPERUSER=113;
	public static final int K_NOT=114;
	public static final int K_NULL=115;
	public static final int K_OF=116;
	public static final int K_ON=117;
	public static final int K_ONLY=118;
	public static final int K_OPTIONS=119;
	public static final int K_OR=120;
	public static final int K_ORDER=121;
	public static final int K_PARTITION=122;
	public static final int K_PASSWORD=123;
	public static final int K_PER=124;
	public static final int K_PERMISSION=125;
	public static final int K_PERMISSIONS=126;
	public static final int K_POSITIVE_INFINITY=127;
	public static final int K_POSITIVE_NAN=128;
	public static final int K_PRIMARY=129;
	public static final int K_RENAME=130;
	public static final int K_REPLACE=131;
	public static final int K_RETURNS=132;
	public static final int K_REVOKE=133;
	public static final int K_ROLE=134;
	public static final int K_ROLES=135;
	public static final int K_SCHEMA=136;
	public static final int K_SELECT=137;
	public static final int K_SET=138;
	public static final int K_SFUNC=139;
	public static final int K_SMALLINT=140;
	public static final int K_STATIC=141;
	public static final int K_STORAGE=142;
	public static final int K_STYPE=143;
	public static final int K_SUPERUSER=144;
	public static final int K_TABLES=145;
	public static final int K_TEXT=146;
	public static final int K_TIME=147;
	public static final int K_TIMESTAMP=148;
	public static final int K_TIMEUUID=149;
	public static final int K_TINYINT=150;
	public static final int K_TO=151;
	public static final int K_TOKEN=152;
	public static final int K_TRIGGER=153;
	public static final int K_TRUNCATE=154;
	public static final int K_TTL=155;
	public static final int K_TUPLE=156;
	public static final int K_TYPE=157;
	public static final int K_TYPES=158;
	public static final int K_UNLOGGED=159;
	public static final int K_UNSET=160;
	public static final int K_UPDATE=161;
	public static final int K_USE=162;
	public static final int K_USER=163;
	public static final int K_USERS=164;
	public static final int K_USING=165;
	public static final int K_UUID=166;
	public static final int K_VALUES=167;
	public static final int K_VARCHAR=168;
	public static final int K_VARINT=169;
	public static final int K_VIEW=170;
	public static final int K_WHERE=171;
	public static final int K_WITH=172;
	public static final int K_WRITETIME=173;
	public static final int L=174;
	public static final int LETTER=175;
	public static final int M=176;
	public static final int MULTILINE_COMMENT=177;
	public static final int N=178;
	public static final int O=179;
	public static final int P=180;
	public static final int Q=181;
	public static final int QMARK=182;
	public static final int QUOTED_NAME=183;
	public static final int R=184;
	public static final int RANGE=185;
	public static final int S=186;
	public static final int STRING_LITERAL=187;
	public static final int T=188;
	public static final int U=189;
	public static final int UUID=190;
	public static final int V=191;
	public static final int W=192;
	public static final int WS=193;
	public static final int X=194;
	public static final int Y=195;
	public static final int Z=196;
	public static final int Tokens=221;

	    List<Token> tokens = new ArrayList<Token>();

	    public void emit(Token token)
	    {
	        state.token = token;
	        tokens.add(token);
	    }

	    public Token nextToken()
	    {
	        super.nextToken();
	        if (tokens.size() == 0)
	            return new CommonToken(Token.EOF);
	        return tokens.remove(0);
	    }

	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }


	// delegates
	public Cql_Lexer gLexer;
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {gLexer};
	}

	public CqlLexer() {} 
	public CqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
		gLexer = new Cql_Lexer(input, state, this);
	}
	@Override public String getGrammarFileName() { return "Cql__.g"; }

	// $ANTLR start "T__197"
	public final void mT__197() throws RecognitionException {
		try {
			int _type = T__197;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:47:8: ( '!=' )
			// Cql__.g:47:10: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__197"

	// $ANTLR start "T__198"
	public final void mT__198() throws RecognitionException {
		try {
			int _type = T__198;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:48:8: ( '%' )
			// Cql__.g:48:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__198"

	// $ANTLR start "T__199"
	public final void mT__199() throws RecognitionException {
		try {
			int _type = T__199;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:49:8: ( '(' )
			// Cql__.g:49:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__199"

	// $ANTLR start "T__200"
	public final void mT__200() throws RecognitionException {
		try {
			int _type = T__200;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:50:8: ( ')' )
			// Cql__.g:50:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__200"

	// $ANTLR start "T__201"
	public final void mT__201() throws RecognitionException {
		try {
			int _type = T__201;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:51:8: ( '+' )
			// Cql__.g:51:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__201"

	// $ANTLR start "T__202"
	public final void mT__202() throws RecognitionException {
		try {
			int _type = T__202;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:52:8: ( '+=' )
			// Cql__.g:52:10: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__202"

	// $ANTLR start "T__203"
	public final void mT__203() throws RecognitionException {
		try {
			int _type = T__203;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:53:8: ( ',' )
			// Cql__.g:53:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__203"

	// $ANTLR start "T__204"
	public final void mT__204() throws RecognitionException {
		try {
			int _type = T__204;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:54:8: ( '-' )
			// Cql__.g:54:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__204"

	// $ANTLR start "T__205"
	public final void mT__205() throws RecognitionException {
		try {
			int _type = T__205;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:55:8: ( '-=' )
			// Cql__.g:55:10: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__205"

	// $ANTLR start "T__206"
	public final void mT__206() throws RecognitionException {
		try {
			int _type = T__206;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:56:8: ( '.' )
			// Cql__.g:56:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__206"

	// $ANTLR start "T__207"
	public final void mT__207() throws RecognitionException {
		try {
			int _type = T__207;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:57:8: ( '/' )
			// Cql__.g:57:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__207"

	// $ANTLR start "T__208"
	public final void mT__208() throws RecognitionException {
		try {
			int _type = T__208;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:58:8: ( ':' )
			// Cql__.g:58:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__208"

	// $ANTLR start "T__209"
	public final void mT__209() throws RecognitionException {
		try {
			int _type = T__209;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:59:8: ( ';' )
			// Cql__.g:59:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__209"

	// $ANTLR start "T__210"
	public final void mT__210() throws RecognitionException {
		try {
			int _type = T__210;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:60:8: ( '<' )
			// Cql__.g:60:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__210"

	// $ANTLR start "T__211"
	public final void mT__211() throws RecognitionException {
		try {
			int _type = T__211;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:61:8: ( '<=' )
			// Cql__.g:61:10: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__211"

	// $ANTLR start "T__212"
	public final void mT__212() throws RecognitionException {
		try {
			int _type = T__212;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:62:8: ( '=' )
			// Cql__.g:62:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__212"

	// $ANTLR start "T__213"
	public final void mT__213() throws RecognitionException {
		try {
			int _type = T__213;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:63:8: ( '>' )
			// Cql__.g:63:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__213"

	// $ANTLR start "T__214"
	public final void mT__214() throws RecognitionException {
		try {
			int _type = T__214;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:64:8: ( '>=' )
			// Cql__.g:64:10: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__214"

	// $ANTLR start "T__215"
	public final void mT__215() throws RecognitionException {
		try {
			int _type = T__215;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:65:8: ( '[' )
			// Cql__.g:65:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__215"

	// $ANTLR start "T__216"
	public final void mT__216() throws RecognitionException {
		try {
			int _type = T__216;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:66:8: ( '\\*' )
			// Cql__.g:66:10: '\\*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__216"

	// $ANTLR start "T__217"
	public final void mT__217() throws RecognitionException {
		try {
			int _type = T__217;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:67:8: ( ']' )
			// Cql__.g:67:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__217"

	// $ANTLR start "T__218"
	public final void mT__218() throws RecognitionException {
		try {
			int _type = T__218;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:68:8: ( 'expr(' )
			// Cql__.g:68:10: 'expr('
			{
			match("expr("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__218"

	// $ANTLR start "T__219"
	public final void mT__219() throws RecognitionException {
		try {
			int _type = T__219;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:69:8: ( '{' )
			// Cql__.g:69:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__219"

	// $ANTLR start "T__220"
	public final void mT__220() throws RecognitionException {
		try {
			int _type = T__220;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:70:8: ( '}' )
			// Cql__.g:70:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__220"

	@Override
	public void mTokens() throws RecognitionException {
		// Cql__.g:1:8: ( T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | Lexer. Tokens )
		int alt1=25;
		alt1 = dfa1.predict(input);
		switch (alt1) {
			case 1 :
				// Cql__.g:1:10: T__197
				{
				mT__197(); 

				}
				break;
			case 2 :
				// Cql__.g:1:17: T__198
				{
				mT__198(); 

				}
				break;
			case 3 :
				// Cql__.g:1:24: T__199
				{
				mT__199(); 

				}
				break;
			case 4 :
				// Cql__.g:1:31: T__200
				{
				mT__200(); 

				}
				break;
			case 5 :
				// Cql__.g:1:38: T__201
				{
				mT__201(); 

				}
				break;
			case 6 :
				// Cql__.g:1:45: T__202
				{
				mT__202(); 

				}
				break;
			case 7 :
				// Cql__.g:1:52: T__203
				{
				mT__203(); 

				}
				break;
			case 8 :
				// Cql__.g:1:59: T__204
				{
				mT__204(); 

				}
				break;
			case 9 :
				// Cql__.g:1:66: T__205
				{
				mT__205(); 

				}
				break;
			case 10 :
				// Cql__.g:1:73: T__206
				{
				mT__206(); 

				}
				break;
			case 11 :
				// Cql__.g:1:80: T__207
				{
				mT__207(); 

				}
				break;
			case 12 :
				// Cql__.g:1:87: T__208
				{
				mT__208(); 

				}
				break;
			case 13 :
				// Cql__.g:1:94: T__209
				{
				mT__209(); 

				}
				break;
			case 14 :
				// Cql__.g:1:101: T__210
				{
				mT__210(); 

				}
				break;
			case 15 :
				// Cql__.g:1:108: T__211
				{
				mT__211(); 

				}
				break;
			case 16 :
				// Cql__.g:1:115: T__212
				{
				mT__212(); 

				}
				break;
			case 17 :
				// Cql__.g:1:122: T__213
				{
				mT__213(); 

				}
				break;
			case 18 :
				// Cql__.g:1:129: T__214
				{
				mT__214(); 

				}
				break;
			case 19 :
				// Cql__.g:1:136: T__215
				{
				mT__215(); 

				}
				break;
			case 20 :
				// Cql__.g:1:143: T__216
				{
				mT__216(); 

				}
				break;
			case 21 :
				// Cql__.g:1:150: T__217
				{
				mT__217(); 

				}
				break;
			case 22 :
				// Cql__.g:1:157: T__218
				{
				mT__218(); 

				}
				break;
			case 23 :
				// Cql__.g:1:164: T__219
				{
				mT__219(); 

				}
				break;
			case 24 :
				// Cql__.g:1:171: T__220
				{
				mT__220(); 

				}
				break;
			case 25 :
				// Cql__.g:1:178: Lexer. Tokens
				{
				gLexer.mTokens(); 

				}
				break;

		}
	}


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\5\uffff\1\27\1\uffff\1\31\1\32\1\33\2\uffff\1\35\1\uffff\1\37\3\uffff"+
		"\1\25\15\uffff\3\25\1\uffff";
	static final String DFA1_eofS =
		"\44\uffff";
	static final String DFA1_minS =
		"\1\11\4\uffff\1\75\1\uffff\1\55\1\56\1\52\2\uffff\1\75\1\uffff\1\75\3"+
		"\uffff\1\170\15\uffff\1\160\1\162\1\50\1\uffff";
	static final String DFA1_maxS =
		"\1\175\4\uffff\1\75\1\uffff\1\156\1\56\1\57\2\uffff\1\75\1\uffff\1\75"+
		"\3\uffff\1\170\15\uffff\1\160\1\162\1\50\1\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\3\uffff\1\14\1\15\1\uffff\1\20\1"+
		"\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\1\31\1\6\1\5\1\11\1\10\1\12\1"+
		"\13\1\17\1\16\1\22\1\21\3\uffff\1\26";
	static final String DFA1_specialS =
		"\44\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\25\2\uffff\1\25\22\uffff\1\25\1\1\1\25\1\uffff\1\25\1\2\1\uffff\1"+
			"\25\1\3\1\4\1\20\1\5\1\6\1\7\1\10\1\11\12\25\1\12\1\13\1\14\1\15\1\16"+
			"\1\25\1\uffff\32\25\1\17\1\uffff\1\21\3\uffff\4\25\1\22\25\25\1\23\1"+
			"\uffff\1\24",
			"",
			"",
			"",
			"",
			"\1\26",
			"",
			"\1\25\2\uffff\12\25\3\uffff\1\30\13\uffff\1\25\4\uffff\1\25\1\uffff"+
			"\1\25\30\uffff\1\25\4\uffff\1\25",
			"\1\25",
			"\1\25\4\uffff\1\25",
			"",
			"",
			"\1\34",
			"",
			"\1\36",
			"",
			"",
			"",
			"\1\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | Lexer. Tokens );";
		}
	}

}
