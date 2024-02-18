// $ANTLR 3.5.2 Parser.g 2023-08-09 16:01:03

    package org.apache.cassandra.cql3;

    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.cql3.conditions.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.statements.schema.*;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.schema.ColumnMetadata;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Cql_Parser extends Parser {
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

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

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            if (res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText()) != null)
	            {
	                addRecognitionError(String.format("Multiple definition for property " + ((Constants.Literal)entry.left).getRawText()));
	            }
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
	    }

	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    // Recovery methods are overridden to avoid wasting work on recovering from errors when the result will be
	    // ignored anyway.
	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    @Override
	    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }

	    @Override
	    public void recover(IntStream input, RecognitionException re)
	    {
	        // Do nothing.
	    }



	// $ANTLR start "cqlStatement"
	// Parser.g:207:1: cqlStatement returns [CQLStatement.Raw stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement );
	public final CQLStatement.Raw cqlStatement() throws RecognitionException {
		CQLStatement.Raw stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement.Raw st8 =null;
		CreateTableStatement.Raw st9 =null;
		CreateIndexStatement.Raw st10 =null;
		DropKeyspaceStatement.Raw st11 =null;
		DropTableStatement.Raw st12 =null;
		DropIndexStatement.Raw st13 =null;
		AlterTableStatement.Raw st14 =null;
		AlterKeyspaceStatement.Raw st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement.Raw st23 =null;
		DropTriggerStatement.Raw st24 =null;
		CreateTypeStatement.Raw st25 =null;
		AlterTypeStatement.Raw st26 =null;
		DropTypeStatement.Raw st27 =null;
		CreateFunctionStatement.Raw st28 =null;
		DropFunctionStatement.Raw st29 =null;
		CreateAggregateStatement.Raw st30 =null;
		DropAggregateStatement.Raw st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement.Raw st38 =null;
		DropViewStatement.Raw st39 =null;
		AlterViewStatement.Raw st40 =null;
		DescribeStatement st41 =null;

		try {
			// Parser.g:209:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement )
			int alt1=41;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:209:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st1; }
					}
					break;
				case 2 :
					// Parser.g:210:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st2; }
					}
					break;
				case 3 :
					// Parser.g:211:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st3; }
					}
					break;
				case 4 :
					// Parser.g:212:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st4; }
					}
					break;
				case 5 :
					// Parser.g:213:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st5; }
					}
					break;
				case 6 :
					// Parser.g:214:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st6; }
					}
					break;
				case 7 :
					// Parser.g:215:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st7; }
					}
					break;
				case 8 :
					// Parser.g:216:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st8; }
					}
					break;
				case 9 :
					// Parser.g:217:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st9; }
					}
					break;
				case 10 :
					// Parser.g:218:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st10; }
					}
					break;
				case 11 :
					// Parser.g:219:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st11; }
					}
					break;
				case 12 :
					// Parser.g:220:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st12; }
					}
					break;
				case 13 :
					// Parser.g:221:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st13; }
					}
					break;
				case 14 :
					// Parser.g:222:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st14; }
					}
					break;
				case 15 :
					// Parser.g:223:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st15; }
					}
					break;
				case 16 :
					// Parser.g:224:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st16; }
					}
					break;
				case 17 :
					// Parser.g:225:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st17; }
					}
					break;
				case 18 :
					// Parser.g:226:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st18; }
					}
					break;
				case 19 :
					// Parser.g:227:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st19; }
					}
					break;
				case 20 :
					// Parser.g:228:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st20; }
					}
					break;
				case 21 :
					// Parser.g:229:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st21; }
					}
					break;
				case 22 :
					// Parser.g:230:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st22; }
					}
					break;
				case 23 :
					// Parser.g:231:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st23; }
					}
					break;
				case 24 :
					// Parser.g:232:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st24; }
					}
					break;
				case 25 :
					// Parser.g:233:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st25; }
					}
					break;
				case 26 :
					// Parser.g:234:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st26; }
					}
					break;
				case 27 :
					// Parser.g:235:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st27; }
					}
					break;
				case 28 :
					// Parser.g:236:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st28; }
					}
					break;
				case 29 :
					// Parser.g:237:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st29; }
					}
					break;
				case 30 :
					// Parser.g:238:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st30; }
					}
					break;
				case 31 :
					// Parser.g:239:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st31; }
					}
					break;
				case 32 :
					// Parser.g:240:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st32; }
					}
					break;
				case 33 :
					// Parser.g:241:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st33; }
					}
					break;
				case 34 :
					// Parser.g:242:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st34; }
					}
					break;
				case 35 :
					// Parser.g:243:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st35; }
					}
					break;
				case 36 :
					// Parser.g:244:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st36; }
					}
					break;
				case 37 :
					// Parser.g:245:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st37; }
					}
					break;
				case 38 :
					// Parser.g:246:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st38; }
					}
					break;
				case 39 :
					// Parser.g:247:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st39; }
					}
					break;
				case 40 :
					// Parser.g:248:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st40; }
					}
					break;
				case 41 :
					// Parser.g:249:7: st41= describeStatement
					{
					pushFollow(FOLLOW_describeStatement_in_cqlStatement991);
					st41=describeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st41; }
					}
					break;

			}
			if ( state.backtracking==0 ) { if (stmt != null) stmt.setBindVariables(bindVariables); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:255:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:256:5: ( K_USE ks= keyspaceName )
			// Parser.g:256:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1030); if (state.failed) return stmt;
			pushFollow(FOLLOW_keyspaceName_in_useStatement1034);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new UseStatement(ks); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:265:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		ParserRuleReturnScope sclause =null;
		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<>();
		        List<Selectable.Raw> groups = new ArrayList<>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:274:5: ( K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:274:7: K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1068); if (state.failed) return expr;
			// Parser.g:276:7: ( ( K_JSON selectClause )=> K_JSON )?
			int alt2=2;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// Parser.g:276:9: ( K_JSON selectClause )=> K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1094); if (state.failed) return expr;
					if ( state.backtracking==0 ) { isJson = true; }
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1103);
			sclause=selectClause();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1111); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1115);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:278:7: ( K_WHERE wclause= whereClause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_WHERE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Parser.g:278:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1125); if (state.failed) return expr;
					pushFollow(FOLLOW_whereClause_in_selectStatement1129);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:279:7: ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==K_GROUP) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Parser.g:279:9: K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )*
					{
					match(input,K_GROUP,FOLLOW_K_GROUP_in_selectStatement1142); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1144); if (state.failed) return expr;
					pushFollow(FOLLOW_groupByClause_in_selectStatement1146);
					groupByClause(groups);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:279:44: ( ',' groupByClause[groups] )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==203) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Parser.g:279:46: ',' groupByClause[groups]
							{
							match(input,203,FOLLOW_203_in_selectStatement1151); if (state.failed) return expr;
							pushFollow(FOLLOW_groupByClause_in_selectStatement1153);
							groupByClause(groups);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			// Parser.g:280:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==K_ORDER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Parser.g:280:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1170); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1172); if (state.failed) return expr;
					pushFollow(FOLLOW_orderByClause_in_selectStatement1174);
					orderByClause(orderings);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:280:47: ( ',' orderByClause[orderings] )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==203) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Parser.g:280:49: ',' orderByClause[orderings]
							{
							match(input,203,FOLLOW_203_in_selectStatement1179); if (state.failed) return expr;
							pushFollow(FOLLOW_orderByClause_in_selectStatement1181);
							orderByClause(orderings);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// Parser.g:281:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_PER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:281:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1198); if (state.failed) return expr;
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1200); if (state.failed) return expr;
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1202); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1206);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { perPartitionLimit = rows; }
					}
					break;

			}

			// Parser.g:282:7: ( K_LIMIT rows= intValue )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_LIMIT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:282:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1221); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1225);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { limit = rows; }
					}
					break;

			}

			// Parser.g:283:7: ( K_ALLOW K_FILTERING )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==K_ALLOW) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Parser.g:283:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1240); if (state.failed) return expr;
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1242); if (state.failed) return expr;
					if ( state.backtracking==0 ) { allowFiltering = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             groups,
			                                                                             (sclause!=null?((Cql_Parser.selectClause_return)sclause).isDistinct:false),
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, (sclause!=null?((Cql_Parser.selectClause_return)sclause).selectors:null), where, limit, perPartitionLimit);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"


	public static class selectClause_return extends ParserRuleReturnScope {
		public boolean isDistinct;
		public List<RawSelector> selectors;
	};


	// $ANTLR start "selectClause"
	// Parser.g:295:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );
	public final Cql_Parser.selectClause_return selectClause() throws RecognitionException {
		Cql_Parser.selectClause_return retval = new Cql_Parser.selectClause_return();
		retval.start = input.LT(1);

		List<RawSelector> s =null;

		 retval.isDistinct = false; 
		try {
			// Parser.g:298:5: ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors )
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// Parser.g:298:7: ( K_DISTINCT selectors )=> K_DISTINCT s= selectors
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectClause1297); if (state.failed) return retval;
					pushFollow(FOLLOW_selectors_in_selectClause1301);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.isDistinct = true; retval.selectors = s; }
					}
					break;
				case 2 :
					// Parser.g:299:7: s= selectors
					{
					pushFollow(FOLLOW_selectors_in_selectClause1313);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.selectors = s; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selectors"
	// Parser.g:302:1: selectors returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectors() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:303:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN||LA13_0==DURATION||LA13_0==FLOAT||LA13_0==HEXNUMBER||(LA13_0 >= IDENT && LA13_0 <= INTEGER)||LA13_0==K_ACCESS||(LA13_0 >= K_AGGREGATE && LA13_0 <= K_ALL)||LA13_0==K_AS||LA13_0==K_ASCII||(LA13_0 >= K_BIGINT && LA13_0 <= K_BOOLEAN)||(LA13_0 >= K_CALLED && LA13_0 <= K_CLUSTERING)||(LA13_0 >= K_COMPACT && LA13_0 <= K_COUNTER)||(LA13_0 >= K_CUSTOM && LA13_0 <= K_DEFAULT)||(LA13_0 >= K_DISTINCT && LA13_0 <= K_DOUBLE)||LA13_0==K_DURATION||(LA13_0 >= K_EXISTS && LA13_0 <= K_FLOAT)||LA13_0==K_FROZEN||(LA13_0 >= K_FUNCTION && LA13_0 <= K_FUNCTIONS)||(LA13_0 >= K_GROUP && LA13_0 <= K_HASHED)||(LA13_0 >= K_INET && LA13_0 <= K_INPUT)||(LA13_0 >= K_INT && LA13_0 <= K_INTERNALS)||(LA13_0 >= K_JSON && LA13_0 <= K_KEYS)||(LA13_0 >= K_KEYSPACES && LA13_0 <= K_LIKE)||(LA13_0 >= K_LIST && LA13_0 <= K_MAP)||(LA13_0 >= K_MAXWRITETIME && LA13_0 <= K_MBEANS)||(LA13_0 >= K_NEGATIVE_INFINITY && LA13_0 <= K_NOLOGIN)||LA13_0==K_NOSUPERUSER||LA13_0==K_NULL||(LA13_0 >= K_ONLY && LA13_0 <= K_OPTIONS)||(LA13_0 >= K_PARTITION && LA13_0 <= K_POSITIVE_NAN)||(LA13_0 >= K_REPLACE && LA13_0 <= K_RETURNS)||(LA13_0 >= K_ROLE && LA13_0 <= K_ROLES)||(LA13_0 >= K_SFUNC && LA13_0 <= K_TINYINT)||(LA13_0 >= K_TOKEN && LA13_0 <= K_TRIGGER)||(LA13_0 >= K_TTL && LA13_0 <= K_TYPES)||LA13_0==K_UNSET||(LA13_0 >= K_USER && LA13_0 <= K_USERS)||(LA13_0 >= K_UUID && LA13_0 <= K_VARINT)||LA13_0==K_WRITETIME||(LA13_0 >= QMARK && LA13_0 <= QUOTED_NAME)||LA13_0==STRING_LITERAL||LA13_0==UUID||LA13_0==199||LA13_0==204||LA13_0==208||LA13_0==215||LA13_0==219) ) {
				alt13=1;
			}
			else if ( (LA13_0==216) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Parser.g:303:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectors1338);
					t1=selector();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = new ArrayList<RawSelector>(); expr.add(t1); }
					// Parser.g:303:76: ( ',' tN= selector )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==203) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Parser.g:303:77: ',' tN= selector
							{
							match(input,203,FOLLOW_203_in_selectors1343); if (state.failed) return expr;
							pushFollow(FOLLOW_selector_in_selectors1347);
							tN=selector();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { expr.add(tN); }
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:304:7: '\\*'
					{
					match(input,216,FOLLOW_216_in_selectors1359); if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = Collections.<RawSelector>emptyList();}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectors"



	// $ANTLR start "selector"
	// Parser.g:307:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:309:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:309:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1392);
			us=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			// Parser.g:309:28: ( K_AS c= noncol_ident )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_AS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Parser.g:309:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1395); if (state.failed) return s;
					pushFollow(FOLLOW_noncol_ident_in_selector1399);
					c=noncol_ident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { alias = c; }
					}
					break;

			}

			if ( state.backtracking==0 ) { s = new RawSelector(us, alias); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:312:1: unaliasedSelector returns [Selectable.Raw s] : a= selectionAddition ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw a =null;

		try {
			// Parser.g:313:5: (a= selectionAddition )
			// Parser.g:313:7: a= selectionAddition
			{
			pushFollow(FOLLOW_selectionAddition_in_unaliasedSelector1428);
			a=selectionAddition();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = a;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionAddition"
	// Parser.g:316:1: selectionAddition returns [Selectable.Raw s] : l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* ;
	public final Selectable.Raw selectionAddition() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:317:5: (l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* )
			// Parser.g:317:9: l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			{
			pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1455);
			l=selectionMultiplication();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:318:9: ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==201) ) {
					alt15=1;
				}
				else if ( (LA15_0==204) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// Parser.g:318:11: '+' r= selectionMultiplication
					{
					match(input,201,FOLLOW_201_in_selectionAddition1471); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1475);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('+', s, r);}
					}
					break;
				case 2 :
					// Parser.g:319:11: '-' r= selectionMultiplication
					{
					match(input,204,FOLLOW_204_in_selectionAddition1489); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1493);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('-', s, r);}
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionAddition"



	// $ANTLR start "selectionMultiplication"
	// Parser.g:323:1: selectionMultiplication returns [Selectable.Raw s] : l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* ;
	public final Selectable.Raw selectionMultiplication() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:324:5: (l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* )
			// Parser.g:324:9: l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			{
			pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1531);
			l=selectionGroup();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:325:9: ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			loop16:
			while (true) {
				int alt16=4;
				switch ( input.LA(1) ) {
				case 216:
					{
					alt16=1;
					}
					break;
				case 207:
					{
					alt16=2;
					}
					break;
				case 198:
					{
					alt16=3;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// Parser.g:325:11: '\\*' r= selectionGroup
					{
					match(input,216,FOLLOW_216_in_selectionMultiplication1547); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1551);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('*', s, r);}
					}
					break;
				case 2 :
					// Parser.g:326:11: '/' r= selectionGroup
					{
					match(input,207,FOLLOW_207_in_selectionMultiplication1565); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1569);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('/', s, r);}
					}
					break;
				case 3 :
					// Parser.g:327:11: '%' r= selectionGroup
					{
					match(input,198,FOLLOW_198_in_selectionMultiplication1583); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1587);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('%', s, r);}
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMultiplication"



	// $ANTLR start "selectionGroup"
	// Parser.g:331:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );
	public final Selectable.Raw selectionGroup() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw g =null;

		try {
			// Parser.g:332:5: ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup )
			int alt17=3;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// Parser.g:332:7: ( selectionGroupWithField )=>f= selectionGroupWithField
					{
					pushFollow(FOLLOW_selectionGroupWithField_in_selectionGroup1629);
					f=selectionGroupWithField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =f; }
					}
					break;
				case 2 :
					// Parser.g:333:7: g= selectionGroupWithoutField
					{
					pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroup1641);
					g=selectionGroupWithoutField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =g; }
					}
					break;
				case 3 :
					// Parser.g:334:7: '-' g= selectionGroup
					{
					match(input,204,FOLLOW_204_in_selectionGroup1651); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionGroup1655);
					g=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newNegation(g);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroup"



	// $ANTLR start "selectionGroupWithField"
	// Parser.g:337:1: selectionGroupWithField returns [Selectable.Raw s] : g= selectionGroupWithoutField m= selectorModifier[g] ;
	public final Selectable.Raw selectionGroupWithField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw g =null;
		Selectable.Raw m =null;

		try {
			// Parser.g:338:5: (g= selectionGroupWithoutField m= selectorModifier[g] )
			// Parser.g:338:7: g= selectionGroupWithoutField m= selectorModifier[g]
			{
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1680);
			g=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			pushFollow(FOLLOW_selectorModifier_in_selectionGroupWithField1684);
			m=selectorModifier(g);
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = m;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithField"



	// $ANTLR start "selectorModifier"
	// Parser.g:341:1: selectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |);
	public final Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw m =null;
		Selectable.Raw ss =null;

		try {
			// Parser.g:342:5: (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |)
			int alt18=3;
			switch ( input.LA(1) ) {
			case 206:
				{
				alt18=1;
				}
				break;
			case 215:
				{
				alt18=2;
				}
				break;
			case EOF:
			case K_ALLOW:
			case K_AS:
			case K_FROM:
			case K_LIMIT:
			case K_ORDER:
			case K_PER:
			case 198:
			case 200:
			case 201:
			case 203:
			case 204:
			case 207:
			case 208:
			case 216:
			case 217:
			case 220:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Parser.g:342:7: f= fieldSelectorModifier[receiver] m= selectorModifier[f]
					{
					pushFollow(FOLLOW_fieldSelectorModifier_in_selectorModifier1711);
					f=fieldSelectorModifier(receiver);
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1716);
					m=selectorModifier(f);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 2 :
					// Parser.g:343:7: '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss]
					{
					match(input,215,FOLLOW_215_in_selectorModifier1727); if (state.failed) return s;
					pushFollow(FOLLOW_collectionSubSelection_in_selectorModifier1731);
					ss=collectionSubSelection(receiver);
					state._fsp--;
					if (state.failed) return s;
					match(input,217,FOLLOW_217_in_selectorModifier1734); if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1738);
					m=selectorModifier(ss);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 3 :
					// Parser.g:344:7: 
					{
					if ( state.backtracking==0 ) { s = receiver; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectorModifier"



	// $ANTLR start "fieldSelectorModifier"
	// Parser.g:347:1: fieldSelectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : '.' fi= fident ;
	public final Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		FieldIdentifier fi =null;

		try {
			// Parser.g:348:5: ( '.' fi= fident )
			// Parser.g:348:7: '.' fi= fident
			{
			match(input,206,FOLLOW_206_in_fieldSelectorModifier1771); if (state.failed) return s;
			pushFollow(FOLLOW_fident_in_fieldSelectorModifier1775);
			fi=fident();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithFieldSelection.Raw(receiver, fi); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "fieldSelectorModifier"



	// $ANTLR start "collectionSubSelection"
	// Parser.g:351:1: collectionSubSelection[Selectable.Raw receiver] returns [Selectable.Raw s] : (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) ;
	public final Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Term.Raw t1 =null;
		Term.Raw t2 =null;

		 boolean isSlice=false; 
		try {
			// Parser.g:353:5: ( (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) )
			// Parser.g:353:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			{
			// Parser.g:353:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==BOOLEAN||LA21_0==DURATION||LA21_0==FLOAT||LA21_0==HEXNUMBER||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||LA21_0==K_ACCESS||(LA21_0 >= K_AGGREGATE && LA21_0 <= K_ALL)||LA21_0==K_AS||LA21_0==K_ASCII||(LA21_0 >= K_BIGINT && LA21_0 <= K_BOOLEAN)||(LA21_0 >= K_CALLED && LA21_0 <= K_CLUSTERING)||(LA21_0 >= K_COMPACT && LA21_0 <= K_COUNTER)||(LA21_0 >= K_CUSTOM && LA21_0 <= K_DEFAULT)||(LA21_0 >= K_DISTINCT && LA21_0 <= K_DOUBLE)||LA21_0==K_DURATION||(LA21_0 >= K_EXISTS && LA21_0 <= K_FLOAT)||LA21_0==K_FROZEN||(LA21_0 >= K_FUNCTION && LA21_0 <= K_FUNCTIONS)||(LA21_0 >= K_GROUP && LA21_0 <= K_HASHED)||(LA21_0 >= K_INET && LA21_0 <= K_INPUT)||(LA21_0 >= K_INT && LA21_0 <= K_INTERNALS)||(LA21_0 >= K_JSON && LA21_0 <= K_KEYS)||(LA21_0 >= K_KEYSPACES && LA21_0 <= K_LIKE)||(LA21_0 >= K_LIST && LA21_0 <= K_MAP)||(LA21_0 >= K_MAXWRITETIME && LA21_0 <= K_MBEANS)||(LA21_0 >= K_NEGATIVE_INFINITY && LA21_0 <= K_NOLOGIN)||LA21_0==K_NOSUPERUSER||LA21_0==K_NULL||(LA21_0 >= K_ONLY && LA21_0 <= K_OPTIONS)||(LA21_0 >= K_PARTITION && LA21_0 <= K_POSITIVE_NAN)||(LA21_0 >= K_REPLACE && LA21_0 <= K_RETURNS)||(LA21_0 >= K_ROLE && LA21_0 <= K_ROLES)||(LA21_0 >= K_SFUNC && LA21_0 <= K_TINYINT)||(LA21_0 >= K_TOKEN && LA21_0 <= K_TRIGGER)||(LA21_0 >= K_TTL && LA21_0 <= K_TYPES)||LA21_0==K_UNSET||(LA21_0 >= K_USER && LA21_0 <= K_USERS)||(LA21_0 >= K_UUID && LA21_0 <= K_VARINT)||LA21_0==K_WRITETIME||(LA21_0 >= QMARK && LA21_0 <= QUOTED_NAME)||LA21_0==STRING_LITERAL||LA21_0==UUID||LA21_0==199||LA21_0==204||LA21_0==208||LA21_0==215||LA21_0==219) ) {
				alt21=1;
			}
			else if ( (LA21_0==RANGE) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Parser.g:353:9: t1= term ( RANGE (t2= term )? )?
					{
					pushFollow(FOLLOW_term_in_collectionSubSelection1813);
					t1=term();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:353:17: ( RANGE (t2= term )? )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==RANGE) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Parser.g:353:19: RANGE (t2= term )?
							{
							if ( state.backtracking==0 ) { isSlice=true; }
							match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1819); if (state.failed) return s;
							// Parser.g:353:43: (t2= term )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==BOOLEAN||LA19_0==DURATION||LA19_0==FLOAT||LA19_0==HEXNUMBER||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||LA19_0==K_ACCESS||(LA19_0 >= K_AGGREGATE && LA19_0 <= K_ALL)||LA19_0==K_AS||LA19_0==K_ASCII||(LA19_0 >= K_BIGINT && LA19_0 <= K_BOOLEAN)||(LA19_0 >= K_CALLED && LA19_0 <= K_CLUSTERING)||(LA19_0 >= K_COMPACT && LA19_0 <= K_COUNTER)||(LA19_0 >= K_CUSTOM && LA19_0 <= K_DEFAULT)||(LA19_0 >= K_DISTINCT && LA19_0 <= K_DOUBLE)||LA19_0==K_DURATION||(LA19_0 >= K_EXISTS && LA19_0 <= K_FLOAT)||LA19_0==K_FROZEN||(LA19_0 >= K_FUNCTION && LA19_0 <= K_FUNCTIONS)||(LA19_0 >= K_GROUP && LA19_0 <= K_HASHED)||(LA19_0 >= K_INET && LA19_0 <= K_INPUT)||(LA19_0 >= K_INT && LA19_0 <= K_INTERNALS)||(LA19_0 >= K_JSON && LA19_0 <= K_KEYS)||(LA19_0 >= K_KEYSPACES && LA19_0 <= K_LIKE)||(LA19_0 >= K_LIST && LA19_0 <= K_MAP)||(LA19_0 >= K_MAXWRITETIME && LA19_0 <= K_MBEANS)||(LA19_0 >= K_NEGATIVE_INFINITY && LA19_0 <= K_NOLOGIN)||LA19_0==K_NOSUPERUSER||LA19_0==K_NULL||(LA19_0 >= K_ONLY && LA19_0 <= K_OPTIONS)||(LA19_0 >= K_PARTITION && LA19_0 <= K_POSITIVE_NAN)||(LA19_0 >= K_REPLACE && LA19_0 <= K_RETURNS)||(LA19_0 >= K_ROLE && LA19_0 <= K_ROLES)||(LA19_0 >= K_SFUNC && LA19_0 <= K_TINYINT)||(LA19_0 >= K_TOKEN && LA19_0 <= K_TRIGGER)||(LA19_0 >= K_TTL && LA19_0 <= K_TYPES)||LA19_0==K_UNSET||(LA19_0 >= K_USER && LA19_0 <= K_USERS)||(LA19_0 >= K_UUID && LA19_0 <= K_VARINT)||LA19_0==K_WRITETIME||(LA19_0 >= QMARK && LA19_0 <= QUOTED_NAME)||LA19_0==STRING_LITERAL||LA19_0==UUID||LA19_0==199||LA19_0==204||LA19_0==208||LA19_0==215||LA19_0==219) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// Parser.g:353:44: t2= term
									{
									pushFollow(FOLLOW_term_in_collectionSubSelection1824);
									t2=term();
									state._fsp--;
									if (state.failed) return s;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:354:9: RANGE t2= term
					{
					match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1839); if (state.failed) return s;
					if ( state.backtracking==0 ) { isSlice=true; }
					pushFollow(FOLLOW_term_in_collectionSubSelection1845);
					t2=term();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          s = isSlice
			             ? new Selectable.WithSliceSelection.Raw(receiver, t1, t2)
			             : new Selectable.WithElementSelection.Raw(receiver, t1);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "collectionSubSelection"



	// $ANTLR start "selectionGroupWithoutField"
	// Parser.g:362:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );
	public final Selectable.Raw selectionGroupWithoutField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw sn =null;
		Selectable.Raw h =null;
		Selectable.Raw t =null;
		Selectable.Raw l =null;
		Selectable.Raw m =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:365:5: (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet )
			int alt22=5;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// Parser.g:365:7: sn= simpleUnaliasedSelector
					{
					pushFollow(FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1897);
					sn=simpleUnaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=sn; }
					}
					break;
				case 2 :
					// Parser.g:366:7: ( selectionTypeHint )=>h= selectionTypeHint
					{
					pushFollow(FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1915);
					h=selectionTypeHint();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=h; }
					}
					break;
				case 3 :
					// Parser.g:367:7: t= selectionTupleOrNestedSelector
					{
					pushFollow(FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1927);
					t=selectionTupleOrNestedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=t; }
					}
					break;
				case 4 :
					// Parser.g:368:7: l= selectionList
					{
					pushFollow(FOLLOW_selectionList_in_selectionGroupWithoutField1939);
					l=selectionList();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=l; }
					}
					break;
				case 5 :
					// Parser.g:369:7: m= selectionMapOrSet
					{
					pushFollow(FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1951);
					m=selectionMapOrSet();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=m; }
					}
					break;

			}
			if ( state.backtracking==0 ) { s = tmp; }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithoutField"



	// $ANTLR start "selectionTypeHint"
	// Parser.g:373:1: selectionTypeHint returns [Selectable.Raw s] : '(' ct= comparatorType ')' a= selectionGroupWithoutField ;
	public final Selectable.Raw selectionTypeHint() throws RecognitionException {
		Selectable.Raw s = null;


		CQL3Type.Raw ct =null;
		Selectable.Raw a =null;

		try {
			// Parser.g:374:5: ( '(' ct= comparatorType ')' a= selectionGroupWithoutField )
			// Parser.g:374:7: '(' ct= comparatorType ')' a= selectionGroupWithoutField
			{
			match(input,199,FOLLOW_199_in_selectionTypeHint1979); if (state.failed) return s;
			pushFollow(FOLLOW_comparatorType_in_selectionTypeHint1983);
			ct=comparatorType();
			state._fsp--;
			if (state.failed) return s;
			match(input,200,FOLLOW_200_in_selectionTypeHint1985); if (state.failed) return s;
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1989);
			a=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithTypeHint.Raw(ct, a); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTypeHint"



	// $ANTLR start "selectionList"
	// Parser.g:377:1: selectionList returns [Selectable.Raw s] : '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' ;
	public final Selectable.Raw selectionList() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:380:5: ( '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' )
			// Parser.g:380:7: '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']'
			{
			match(input,215,FOLLOW_215_in_selectionList2030); if (state.failed) return s;
			// Parser.g:380:11: (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BOOLEAN||LA24_0==DURATION||LA24_0==FLOAT||LA24_0==HEXNUMBER||(LA24_0 >= IDENT && LA24_0 <= INTEGER)||LA24_0==K_ACCESS||(LA24_0 >= K_AGGREGATE && LA24_0 <= K_ALL)||LA24_0==K_AS||LA24_0==K_ASCII||(LA24_0 >= K_BIGINT && LA24_0 <= K_BOOLEAN)||(LA24_0 >= K_CALLED && LA24_0 <= K_CLUSTERING)||(LA24_0 >= K_COMPACT && LA24_0 <= K_COUNTER)||(LA24_0 >= K_CUSTOM && LA24_0 <= K_DEFAULT)||(LA24_0 >= K_DISTINCT && LA24_0 <= K_DOUBLE)||LA24_0==K_DURATION||(LA24_0 >= K_EXISTS && LA24_0 <= K_FLOAT)||LA24_0==K_FROZEN||(LA24_0 >= K_FUNCTION && LA24_0 <= K_FUNCTIONS)||(LA24_0 >= K_GROUP && LA24_0 <= K_HASHED)||(LA24_0 >= K_INET && LA24_0 <= K_INPUT)||(LA24_0 >= K_INT && LA24_0 <= K_INTERNALS)||(LA24_0 >= K_JSON && LA24_0 <= K_KEYS)||(LA24_0 >= K_KEYSPACES && LA24_0 <= K_LIKE)||(LA24_0 >= K_LIST && LA24_0 <= K_MAP)||(LA24_0 >= K_MAXWRITETIME && LA24_0 <= K_MBEANS)||(LA24_0 >= K_NEGATIVE_INFINITY && LA24_0 <= K_NOLOGIN)||LA24_0==K_NOSUPERUSER||LA24_0==K_NULL||(LA24_0 >= K_ONLY && LA24_0 <= K_OPTIONS)||(LA24_0 >= K_PARTITION && LA24_0 <= K_POSITIVE_NAN)||(LA24_0 >= K_REPLACE && LA24_0 <= K_RETURNS)||(LA24_0 >= K_ROLE && LA24_0 <= K_ROLES)||(LA24_0 >= K_SFUNC && LA24_0 <= K_TINYINT)||(LA24_0 >= K_TOKEN && LA24_0 <= K_TRIGGER)||(LA24_0 >= K_TTL && LA24_0 <= K_TYPES)||LA24_0==K_UNSET||(LA24_0 >= K_USER && LA24_0 <= K_USERS)||(LA24_0 >= K_UUID && LA24_0 <= K_VARINT)||LA24_0==K_WRITETIME||(LA24_0 >= QMARK && LA24_0 <= QUOTED_NAME)||LA24_0==STRING_LITERAL||LA24_0==UUID||LA24_0==199||LA24_0==204||LA24_0==208||LA24_0==215||LA24_0==219) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Parser.g:380:13: t1= unaliasedSelector ( ',' tn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionList2036);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:380:49: ( ',' tn= unaliasedSelector )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==203) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// Parser.g:380:51: ',' tn= unaliasedSelector
							{
							match(input,203,FOLLOW_203_in_selectionList2042); if (state.failed) return s;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionList2046);
							tn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			match(input,217,FOLLOW_217_in_selectionList2056); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.WithList.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionList"



	// $ANTLR start "selectionMapOrSet"
	// Parser.g:383:1: selectionMapOrSet returns [Selectable.Raw s] : ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' );
	public final Selectable.Raw selectionMapOrSet() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw m =null;
		Selectable.Raw st =null;

		try {
			// Parser.g:384:5: ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==219) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==220) ) {
					alt26=2;
				}
				else if ( (LA26_1==BOOLEAN||LA26_1==DURATION||LA26_1==FLOAT||LA26_1==HEXNUMBER||(LA26_1 >= IDENT && LA26_1 <= INTEGER)||LA26_1==K_ACCESS||(LA26_1 >= K_AGGREGATE && LA26_1 <= K_ALL)||LA26_1==K_AS||LA26_1==K_ASCII||(LA26_1 >= K_BIGINT && LA26_1 <= K_BOOLEAN)||(LA26_1 >= K_CALLED && LA26_1 <= K_CLUSTERING)||(LA26_1 >= K_COMPACT && LA26_1 <= K_COUNTER)||(LA26_1 >= K_CUSTOM && LA26_1 <= K_DEFAULT)||(LA26_1 >= K_DISTINCT && LA26_1 <= K_DOUBLE)||LA26_1==K_DURATION||(LA26_1 >= K_EXISTS && LA26_1 <= K_FLOAT)||LA26_1==K_FROZEN||(LA26_1 >= K_FUNCTION && LA26_1 <= K_FUNCTIONS)||(LA26_1 >= K_GROUP && LA26_1 <= K_HASHED)||(LA26_1 >= K_INET && LA26_1 <= K_INPUT)||(LA26_1 >= K_INT && LA26_1 <= K_INTERNALS)||(LA26_1 >= K_JSON && LA26_1 <= K_KEYS)||(LA26_1 >= K_KEYSPACES && LA26_1 <= K_LIKE)||(LA26_1 >= K_LIST && LA26_1 <= K_MAP)||(LA26_1 >= K_MAXWRITETIME && LA26_1 <= K_MBEANS)||(LA26_1 >= K_NEGATIVE_INFINITY && LA26_1 <= K_NOLOGIN)||LA26_1==K_NOSUPERUSER||LA26_1==K_NULL||(LA26_1 >= K_ONLY && LA26_1 <= K_OPTIONS)||(LA26_1 >= K_PARTITION && LA26_1 <= K_POSITIVE_NAN)||(LA26_1 >= K_REPLACE && LA26_1 <= K_RETURNS)||(LA26_1 >= K_ROLE && LA26_1 <= K_ROLES)||(LA26_1 >= K_SFUNC && LA26_1 <= K_TINYINT)||(LA26_1 >= K_TOKEN && LA26_1 <= K_TRIGGER)||(LA26_1 >= K_TTL && LA26_1 <= K_TYPES)||LA26_1==K_UNSET||(LA26_1 >= K_USER && LA26_1 <= K_USERS)||(LA26_1 >= K_UUID && LA26_1 <= K_VARINT)||LA26_1==K_WRITETIME||(LA26_1 >= QMARK && LA26_1 <= QUOTED_NAME)||LA26_1==STRING_LITERAL||LA26_1==UUID||LA26_1==199||LA26_1==204||LA26_1==208||LA26_1==215||LA26_1==219) ) {
					alt26=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// Parser.g:384:7: '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}'
					{
					match(input,219,FOLLOW_219_in_selectionMapOrSet2077); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMapOrSet2081);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:384:32: (m= selectionMap[t1] |st= selectionSet[t1] )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==208) ) {
						alt25=1;
					}
					else if ( (LA25_0==203||LA25_0==220) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// Parser.g:384:34: m= selectionMap[t1]
							{
							pushFollow(FOLLOW_selectionMap_in_selectionMapOrSet2087);
							m=selectionMap(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = m; }
							}
							break;
						case 2 :
							// Parser.g:384:67: st= selectionSet[t1]
							{
							pushFollow(FOLLOW_selectionSet_in_selectionMapOrSet2096);
							st=selectionSet(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = st; }
							}
							break;

					}

					match(input,220,FOLLOW_220_in_selectionMapOrSet2102); if (state.failed) return s;
					}
					break;
				case 2 :
					// Parser.g:385:7: '{' '}'
					{
					match(input,219,FOLLOW_219_in_selectionMapOrSet2110); if (state.failed) return s;
					match(input,220,FOLLOW_220_in_selectionMapOrSet2112); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(Collections.emptyList());}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMapOrSet"



	// $ANTLR start "selectionMap"
	// Parser.g:388:1: selectionMap[Selectable.Raw k1] returns [Selectable.Raw s] : ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* ;
	public final Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw v1 =null;
		Selectable.Raw kn =null;
		Selectable.Raw vn =null;

		 List<Pair<Selectable.Raw, Selectable.Raw>> m = new ArrayList<>(); 
		try {
			// Parser.g:391:7: ( ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* )
			// Parser.g:391:9: ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			{
			match(input,208,FOLLOW_208_in_selectionMap2157); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2161);
			v1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
			// Parser.g:391:68: ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==203) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Parser.g:391:70: ',' kn= unaliasedSelector ':' vn= unaliasedSelector
					{
					match(input,203,FOLLOW_203_in_selectionMap2169); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2173);
					kn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,208,FOLLOW_208_in_selectionMap2175); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2179);
					vn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop27;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithMapOrUdt.Raw(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMap"



	// $ANTLR start "selectionSet"
	// Parser.g:394:1: selectionSet[Selectable.Raw t1] returns [Selectable.Raw s] : ( ',' tn= unaliasedSelector )* ;
	public final Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); l.add(t1); 
		try {
			// Parser.g:397:7: ( ( ',' tn= unaliasedSelector )* )
			// Parser.g:397:9: ( ',' tn= unaliasedSelector )*
			{
			// Parser.g:397:9: ( ',' tn= unaliasedSelector )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==203) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Parser.g:397:11: ',' tn= unaliasedSelector
					{
					match(input,203,FOLLOW_203_in_selectionSet2231); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionSet2235);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop28;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionSet"



	// $ANTLR start "selectionTupleOrNestedSelector"
	// Parser.g:400:1: selectionTupleOrNestedSelector returns [Selectable.Raw s] : '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' ;
	public final Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:403:5: ( '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' )
			// Parser.g:403:7: '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')'
			{
			match(input,199,FOLLOW_199_in_selectionTupleOrNestedSelector2281); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2285);
			t1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:403:47: ( ',' tn= unaliasedSelector )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==203) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Parser.g:403:48: ',' tn= unaliasedSelector
					{
					match(input,203,FOLLOW_203_in_selectionTupleOrNestedSelector2290); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2294);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,200,FOLLOW_200_in_selectionTupleOrNestedSelector2301); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.BetweenParenthesesOrWithTuple.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTupleOrNestedSelector"



	// $ANTLR start "simpleUnaliasedSelector"
	// Parser.g:410:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );
	public final Selectable.Raw simpleUnaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.RawIdentifier c =null;
		Term.Raw l =null;
		Selectable.Raw f =null;

		try {
			// Parser.g:411:5: (c= sident |l= selectionLiteral |f= selectionFunction )
			int alt30=3;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// Parser.g:411:7: c= sident
					{
					pushFollow(FOLLOW_sident_in_simpleUnaliasedSelector2326);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = c; }
					}
					break;
				case 2 :
					// Parser.g:412:7: l= selectionLiteral
					{
					pushFollow(FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2372);
					l=selectionLiteral();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithTerm.Raw(l); }
					}
					break;
				case 3 :
					// Parser.g:413:7: f= selectionFunction
					{
					pushFollow(FOLLOW_selectionFunction_in_simpleUnaliasedSelector2408);
					f=selectionFunction();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = f; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "simpleUnaliasedSelector"



	// $ANTLR start "selectionFunction"
	// Parser.g:416:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_MAXWRITETIME '(' c= sident m= selectorModifier[c] ')' | K_WRITETIME '(' c= sident m= selectorModifier[c] ')' | K_TTL '(' c= sident m= selectorModifier[c] ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );
	public final Selectable.Raw selectionFunction() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.RawIdentifier c =null;
		Selectable.Raw m =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;

		try {
			// Parser.g:417:5: ( K_COUNT '(' '\\*' ')' | K_MAXWRITETIME '(' c= sident m= selectorModifier[c] ')' | K_WRITETIME '(' c= sident m= selectorModifier[c] ')' | K_TTL '(' c= sident m= selectorModifier[c] ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt31=6;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// Parser.g:417:7: K_COUNT '(' '\\*' ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_selectionFunction2454); if (state.failed) return s;
					match(input,199,FOLLOW_199_in_selectionFunction2463); if (state.failed) return s;
					match(input,216,FOLLOW_216_in_selectionFunction2465); if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2467); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = Selectable.WithFunction.Raw.newCountRowsFunction(); }
					}
					break;
				case 2 :
					// Parser.g:418:7: K_MAXWRITETIME '(' c= sident m= selectorModifier[c] ')'
					{
					match(input,K_MAXWRITETIME,FOLLOW_K_MAXWRITETIME_in_selectionFunction2512); if (state.failed) return s;
					match(input,199,FOLLOW_199_in_selectionFunction2514); if (state.failed) return s;
					pushFollow(FOLLOW_sident_in_selectionFunction2518);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectionFunction2522);
					m=selectorModifier(c);
					state._fsp--;
					if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2525); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, m, Selectable.WritetimeOrTTL.Kind.MAX_WRITE_TIME); }
					}
					break;
				case 3 :
					// Parser.g:419:7: K_WRITETIME '(' c= sident m= selectorModifier[c] ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_selectionFunction2544); if (state.failed) return s;
					match(input,199,FOLLOW_199_in_selectionFunction2549); if (state.failed) return s;
					pushFollow(FOLLOW_sident_in_selectionFunction2553);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectionFunction2557);
					m=selectorModifier(c);
					state._fsp--;
					if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2560); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, m, Selectable.WritetimeOrTTL.Kind.WRITE_TIME); }
					}
					break;
				case 4 :
					// Parser.g:420:7: K_TTL '(' c= sident m= selectorModifier[c] ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_selectionFunction2579); if (state.failed) return s;
					match(input,199,FOLLOW_199_in_selectionFunction2590); if (state.failed) return s;
					pushFollow(FOLLOW_sident_in_selectionFunction2594);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectionFunction2598);
					m=selectorModifier(c);
					state._fsp--;
					if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2601); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, m, Selectable.WritetimeOrTTL.Kind.TTL); }
					}
					break;
				case 5 :
					// Parser.g:421:7: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_selectionFunction2620); if (state.failed) return s;
					match(input,199,FOLLOW_199_in_selectionFunction2630); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunction2634);
					sn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,K_AS,FOLLOW_K_AS_in_selectionFunction2636); if (state.failed) return s;
					pushFollow(FOLLOW_native_type_in_selectionFunction2640);
					t=native_type();
					state._fsp--;
					if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2642); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithCast.Raw(sn, t);}
					}
					break;
				case 6 :
					// Parser.g:422:7: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_selectionFunction2654);
					f=functionName();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectionFunctionArgs_in_selectionFunction2658);
					args=selectionFunctionArgs();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithFunction.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionFunction"



	// $ANTLR start "selectionLiteral"
	// Parser.g:425:1: selectionLiteral returns [Term.Raw value] : (c= constant | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw selectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:426:5: (c= constant | K_NULL | ':' id= noncol_ident | QMARK )
			int alt32=4;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case DURATION:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
			case STRING_LITERAL:
			case UUID:
				{
				alt32=1;
				}
				break;
			case K_NULL:
				{
				alt32=2;
				}
				break;
			case 208:
				{
				alt32=3;
				}
				break;
			case QMARK:
				{
				alt32=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Parser.g:426:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_selectionLiteral2704);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:427:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_selectionLiteral2734); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 3 :
					// Parser.g:428:7: ':' id= noncol_ident
					{
					match(input,208,FOLLOW_208_in_selectionLiteral2768); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_selectionLiteral2772);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 4 :
					// Parser.g:429:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_selectionLiteral2793); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "selectionLiteral"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:432:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' ;
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		 a = new ArrayList<>(); 
		try {
			// Parser.g:434:5: ( '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' )
			// Parser.g:434:7: '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')'
			{
			match(input,199,FOLLOW_199_in_selectionFunctionArgs2849); if (state.failed) return a;
			// Parser.g:434:11: (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==BOOLEAN||LA34_0==DURATION||LA34_0==FLOAT||LA34_0==HEXNUMBER||(LA34_0 >= IDENT && LA34_0 <= INTEGER)||LA34_0==K_ACCESS||(LA34_0 >= K_AGGREGATE && LA34_0 <= K_ALL)||LA34_0==K_AS||LA34_0==K_ASCII||(LA34_0 >= K_BIGINT && LA34_0 <= K_BOOLEAN)||(LA34_0 >= K_CALLED && LA34_0 <= K_CLUSTERING)||(LA34_0 >= K_COMPACT && LA34_0 <= K_COUNTER)||(LA34_0 >= K_CUSTOM && LA34_0 <= K_DEFAULT)||(LA34_0 >= K_DISTINCT && LA34_0 <= K_DOUBLE)||LA34_0==K_DURATION||(LA34_0 >= K_EXISTS && LA34_0 <= K_FLOAT)||LA34_0==K_FROZEN||(LA34_0 >= K_FUNCTION && LA34_0 <= K_FUNCTIONS)||(LA34_0 >= K_GROUP && LA34_0 <= K_HASHED)||(LA34_0 >= K_INET && LA34_0 <= K_INPUT)||(LA34_0 >= K_INT && LA34_0 <= K_INTERNALS)||(LA34_0 >= K_JSON && LA34_0 <= K_KEYS)||(LA34_0 >= K_KEYSPACES && LA34_0 <= K_LIKE)||(LA34_0 >= K_LIST && LA34_0 <= K_MAP)||(LA34_0 >= K_MAXWRITETIME && LA34_0 <= K_MBEANS)||(LA34_0 >= K_NEGATIVE_INFINITY && LA34_0 <= K_NOLOGIN)||LA34_0==K_NOSUPERUSER||LA34_0==K_NULL||(LA34_0 >= K_ONLY && LA34_0 <= K_OPTIONS)||(LA34_0 >= K_PARTITION && LA34_0 <= K_POSITIVE_NAN)||(LA34_0 >= K_REPLACE && LA34_0 <= K_RETURNS)||(LA34_0 >= K_ROLE && LA34_0 <= K_ROLES)||(LA34_0 >= K_SFUNC && LA34_0 <= K_TINYINT)||(LA34_0 >= K_TOKEN && LA34_0 <= K_TRIGGER)||(LA34_0 >= K_TTL && LA34_0 <= K_TYPES)||LA34_0==K_UNSET||(LA34_0 >= K_USER && LA34_0 <= K_USERS)||(LA34_0 >= K_UUID && LA34_0 <= K_VARINT)||LA34_0==K_WRITETIME||(LA34_0 >= QMARK && LA34_0 <= QUOTED_NAME)||LA34_0==STRING_LITERAL||LA34_0==UUID||LA34_0==199||LA34_0==204||LA34_0==208||LA34_0==215||LA34_0==219) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Parser.g:434:12: s1= unaliasedSelector ( ',' sn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2854);
					s1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return a;
					if ( state.backtracking==0 ) { a.add(s1); }
					// Parser.g:435:11: ( ',' sn= unaliasedSelector )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==203) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// Parser.g:435:13: ',' sn= unaliasedSelector
							{
							match(input,203,FOLLOW_203_in_selectionFunctionArgs2870); if (state.failed) return a;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2874);
							sn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return a;
							if ( state.backtracking==0 ) { a.add(sn); }
							}
							break;

						default :
							break loop33;
						}
					}

					}
					break;

			}

			match(input,200,FOLLOW_200_in_selectionFunctionArgs2889); if (state.failed) return a;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "sident"
	// Parser.g:439:1: sident returns [Selectable.RawIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final Selectable.RawIdentifier sident() throws RecognitionException {
		Selectable.RawIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:440:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt35=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt35=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt35=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt35=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Parser.g:440:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_sident2912); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:441:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_sident2937); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:442:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_sident2956);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "sident"



	// $ANTLR start "whereClause"
	// Parser.g:445:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:447:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:447:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause2987);
			relationOrExpression(clause);
			state._fsp--;
			if (state.failed) return clause;
			// Parser.g:447:37: ( K_AND relationOrExpression[$clause] )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==K_AND) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Parser.g:447:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause2991); if (state.failed) return clause;
					pushFollow(FOLLOW_relationOrExpression_in_whereClause2993);
					relationOrExpression(clause);
					state._fsp--;
					if (state.failed) return clause;
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:450:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:451:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EMPTY_QUOTED_NAME||LA37_0==IDENT||LA37_0==K_ACCESS||(LA37_0 >= K_AGGREGATE && LA37_0 <= K_ALL)||LA37_0==K_AS||LA37_0==K_ASCII||(LA37_0 >= K_BIGINT && LA37_0 <= K_BOOLEAN)||(LA37_0 >= K_CALLED && LA37_0 <= K_CLUSTERING)||(LA37_0 >= K_COMPACT && LA37_0 <= K_COUNTER)||(LA37_0 >= K_CUSTOM && LA37_0 <= K_DEFAULT)||(LA37_0 >= K_DISTINCT && LA37_0 <= K_DOUBLE)||LA37_0==K_DURATION||(LA37_0 >= K_EXISTS && LA37_0 <= K_FLOAT)||LA37_0==K_FROZEN||(LA37_0 >= K_FUNCTION && LA37_0 <= K_FUNCTIONS)||(LA37_0 >= K_GROUP && LA37_0 <= K_HASHED)||(LA37_0 >= K_INET && LA37_0 <= K_INPUT)||(LA37_0 >= K_INT && LA37_0 <= K_INTERNALS)||(LA37_0 >= K_JSON && LA37_0 <= K_KEYS)||(LA37_0 >= K_KEYSPACES && LA37_0 <= K_LIKE)||(LA37_0 >= K_LIST && LA37_0 <= K_MAP)||(LA37_0 >= K_MAXWRITETIME && LA37_0 <= K_MBEANS)||LA37_0==K_NOLOGIN||LA37_0==K_NOSUPERUSER||(LA37_0 >= K_ONLY && LA37_0 <= K_OPTIONS)||(LA37_0 >= K_PARTITION && LA37_0 <= K_PERMISSIONS)||(LA37_0 >= K_REPLACE && LA37_0 <= K_RETURNS)||(LA37_0 >= K_ROLE && LA37_0 <= K_ROLES)||(LA37_0 >= K_SFUNC && LA37_0 <= K_TINYINT)||(LA37_0 >= K_TOKEN && LA37_0 <= K_TRIGGER)||(LA37_0 >= K_TTL && LA37_0 <= K_TYPES)||LA37_0==K_UNSET||(LA37_0 >= K_USER && LA37_0 <= K_USERS)||(LA37_0 >= K_UUID && LA37_0 <= K_VARINT)||LA37_0==K_WRITETIME||LA37_0==QUOTED_NAME||LA37_0==199) ) {
				alt37=1;
			}
			else if ( (LA37_0==218) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Parser.g:451:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression3015);
					relation(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:452:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression3024);
					customIndexExpression(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:455:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		QualifiedName name = new QualifiedName();
		try {
			// Parser.g:457:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:457:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,218,FOLLOW_218_in_customIndexExpression3052); if (state.failed) return;
			pushFollow(FOLLOW_idxName_in_customIndexExpression3054);
			idxName(name);
			state._fsp--;
			if (state.failed) return;
			match(input,203,FOLLOW_203_in_customIndexExpression3057); if (state.failed) return;
			pushFollow(FOLLOW_term_in_customIndexExpression3061);
			t=term();
			state._fsp--;
			if (state.failed) return;
			match(input,200,FOLLOW_200_in_customIndexExpression3063); if (state.failed) return;
			if ( state.backtracking==0 ) { clause.add(new CustomIndexExpression(name, t));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:460:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
		ColumnIdentifier c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:464:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:464:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause3093);
			c=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:464:16: ( K_ASC | K_DESC )?
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==K_ASC) ) {
				alt38=1;
			}
			else if ( (LA38_0==K_DESC) ) {
				alt38=2;
			}
			switch (alt38) {
				case 1 :
					// Parser.g:464:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause3096); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:464:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause3100); if (state.failed) return;
					if ( state.backtracking==0 ) { reversed = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { orderings.put(c, reversed); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "groupByClause"
	// Parser.g:467:1: groupByClause[List<Selectable.Raw> groups] : s= unaliasedSelector ;
	public final void groupByClause(List<Selectable.Raw> groups) throws RecognitionException {
		Selectable.Raw s =null;

		try {
			// Parser.g:468:5: (s= unaliasedSelector )
			// Parser.g:468:7: s= unaliasedSelector
			{
			pushFollow(FOLLOW_unaliasedSelector_in_groupByClause3126);
			s=unaliasedSelector();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { groups.add(s); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:477:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		QualifiedName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:478:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:478:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement3151); if (state.failed) return expr;
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement3153); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement3157);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:479:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==199) ) {
				alt39=1;
			}
			else if ( (LA39_0==K_JSON) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Parser.g:479:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement3171);
					st1=normalInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st1; }
					}
					break;
				case 2 :
					// Parser.g:480:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement3186); if (state.failed) return expr;
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement3190);
					st2=jsonInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st2; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:483:1: normalInsertStatement[QualifiedName qn] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(QualifiedName qn) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnIdentifier c1 =null;
		ColumnIdentifier cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnIdentifier> columnNames  = new ArrayList<>();
		        List<Term.Raw> values = new ArrayList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:490:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:490:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,199,FOLLOW_199_in_normalInsertStatement3226); if (state.failed) return expr;
			pushFollow(FOLLOW_cident_in_normalInsertStatement3230);
			c1=cident();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { columnNames.add(c1); }
			// Parser.g:490:47: ( ',' cn= cident )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==203) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Parser.g:490:49: ',' cn= cident
					{
					match(input,203,FOLLOW_203_in_normalInsertStatement3237); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_normalInsertStatement3241);
					cn=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnNames.add(cn); }
					}
					break;

				default :
					break loop40;
				}
			}

			match(input,200,FOLLOW_200_in_normalInsertStatement3248); if (state.failed) return expr;
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement3256); if (state.failed) return expr;
			match(input,199,FOLLOW_199_in_normalInsertStatement3264); if (state.failed) return expr;
			pushFollow(FOLLOW_term_in_normalInsertStatement3268);
			v1=term();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { values.add(v1); }
			// Parser.g:492:39: ( ',' vn= term )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==203) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Parser.g:492:41: ',' vn= term
					{
					match(input,203,FOLLOW_203_in_normalInsertStatement3274); if (state.failed) return expr;
					pushFollow(FOLLOW_term_in_normalInsertStatement3278);
					vn=term();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { values.add(vn); }
					}
					break;

				default :
					break loop41;
				}
			}

			match(input,200,FOLLOW_200_in_normalInsertStatement3285); if (state.failed) return expr;
			// Parser.g:493:7: ( K_IF K_NOT K_EXISTS )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_IF) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:493:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement3295); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement3297); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement3299); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:494:7: ( usingClause[attrs] )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==K_USING) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Parser.g:494:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement3314);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsert(qn, attrs, columnNames, values, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:500:1: jsonInsertStatement[QualifiedName qn] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(QualifiedName qn) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		        boolean defaultUnset = false;
		    
		try {
			// Parser.g:506:5: (val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:506:7: val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement3360);
			val=jsonValue();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:507:7: ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==K_DEFAULT) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Parser.g:507:9: K_DEFAULT ( K_NULL | ( K_UNSET ) )
					{
					match(input,K_DEFAULT,FOLLOW_K_DEFAULT_in_jsonInsertStatement3370); if (state.failed) return expr;
					// Parser.g:507:19: ( K_NULL | ( K_UNSET ) )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==K_NULL) ) {
						alt44=1;
					}
					else if ( (LA44_0==K_UNSET) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// Parser.g:507:21: K_NULL
							{
							match(input,K_NULL,FOLLOW_K_NULL_in_jsonInsertStatement3374); if (state.failed) return expr;
							}
							break;
						case 2 :
							// Parser.g:507:30: ( K_UNSET )
							{
							// Parser.g:507:30: ( K_UNSET )
							// Parser.g:507:32: K_UNSET
							{
							if ( state.backtracking==0 ) { defaultUnset = true; }
							match(input,K_UNSET,FOLLOW_K_UNSET_in_jsonInsertStatement3382); if (state.failed) return expr;
							}

							}
							break;

					}

					}
					break;

			}

			// Parser.g:508:7: ( K_IF K_NOT K_EXISTS )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_IF) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:508:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement3398); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement3400); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement3402); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:509:7: ( usingClause[attrs] )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Parser.g:509:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement3417);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsertJson(qn, attrs, val, defaultUnset, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:515:1: jsonValue returns [Json.Raw value] : (s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:516:5: (s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt48=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt48=1;
				}
				break;
			case 208:
				{
				alt48=2;
				}
				break;
			case QMARK:
				{
				alt48=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// Parser.g:516:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue3452); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Json.Literal((s!=null?s.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:517:7: ':' id= noncol_ident
					{
					match(input,208,FOLLOW_208_in_jsonValue3462); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_jsonValue3466);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:518:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue3480); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:521:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:522:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:522:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause3511); if (state.failed) return;
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause3513);
			usingClauseObjective(attrs);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:522:43: ( K_AND usingClauseObjective[attrs] )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==K_AND) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Parser.g:522:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause3518); if (state.failed) return;
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause3520);
					usingClauseObjective(attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:525:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:526:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_TIMESTAMP) ) {
				alt50=1;
			}
			else if ( (LA50_0==K_TTL) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// Parser.g:526:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective3542); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3546);
					ts=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timestamp = ts; }
					}
					break;
				case 2 :
					// Parser.g:527:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective3556); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3560);
					t=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timeToLive = t; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:537:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:543:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:543:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement3594); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement3598);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:544:7: ( usingClause[attrs] )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_USING) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:544:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement3608);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement3620); if (state.failed) return expr;
			pushFollow(FOLLOW_columnOperation_in_updateStatement3622);
			columnOperation(operations);
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:545:41: ( ',' columnOperation[operations] )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==203) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Parser.g:545:42: ',' columnOperation[operations]
					{
					match(input,203,FOLLOW_203_in_updateStatement3626); if (state.failed) return expr;
					pushFollow(FOLLOW_columnOperation_in_updateStatement3628);
					columnOperation(operations);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

				default :
					break loop52;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement3639); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_updateStatement3643);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:547:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==K_IF) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Parser.g:547:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement3653); if (state.failed) return expr;
					// Parser.g:547:14: ( K_EXISTS |conditions= updateConditions )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==K_EXISTS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==EOF||LA53_1==K_APPLY||LA53_1==K_DELETE||LA53_1==K_INSERT||LA53_1==K_UPDATE||LA53_1==209) ) {
							alt53=1;
						}
						else if ( (LA53_1==K_CONTAINS||LA53_1==K_IN||LA53_1==197||LA53_1==206||(LA53_1 >= 210 && LA53_1 <= 215)) ) {
							alt53=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA53_0==EMPTY_QUOTED_NAME||LA53_0==IDENT||LA53_0==K_ACCESS||(LA53_0 >= K_AGGREGATE && LA53_0 <= K_ALL)||LA53_0==K_AS||LA53_0==K_ASCII||(LA53_0 >= K_BIGINT && LA53_0 <= K_BOOLEAN)||(LA53_0 >= K_CALLED && LA53_0 <= K_CLUSTERING)||(LA53_0 >= K_COMPACT && LA53_0 <= K_COUNTER)||(LA53_0 >= K_CUSTOM && LA53_0 <= K_DEFAULT)||(LA53_0 >= K_DISTINCT && LA53_0 <= K_DOUBLE)||LA53_0==K_DURATION||(LA53_0 >= K_FILTERING && LA53_0 <= K_FLOAT)||LA53_0==K_FROZEN||(LA53_0 >= K_FUNCTION && LA53_0 <= K_FUNCTIONS)||(LA53_0 >= K_GROUP && LA53_0 <= K_HASHED)||(LA53_0 >= K_INET && LA53_0 <= K_INPUT)||(LA53_0 >= K_INT && LA53_0 <= K_INTERNALS)||(LA53_0 >= K_JSON && LA53_0 <= K_KEYS)||(LA53_0 >= K_KEYSPACES && LA53_0 <= K_LIKE)||(LA53_0 >= K_LIST && LA53_0 <= K_MAP)||(LA53_0 >= K_MAXWRITETIME && LA53_0 <= K_MBEANS)||LA53_0==K_NOLOGIN||LA53_0==K_NOSUPERUSER||(LA53_0 >= K_ONLY && LA53_0 <= K_OPTIONS)||(LA53_0 >= K_PARTITION && LA53_0 <= K_PERMISSIONS)||(LA53_0 >= K_REPLACE && LA53_0 <= K_RETURNS)||(LA53_0 >= K_ROLE && LA53_0 <= K_ROLES)||(LA53_0 >= K_SFUNC && LA53_0 <= K_TINYINT)||LA53_0==K_TRIGGER||(LA53_0 >= K_TTL && LA53_0 <= K_TYPES)||LA53_0==K_UNSET||(LA53_0 >= K_USER && LA53_0 <= K_USERS)||(LA53_0 >= K_UUID && LA53_0 <= K_VARINT)||LA53_0==K_WRITETIME||LA53_0==QUOTED_NAME) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// Parser.g:547:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement3657); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:547:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement3665);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedUpdate(cf,
			                                                   attrs,
			                                                   operations,
			                                                   wclause.build(),
			                                                   conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
			                                                   ifExists);
			     }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:558:1: updateConditions returns [List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnIdentifier, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:560:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:560:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions3707);
			columnCondition(conditions);
			state._fsp--;
			if (state.failed) return conditions;
			// Parser.g:560:35: ( K_AND columnCondition[conditions] )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==K_AND) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// Parser.g:560:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions3712); if (state.failed) return conditions;
					pushFollow(FOLLOW_columnCondition_in_updateConditions3714);
					columnCondition(conditions);
					state._fsp--;
					if (state.failed) return conditions;
					}
					break;

				default :
					break loop55;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:571:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:577:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:577:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement3751); if (state.failed) return expr;
			// Parser.g:577:16: (dels= deleteSelection )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==EMPTY_QUOTED_NAME||LA56_0==IDENT||LA56_0==K_ACCESS||(LA56_0 >= K_AGGREGATE && LA56_0 <= K_ALL)||LA56_0==K_AS||LA56_0==K_ASCII||(LA56_0 >= K_BIGINT && LA56_0 <= K_BOOLEAN)||(LA56_0 >= K_CALLED && LA56_0 <= K_CLUSTERING)||(LA56_0 >= K_COMPACT && LA56_0 <= K_COUNTER)||(LA56_0 >= K_CUSTOM && LA56_0 <= K_DEFAULT)||(LA56_0 >= K_DISTINCT && LA56_0 <= K_DOUBLE)||LA56_0==K_DURATION||(LA56_0 >= K_EXISTS && LA56_0 <= K_FLOAT)||LA56_0==K_FROZEN||(LA56_0 >= K_FUNCTION && LA56_0 <= K_FUNCTIONS)||(LA56_0 >= K_GROUP && LA56_0 <= K_HASHED)||(LA56_0 >= K_INET && LA56_0 <= K_INPUT)||(LA56_0 >= K_INT && LA56_0 <= K_INTERNALS)||(LA56_0 >= K_JSON && LA56_0 <= K_KEYS)||(LA56_0 >= K_KEYSPACES && LA56_0 <= K_LIKE)||(LA56_0 >= K_LIST && LA56_0 <= K_MAP)||(LA56_0 >= K_MAXWRITETIME && LA56_0 <= K_MBEANS)||LA56_0==K_NOLOGIN||LA56_0==K_NOSUPERUSER||(LA56_0 >= K_ONLY && LA56_0 <= K_OPTIONS)||(LA56_0 >= K_PARTITION && LA56_0 <= K_PERMISSIONS)||(LA56_0 >= K_REPLACE && LA56_0 <= K_RETURNS)||(LA56_0 >= K_ROLE && LA56_0 <= K_ROLES)||(LA56_0 >= K_SFUNC && LA56_0 <= K_TINYINT)||LA56_0==K_TRIGGER||(LA56_0 >= K_TTL && LA56_0 <= K_TYPES)||LA56_0==K_UNSET||(LA56_0 >= K_USER && LA56_0 <= K_USERS)||(LA56_0 >= K_UUID && LA56_0 <= K_VARINT)||LA56_0==K_WRITETIME||LA56_0==QUOTED_NAME) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:577:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement3757);
					dels=deleteSelection();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnDeletions = dels; }
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement3770); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement3774);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:579:7: ( usingClauseDelete[attrs] )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_USING) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Parser.g:579:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement3784);
					usingClauseDelete(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement3796); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_deleteStatement3800);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:581:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==K_IF) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// Parser.g:581:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement3810); if (state.failed) return expr;
					// Parser.g:581:14: ( K_EXISTS |conditions= updateConditions )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==K_EXISTS) ) {
						int LA58_1 = input.LA(2);
						if ( (LA58_1==EOF||LA58_1==K_APPLY||LA58_1==K_DELETE||LA58_1==K_INSERT||LA58_1==K_UPDATE||LA58_1==209) ) {
							alt58=1;
						}
						else if ( (LA58_1==K_CONTAINS||LA58_1==K_IN||LA58_1==197||LA58_1==206||(LA58_1 >= 210 && LA58_1 <= 215)) ) {
							alt58=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA58_0==EMPTY_QUOTED_NAME||LA58_0==IDENT||LA58_0==K_ACCESS||(LA58_0 >= K_AGGREGATE && LA58_0 <= K_ALL)||LA58_0==K_AS||LA58_0==K_ASCII||(LA58_0 >= K_BIGINT && LA58_0 <= K_BOOLEAN)||(LA58_0 >= K_CALLED && LA58_0 <= K_CLUSTERING)||(LA58_0 >= K_COMPACT && LA58_0 <= K_COUNTER)||(LA58_0 >= K_CUSTOM && LA58_0 <= K_DEFAULT)||(LA58_0 >= K_DISTINCT && LA58_0 <= K_DOUBLE)||LA58_0==K_DURATION||(LA58_0 >= K_FILTERING && LA58_0 <= K_FLOAT)||LA58_0==K_FROZEN||(LA58_0 >= K_FUNCTION && LA58_0 <= K_FUNCTIONS)||(LA58_0 >= K_GROUP && LA58_0 <= K_HASHED)||(LA58_0 >= K_INET && LA58_0 <= K_INPUT)||(LA58_0 >= K_INT && LA58_0 <= K_INTERNALS)||(LA58_0 >= K_JSON && LA58_0 <= K_KEYS)||(LA58_0 >= K_KEYSPACES && LA58_0 <= K_LIKE)||(LA58_0 >= K_LIST && LA58_0 <= K_MAP)||(LA58_0 >= K_MAXWRITETIME && LA58_0 <= K_MBEANS)||LA58_0==K_NOLOGIN||LA58_0==K_NOSUPERUSER||(LA58_0 >= K_ONLY && LA58_0 <= K_OPTIONS)||(LA58_0 >= K_PARTITION && LA58_0 <= K_PERMISSIONS)||(LA58_0 >= K_REPLACE && LA58_0 <= K_RETURNS)||(LA58_0 >= K_ROLE && LA58_0 <= K_ROLES)||(LA58_0 >= K_SFUNC && LA58_0 <= K_TINYINT)||LA58_0==K_TRIGGER||(LA58_0 >= K_TTL && LA58_0 <= K_TYPES)||LA58_0==K_UNSET||(LA58_0 >= K_USER && LA58_0 <= K_USERS)||(LA58_0 >= K_UUID && LA58_0 <= K_VARINT)||LA58_0==K_WRITETIME||LA58_0==QUOTED_NAME) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// Parser.g:581:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement3814); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:581:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement3822);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new DeleteStatement.Parsed(cf,
			                                             attrs,
			                                             columnDeletions,
			                                             wclause.build(),
			                                             conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
			                                             ifExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:592:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:593:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:593:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			if ( state.backtracking==0 ) { operations = new ArrayList<Operation.RawDeletion>(); }
			pushFollow(FOLLOW_deleteOp_in_deleteSelection3869);
			t1=deleteOp();
			state._fsp--;
			if (state.failed) return operations;
			if ( state.backtracking==0 ) { operations.add(t1); }
			// Parser.g:595:11: ( ',' tN= deleteOp )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==203) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// Parser.g:595:12: ',' tN= deleteOp
					{
					match(input,203,FOLLOW_203_in_deleteSelection3884); if (state.failed) return operations;
					pushFollow(FOLLOW_deleteOp_in_deleteSelection3888);
					tN=deleteOp();
					state._fsp--;
					if (state.failed) return operations;
					if ( state.backtracking==0 ) { operations.add(tN); }
					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:598:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnIdentifier c =null;
		Term.Raw t =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:599:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident )
			int alt61=3;
			alt61 = dfa61.predict(input);
			switch (alt61) {
				case 1 :
					// Parser.g:599:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3915);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ColumnDeletion(c); }
					}
					break;
				case 2 :
					// Parser.g:600:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp3942);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,215,FOLLOW_215_in_deleteOp3944); if (state.failed) return op;
					pushFollow(FOLLOW_term_in_deleteOp3948);
					t=term();
					state._fsp--;
					if (state.failed) return op;
					match(input,217,FOLLOW_217_in_deleteOp3950); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ElementDeletion(c, t); }
					}
					break;
				case 3 :
					// Parser.g:601:7: c= cident '.' field= fident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3962);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,206,FOLLOW_206_in_deleteOp3964); if (state.failed) return op;
					pushFollow(FOLLOW_fident_in_deleteOp3968);
					field=fident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.FieldDeletion(c, field); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:604:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:605:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:605:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete3988); if (state.failed) return;
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete3990); if (state.failed) return;
			pushFollow(FOLLOW_intValue_in_usingClauseDelete3994);
			ts=intValue();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { attrs.timestamp = ts; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:632:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:638:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:638:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement4028); if (state.failed) return expr;
			// Parser.g:639:7: ( K_UNLOGGED | K_COUNTER )?
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_UNLOGGED) ) {
				alt62=1;
			}
			else if ( (LA62_0==K_COUNTER) ) {
				alt62=2;
			}
			switch (alt62) {
				case 1 :
					// Parser.g:639:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement4038); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.UNLOGGED; }
					}
					break;
				case 2 :
					// Parser.g:639:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement4044); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.COUNTER; }
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement4057); if (state.failed) return expr;
			// Parser.g:640:15: ( usingClause[attrs] )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==K_USING) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Parser.g:640:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement4061);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:641:11: (s= batchStatementObjective ( ';' )? )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==K_DELETE||LA65_0==K_INSERT||LA65_0==K_UPDATE) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// Parser.g:641:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement4081);
					s=batchStatementObjective();
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:641:39: ( ';' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==209) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Parser.g:641:39: ';'
							{
							match(input,209,FOLLOW_209_in_batchStatement4083); if (state.failed) return expr;
							}
							break;

					}

					if ( state.backtracking==0 ) { statements.add(s); }
					}
					break;

				default :
					break loop65;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement4097); if (state.failed) return expr;
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement4099); if (state.failed) return expr;
			if ( state.backtracking==0 ) {
			          expr = new BatchStatement.Parsed(type, attrs, statements);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:648:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:649:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt66=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt66=1;
				}
				break;
			case K_UPDATE:
				{
				alt66=2;
				}
				break;
			case K_DELETE:
				{
				alt66=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return statement;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Parser.g:649:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective4130);
					i=insertStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = i; }
					}
					break;
				case 2 :
					// Parser.g:650:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective4143);
					u=updateStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = u; }
					}
					break;
				case 3 :
					// Parser.g:651:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective4156);
					d=deleteStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = d; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:654:1: createAggregateStatement returns [CreateAggregateStatement.Raw stmt] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement.Raw createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		    
		try {
			// Parser.g:661:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:661:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement4189); if (state.failed) return stmt;
			// Parser.g:661:16: ( K_OR K_REPLACE )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==K_OR) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Parser.g:661:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement4192); if (state.failed) return stmt;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement4194); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement4206); if (state.failed) return stmt;
			// Parser.g:663:7: ( K_IF K_NOT K_EXISTS )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==K_IF) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Parser.g:663:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement4215); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement4217); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement4219); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement4233);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,199,FOLLOW_199_in_createAggregateStatement4241); if (state.failed) return stmt;
			// Parser.g:666:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==IDENT||LA70_0==K_ACCESS||(LA70_0 >= K_AGGREGATE && LA70_0 <= K_ALL)||LA70_0==K_AS||LA70_0==K_ASCII||(LA70_0 >= K_BIGINT && LA70_0 <= K_BOOLEAN)||(LA70_0 >= K_CALLED && LA70_0 <= K_CLUSTERING)||(LA70_0 >= K_COMPACT && LA70_0 <= K_COUNTER)||(LA70_0 >= K_CUSTOM && LA70_0 <= K_DEFAULT)||(LA70_0 >= K_DISTINCT && LA70_0 <= K_DOUBLE)||LA70_0==K_DURATION||(LA70_0 >= K_EXISTS && LA70_0 <= K_FLOAT)||LA70_0==K_FROZEN||(LA70_0 >= K_FUNCTION && LA70_0 <= K_FUNCTIONS)||(LA70_0 >= K_GROUP && LA70_0 <= K_HASHED)||(LA70_0 >= K_INET && LA70_0 <= K_INPUT)||(LA70_0 >= K_INT && LA70_0 <= K_INTERNALS)||(LA70_0 >= K_JSON && LA70_0 <= K_KEYS)||(LA70_0 >= K_KEYSPACES && LA70_0 <= K_LIKE)||(LA70_0 >= K_LIST && LA70_0 <= K_MAP)||(LA70_0 >= K_MAXWRITETIME && LA70_0 <= K_MBEANS)||LA70_0==K_NOLOGIN||LA70_0==K_NOSUPERUSER||(LA70_0 >= K_ONLY && LA70_0 <= K_OPTIONS)||(LA70_0 >= K_PARTITION && LA70_0 <= K_PERMISSIONS)||(LA70_0 >= K_REPLACE && LA70_0 <= K_RETURNS)||(LA70_0 >= K_ROLE && LA70_0 <= K_ROLES)||(LA70_0 >= K_SET && LA70_0 <= K_TINYINT)||LA70_0==K_TRIGGER||(LA70_0 >= K_TTL && LA70_0 <= K_TYPES)||LA70_0==K_UNSET||(LA70_0 >= K_USER && LA70_0 <= K_USERS)||(LA70_0 >= K_UUID && LA70_0 <= K_VARINT)||LA70_0==K_WRITETIME||LA70_0==QUOTED_NAME||LA70_0==STRING_LITERAL) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Parser.g:667:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4265);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argTypes.add(v); }
					// Parser.g:668:11: ( ',' v= comparatorType )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==203) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// Parser.g:668:13: ',' v= comparatorType
							{
							match(input,203,FOLLOW_203_in_createAggregateStatement4281); if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4285);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;

			}

			match(input,200,FOLLOW_200_in_createAggregateStatement4309); if (state.failed) return stmt;
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement4317); if (state.failed) return stmt;
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4323);
			sfunc=allowedFunctionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement4331); if (state.failed) return stmt;
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4337);
			stype=comparatorType();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:673:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_FINALFUNC) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// Parser.g:674:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement4355); if (state.failed) return stmt;
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4361);
					ffunc=allowedFunctionName();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:676:7: ( K_INITCOND ival= term )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==K_INITCOND) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// Parser.g:677:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement4388); if (state.failed) return stmt;
					pushFollow(FOLLOW_term_in_createAggregateStatement4394);
					ival=term();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new CreateAggregateStatement.Raw(fn, argTypes, stype, sfunc, ffunc, ival, orReplace, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:682:1: dropAggregateStatement returns [DropAggregateStatement.Raw stmt] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement.Raw dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean argsSpecified = false;
		    
		try {
			// Parser.g:688:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:688:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement4441); if (state.failed) return stmt;
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement4443); if (state.failed) return stmt;
			// Parser.g:689:7: ( K_IF K_EXISTS )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==K_IF) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// Parser.g:689:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement4452); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement4454); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement4469);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:691:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==199) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// Parser.g:692:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,199,FOLLOW_199_in_dropAggregateStatement4487); if (state.failed) return stmt;
					// Parser.g:693:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==IDENT||LA75_0==K_ACCESS||(LA75_0 >= K_AGGREGATE && LA75_0 <= K_ALL)||LA75_0==K_AS||LA75_0==K_ASCII||(LA75_0 >= K_BIGINT && LA75_0 <= K_BOOLEAN)||(LA75_0 >= K_CALLED && LA75_0 <= K_CLUSTERING)||(LA75_0 >= K_COMPACT && LA75_0 <= K_COUNTER)||(LA75_0 >= K_CUSTOM && LA75_0 <= K_DEFAULT)||(LA75_0 >= K_DISTINCT && LA75_0 <= K_DOUBLE)||LA75_0==K_DURATION||(LA75_0 >= K_EXISTS && LA75_0 <= K_FLOAT)||LA75_0==K_FROZEN||(LA75_0 >= K_FUNCTION && LA75_0 <= K_FUNCTIONS)||(LA75_0 >= K_GROUP && LA75_0 <= K_HASHED)||(LA75_0 >= K_INET && LA75_0 <= K_INPUT)||(LA75_0 >= K_INT && LA75_0 <= K_INTERNALS)||(LA75_0 >= K_JSON && LA75_0 <= K_KEYS)||(LA75_0 >= K_KEYSPACES && LA75_0 <= K_LIKE)||(LA75_0 >= K_LIST && LA75_0 <= K_MAP)||(LA75_0 >= K_MAXWRITETIME && LA75_0 <= K_MBEANS)||LA75_0==K_NOLOGIN||LA75_0==K_NOSUPERUSER||(LA75_0 >= K_ONLY && LA75_0 <= K_OPTIONS)||(LA75_0 >= K_PARTITION && LA75_0 <= K_PERMISSIONS)||(LA75_0 >= K_REPLACE && LA75_0 <= K_RETURNS)||(LA75_0 >= K_ROLE && LA75_0 <= K_ROLES)||(LA75_0 >= K_SET && LA75_0 <= K_TINYINT)||LA75_0==K_TRIGGER||(LA75_0 >= K_TTL && LA75_0 <= K_TYPES)||LA75_0==K_UNSET||(LA75_0 >= K_USER && LA75_0 <= K_USERS)||(LA75_0 >= K_UUID && LA75_0 <= K_VARINT)||LA75_0==K_WRITETIME||LA75_0==QUOTED_NAME||LA75_0==STRING_LITERAL) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Parser.g:694:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4515);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							// Parser.g:695:13: ( ',' v= comparatorType )*
							loop74:
							while (true) {
								int alt74=2;
								int LA74_0 = input.LA(1);
								if ( (LA74_0==203) ) {
									alt74=1;
								}

								switch (alt74) {
								case 1 :
									// Parser.g:695:15: ',' v= comparatorType
									{
									match(input,203,FOLLOW_203_in_dropAggregateStatement4533); if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4537);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { argTypes.add(v); }
									}
									break;

								default :
									break loop74;
								}
							}

							}
							break;

					}

					match(input,200,FOLLOW_200_in_dropAggregateStatement4565); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argsSpecified = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new DropAggregateStatement.Raw(fn, argTypes, argsSpecified, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:703:1: createFunctionStatement returns [CreateFunctionStatement.Raw stmt] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement.Raw createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement.Raw stmt = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw returnType =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argNames = new ArrayList<>();
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:712:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:712:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement4622); if (state.failed) return stmt;
			// Parser.g:712:16: ( K_OR K_REPLACE )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==K_OR) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// Parser.g:712:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement4625); if (state.failed) return stmt;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement4627); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement4639); if (state.failed) return stmt;
			// Parser.g:714:7: ( K_IF K_NOT K_EXISTS )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==K_IF) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// Parser.g:714:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement4648); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement4650); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement4652); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement4666);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,199,FOLLOW_199_in_createFunctionStatement4674); if (state.failed) return stmt;
			// Parser.g:717:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT||LA80_0==K_ACCESS||(LA80_0 >= K_AGGREGATE && LA80_0 <= K_ALL)||LA80_0==K_AS||LA80_0==K_ASCII||(LA80_0 >= K_BIGINT && LA80_0 <= K_BOOLEAN)||(LA80_0 >= K_CALLED && LA80_0 <= K_CLUSTERING)||(LA80_0 >= K_COMPACT && LA80_0 <= K_COUNTER)||(LA80_0 >= K_CUSTOM && LA80_0 <= K_DEFAULT)||(LA80_0 >= K_DISTINCT && LA80_0 <= K_DOUBLE)||LA80_0==K_DURATION||(LA80_0 >= K_EXISTS && LA80_0 <= K_FLOAT)||LA80_0==K_FROZEN||(LA80_0 >= K_FUNCTION && LA80_0 <= K_FUNCTIONS)||(LA80_0 >= K_GROUP && LA80_0 <= K_HASHED)||(LA80_0 >= K_INET && LA80_0 <= K_INPUT)||(LA80_0 >= K_INT && LA80_0 <= K_INTERNALS)||(LA80_0 >= K_JSON && LA80_0 <= K_KEYS)||(LA80_0 >= K_KEYSPACES && LA80_0 <= K_LIKE)||(LA80_0 >= K_LIST && LA80_0 <= K_MAP)||(LA80_0 >= K_MAXWRITETIME && LA80_0 <= K_MBEANS)||LA80_0==K_NOLOGIN||LA80_0==K_NOSUPERUSER||(LA80_0 >= K_ONLY && LA80_0 <= K_OPTIONS)||(LA80_0 >= K_PARTITION && LA80_0 <= K_PERMISSIONS)||(LA80_0 >= K_REPLACE && LA80_0 <= K_RETURNS)||(LA80_0 >= K_ROLE && LA80_0 <= K_ROLES)||(LA80_0 >= K_SFUNC && LA80_0 <= K_TINYINT)||LA80_0==K_TRIGGER||(LA80_0 >= K_TTL && LA80_0 <= K_TYPES)||LA80_0==K_UNSET||(LA80_0 >= K_USER && LA80_0 <= K_USERS)||(LA80_0 >= K_UUID && LA80_0 <= K_VARINT)||LA80_0==K_WRITETIME||LA80_0==QUOTED_NAME) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Parser.g:718:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4698);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4702);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argNames.add(k); argTypes.add(v); }
					// Parser.g:719:11: ( ',' k= noncol_ident v= comparatorType )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==203) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// Parser.g:719:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,203,FOLLOW_203_in_createFunctionStatement4718); if (state.failed) return stmt;
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4722);
							k=noncol_ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4726);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argNames.add(k); argTypes.add(v); }
							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

			}

			match(input,200,FOLLOW_200_in_createFunctionStatement4750); if (state.failed) return stmt;
			// Parser.g:722:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==K_RETURNS) ) {
				alt81=1;
			}
			else if ( (LA81_0==K_CALLED) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// Parser.g:722:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:722:9: ( K_RETURNS K_NULL )
					// Parser.g:722:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4761); if (state.failed) return stmt;
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4763); if (state.failed) return stmt;
					}

					}
					break;
				case 2 :
					// Parser.g:722:30: ( K_CALLED )
					{
					// Parser.g:722:30: ( K_CALLED )
					// Parser.g:722:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement4769); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { calledOnNullInput=true; }
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement4775); if (state.failed) return stmt;
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4777); if (state.failed) return stmt;
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement4779); if (state.failed) return stmt;
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4787); if (state.failed) return stmt;
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4793);
			returnType=comparatorType();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement4801); if (state.failed) return stmt;
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement4807); if (state.failed) return stmt;
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement4815); if (state.failed) return stmt;
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement4821); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateFunctionStatement.Raw(
			          fn, argNames, argTypes, returnType, calledOnNullInput, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null), orReplace, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:731:1: dropFunctionStatement returns [DropFunctionStatement.Raw stmt] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement.Raw dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean argsSpecified = false;
		    
		try {
			// Parser.g:737:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:737:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement4859); if (state.failed) return stmt;
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement4861); if (state.failed) return stmt;
			// Parser.g:738:7: ( K_IF K_EXISTS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==K_IF) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Parser.g:738:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement4870); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement4872); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement4887);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:740:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==199) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// Parser.g:741:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,199,FOLLOW_199_in_dropFunctionStatement4905); if (state.failed) return stmt;
					// Parser.g:742:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==IDENT||LA84_0==K_ACCESS||(LA84_0 >= K_AGGREGATE && LA84_0 <= K_ALL)||LA84_0==K_AS||LA84_0==K_ASCII||(LA84_0 >= K_BIGINT && LA84_0 <= K_BOOLEAN)||(LA84_0 >= K_CALLED && LA84_0 <= K_CLUSTERING)||(LA84_0 >= K_COMPACT && LA84_0 <= K_COUNTER)||(LA84_0 >= K_CUSTOM && LA84_0 <= K_DEFAULT)||(LA84_0 >= K_DISTINCT && LA84_0 <= K_DOUBLE)||LA84_0==K_DURATION||(LA84_0 >= K_EXISTS && LA84_0 <= K_FLOAT)||LA84_0==K_FROZEN||(LA84_0 >= K_FUNCTION && LA84_0 <= K_FUNCTIONS)||(LA84_0 >= K_GROUP && LA84_0 <= K_HASHED)||(LA84_0 >= K_INET && LA84_0 <= K_INPUT)||(LA84_0 >= K_INT && LA84_0 <= K_INTERNALS)||(LA84_0 >= K_JSON && LA84_0 <= K_KEYS)||(LA84_0 >= K_KEYSPACES && LA84_0 <= K_LIKE)||(LA84_0 >= K_LIST && LA84_0 <= K_MAP)||(LA84_0 >= K_MAXWRITETIME && LA84_0 <= K_MBEANS)||LA84_0==K_NOLOGIN||LA84_0==K_NOSUPERUSER||(LA84_0 >= K_ONLY && LA84_0 <= K_OPTIONS)||(LA84_0 >= K_PARTITION && LA84_0 <= K_PERMISSIONS)||(LA84_0 >= K_REPLACE && LA84_0 <= K_RETURNS)||(LA84_0 >= K_ROLE && LA84_0 <= K_ROLES)||(LA84_0 >= K_SET && LA84_0 <= K_TINYINT)||LA84_0==K_TRIGGER||(LA84_0 >= K_TTL && LA84_0 <= K_TYPES)||LA84_0==K_UNSET||(LA84_0 >= K_USER && LA84_0 <= K_USERS)||(LA84_0 >= K_UUID && LA84_0 <= K_VARINT)||LA84_0==K_WRITETIME||LA84_0==QUOTED_NAME||LA84_0==STRING_LITERAL) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// Parser.g:743:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4933);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							// Parser.g:744:13: ( ',' v= comparatorType )*
							loop83:
							while (true) {
								int alt83=2;
								int LA83_0 = input.LA(1);
								if ( (LA83_0==203) ) {
									alt83=1;
								}

								switch (alt83) {
								case 1 :
									// Parser.g:744:15: ',' v= comparatorType
									{
									match(input,203,FOLLOW_203_in_dropFunctionStatement4951); if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4955);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { argTypes.add(v); }
									}
									break;

								default :
									break loop83;
								}
							}

							}
							break;

					}

					match(input,200,FOLLOW_200_in_dropFunctionStatement4983); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argsSpecified = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new DropFunctionStatement.Raw(fn, argTypes, argsSpecified, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:755:1: createKeyspaceStatement returns [CreateKeyspaceStatement.Raw stmt] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement.Raw createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement.Raw stmt = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:760:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:760:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement5042); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement5044); if (state.failed) return stmt;
			// Parser.g:760:27: ( K_IF K_NOT K_EXISTS )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==K_IF) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Parser.g:760:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement5047); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement5049); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement5051); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement5060);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement5068); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement5070);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateKeyspaceStatement.Raw(ks, attrs, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:771:1: createTableStatement returns [CreateTableStatement.Raw stmt] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt] ;
	public final CreateTableStatement.Raw createTableStatement() throws RecognitionException {
		CreateTableStatement.Raw stmt = null;


		QualifiedName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:773:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt] )
			// Parser.g:773:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement5105); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement5107); if (state.failed) return stmt;
			// Parser.g:773:31: ( K_IF K_NOT K_EXISTS )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==K_IF) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Parser.g:773:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement5110); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement5112); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement5114); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement5129);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTableStatement.Raw(cf, ifNotExists); }
			pushFollow(FOLLOW_tableDefinition_in_createTableStatement5139);
			tableDefinition(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "tableDefinition"
	// Parser.g:778:1: tableDefinition[CreateTableStatement.Raw stmt] : '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )? ;
	public final void tableDefinition(CreateTableStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:779:5: ( '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )? )
			// Parser.g:779:7: '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )?
			{
			match(input,199,FOLLOW_199_in_tableDefinition5158); if (state.failed) return;
			pushFollow(FOLLOW_tableColumns_in_tableDefinition5160);
			tableColumns(stmt);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:779:30: ( ',' ( tableColumns[stmt] )? )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==203) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// Parser.g:779:32: ',' ( tableColumns[stmt] )?
					{
					match(input,203,FOLLOW_203_in_tableDefinition5165); if (state.failed) return;
					// Parser.g:779:36: ( tableColumns[stmt] )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==IDENT||LA88_0==K_ACCESS||(LA88_0 >= K_AGGREGATE && LA88_0 <= K_ALL)||LA88_0==K_AS||LA88_0==K_ASCII||(LA88_0 >= K_BIGINT && LA88_0 <= K_BOOLEAN)||(LA88_0 >= K_CALLED && LA88_0 <= K_CLUSTERING)||(LA88_0 >= K_COMPACT && LA88_0 <= K_COUNTER)||(LA88_0 >= K_CUSTOM && LA88_0 <= K_DEFAULT)||(LA88_0 >= K_DISTINCT && LA88_0 <= K_DOUBLE)||LA88_0==K_DURATION||(LA88_0 >= K_EXISTS && LA88_0 <= K_FLOAT)||LA88_0==K_FROZEN||(LA88_0 >= K_FUNCTION && LA88_0 <= K_FUNCTIONS)||(LA88_0 >= K_GROUP && LA88_0 <= K_HASHED)||(LA88_0 >= K_INET && LA88_0 <= K_INPUT)||(LA88_0 >= K_INT && LA88_0 <= K_INTERNALS)||(LA88_0 >= K_JSON && LA88_0 <= K_KEYS)||(LA88_0 >= K_KEYSPACES && LA88_0 <= K_LIKE)||(LA88_0 >= K_LIST && LA88_0 <= K_MAP)||(LA88_0 >= K_MAXWRITETIME && LA88_0 <= K_MBEANS)||LA88_0==K_NOLOGIN||LA88_0==K_NOSUPERUSER||(LA88_0 >= K_ONLY && LA88_0 <= K_OPTIONS)||(LA88_0 >= K_PARTITION && LA88_0 <= K_PERMISSIONS)||LA88_0==K_PRIMARY||(LA88_0 >= K_REPLACE && LA88_0 <= K_RETURNS)||(LA88_0 >= K_ROLE && LA88_0 <= K_ROLES)||(LA88_0 >= K_SFUNC && LA88_0 <= K_TINYINT)||LA88_0==K_TRIGGER||(LA88_0 >= K_TTL && LA88_0 <= K_TYPES)||LA88_0==K_UNSET||(LA88_0 >= K_USER && LA88_0 <= K_USERS)||(LA88_0 >= K_UUID && LA88_0 <= K_VARINT)||LA88_0==K_WRITETIME||LA88_0==QUOTED_NAME) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Parser.g:779:36: tableColumns[stmt]
							{
							pushFollow(FOLLOW_tableColumns_in_tableDefinition5167);
							tableColumns(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop89;
				}
			}

			match(input,200,FOLLOW_200_in_tableDefinition5174); if (state.failed) return;
			// Parser.g:780:7: ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==K_WITH) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:780:9: K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_tableDefinition5184); if (state.failed) return;
					pushFollow(FOLLOW_tableProperty_in_tableDefinition5186);
					tableProperty(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:780:36: ( K_AND tableProperty[stmt] )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==K_AND) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// Parser.g:780:38: K_AND tableProperty[stmt]
							{
							match(input,K_AND,FOLLOW_K_AND_in_tableDefinition5191); if (state.failed) return;
							pushFollow(FOLLOW_tableProperty_in_tableDefinition5193);
							tableProperty(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop90;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableDefinition"



	// $ANTLR start "tableColumns"
	// Parser.g:783:1: tableColumns[CreateTableStatement.Raw stmt] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')' );
	public final void tableColumns(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		 boolean isStatic = false; 
		try {
			// Parser.g:785:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')' )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==IDENT||LA95_0==K_ACCESS||(LA95_0 >= K_AGGREGATE && LA95_0 <= K_ALL)||LA95_0==K_AS||LA95_0==K_ASCII||(LA95_0 >= K_BIGINT && LA95_0 <= K_BOOLEAN)||(LA95_0 >= K_CALLED && LA95_0 <= K_CLUSTERING)||(LA95_0 >= K_COMPACT && LA95_0 <= K_COUNTER)||(LA95_0 >= K_CUSTOM && LA95_0 <= K_DEFAULT)||(LA95_0 >= K_DISTINCT && LA95_0 <= K_DOUBLE)||LA95_0==K_DURATION||(LA95_0 >= K_EXISTS && LA95_0 <= K_FLOAT)||LA95_0==K_FROZEN||(LA95_0 >= K_FUNCTION && LA95_0 <= K_FUNCTIONS)||(LA95_0 >= K_GROUP && LA95_0 <= K_HASHED)||(LA95_0 >= K_INET && LA95_0 <= K_INPUT)||(LA95_0 >= K_INT && LA95_0 <= K_INTERNALS)||(LA95_0 >= K_JSON && LA95_0 <= K_KEYS)||(LA95_0 >= K_KEYSPACES && LA95_0 <= K_LIKE)||(LA95_0 >= K_LIST && LA95_0 <= K_MAP)||(LA95_0 >= K_MAXWRITETIME && LA95_0 <= K_MBEANS)||LA95_0==K_NOLOGIN||LA95_0==K_NOSUPERUSER||(LA95_0 >= K_ONLY && LA95_0 <= K_OPTIONS)||(LA95_0 >= K_PARTITION && LA95_0 <= K_PERMISSIONS)||(LA95_0 >= K_REPLACE && LA95_0 <= K_RETURNS)||(LA95_0 >= K_ROLE && LA95_0 <= K_ROLES)||(LA95_0 >= K_SFUNC && LA95_0 <= K_TINYINT)||LA95_0==K_TRIGGER||(LA95_0 >= K_TTL && LA95_0 <= K_TYPES)||LA95_0==K_UNSET||(LA95_0 >= K_USER && LA95_0 <= K_USERS)||(LA95_0 >= K_UUID && LA95_0 <= K_VARINT)||LA95_0==K_WRITETIME||LA95_0==QUOTED_NAME) ) {
				alt95=1;
			}
			else if ( (LA95_0==K_PRIMARY) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// Parser.g:785:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_tableColumns5228);
					k=ident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_comparatorType_in_tableColumns5232);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:785:32: ( K_STATIC )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==K_STATIC) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// Parser.g:785:33: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_tableColumns5235); if (state.failed) return;
							if ( state.backtracking==0 ) { isStatic = true; }
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt.addColumn(k, v, isStatic); }
					// Parser.g:786:9: ( K_PRIMARY K_KEY )?
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==K_PRIMARY) ) {
						alt93=1;
					}
					switch (alt93) {
						case 1 :
							// Parser.g:786:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_tableColumns5252); if (state.failed) return;
							match(input,K_KEY,FOLLOW_K_KEY_in_tableColumns5254); if (state.failed) return;
							if ( state.backtracking==0 ) { stmt.setPartitionKeyColumn(k); }
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:787:7: K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_tableColumns5266); if (state.failed) return;
					match(input,K_KEY,FOLLOW_K_KEY_in_tableColumns5268); if (state.failed) return;
					match(input,199,FOLLOW_199_in_tableColumns5270); if (state.failed) return;
					pushFollow(FOLLOW_tablePartitionKey_in_tableColumns5272);
					tablePartitionKey(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:787:51: ( ',' c= ident )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==203) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Parser.g:787:52: ',' c= ident
							{
							match(input,203,FOLLOW_203_in_tableColumns5276); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_tableColumns5280);
							c=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { stmt.markClusteringColumn(c); }
							}
							break;

						default :
							break loop94;
						}
					}

					match(input,200,FOLLOW_200_in_tableColumns5287); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableColumns"



	// $ANTLR start "tablePartitionKey"
	// Parser.g:790:1: tablePartitionKey[CreateTableStatement.Raw stmt] : (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void tablePartitionKey(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>();
		try {
			// Parser.g:793:5: (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==IDENT||LA97_0==K_ACCESS||(LA97_0 >= K_AGGREGATE && LA97_0 <= K_ALL)||LA97_0==K_AS||LA97_0==K_ASCII||(LA97_0 >= K_BIGINT && LA97_0 <= K_BOOLEAN)||(LA97_0 >= K_CALLED && LA97_0 <= K_CLUSTERING)||(LA97_0 >= K_COMPACT && LA97_0 <= K_COUNTER)||(LA97_0 >= K_CUSTOM && LA97_0 <= K_DEFAULT)||(LA97_0 >= K_DISTINCT && LA97_0 <= K_DOUBLE)||LA97_0==K_DURATION||(LA97_0 >= K_EXISTS && LA97_0 <= K_FLOAT)||LA97_0==K_FROZEN||(LA97_0 >= K_FUNCTION && LA97_0 <= K_FUNCTIONS)||(LA97_0 >= K_GROUP && LA97_0 <= K_HASHED)||(LA97_0 >= K_INET && LA97_0 <= K_INPUT)||(LA97_0 >= K_INT && LA97_0 <= K_INTERNALS)||(LA97_0 >= K_JSON && LA97_0 <= K_KEYS)||(LA97_0 >= K_KEYSPACES && LA97_0 <= K_LIKE)||(LA97_0 >= K_LIST && LA97_0 <= K_MAP)||(LA97_0 >= K_MAXWRITETIME && LA97_0 <= K_MBEANS)||LA97_0==K_NOLOGIN||LA97_0==K_NOSUPERUSER||(LA97_0 >= K_ONLY && LA97_0 <= K_OPTIONS)||(LA97_0 >= K_PARTITION && LA97_0 <= K_PERMISSIONS)||(LA97_0 >= K_REPLACE && LA97_0 <= K_RETURNS)||(LA97_0 >= K_ROLE && LA97_0 <= K_ROLES)||(LA97_0 >= K_SFUNC && LA97_0 <= K_TINYINT)||LA97_0==K_TRIGGER||(LA97_0 >= K_TTL && LA97_0 <= K_TYPES)||LA97_0==K_UNSET||(LA97_0 >= K_USER && LA97_0 <= K_USERS)||(LA97_0 >= K_UUID && LA97_0 <= K_VARINT)||LA97_0==K_WRITETIME||LA97_0==QUOTED_NAME) ) {
				alt97=1;
			}
			else if ( (LA97_0==199) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// Parser.g:793:7: k1= ident
					{
					pushFollow(FOLLOW_ident_in_tablePartitionKey5324);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1);}
					}
					break;
				case 2 :
					// Parser.g:794:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,199,FOLLOW_199_in_tablePartitionKey5334); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_tablePartitionKey5338);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1); }
					// Parser.g:794:35: ( ',' kn= ident )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==203) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Parser.g:794:37: ',' kn= ident
							{
							match(input,203,FOLLOW_203_in_tablePartitionKey5344); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_tablePartitionKey5348);
							kn=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { l.add(kn); }
							}
							break;

						default :
							break loop96;
						}
					}

					match(input,200,FOLLOW_200_in_tablePartitionKey5355); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) { stmt.setPartitionKeyColumns(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tablePartitionKey"



	// $ANTLR start "tableProperty"
	// Parser.g:797:1: tableProperty[CreateTableStatement.Raw stmt] : ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')' );
	public final void tableProperty(CreateTableStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:798:5: ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')' )
			int alt99=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt99=1;
				}
				break;
			case K_COMPACT:
				{
				int LA99_2 = input.LA(2);
				if ( (LA99_2==K_STORAGE) ) {
					alt99=2;
				}
				else if ( (LA99_2==212) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA99_3 = input.LA(2);
				if ( (LA99_3==K_ORDER) ) {
					alt99=3;
				}
				else if ( (LA99_3==212) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// Parser.g:798:7: property[stmt.attrs]
					{
					pushFollow(FOLLOW_property_in_tableProperty5373);
					property(stmt.attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:799:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_tableProperty5382); if (state.failed) return;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_tableProperty5384); if (state.failed) return;
					if ( state.backtracking==0 ) { stmt.setCompactStorage(); }
					}
					break;
				case 3 :
					// Parser.g:800:7: K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_tableProperty5394); if (state.failed) return;
					match(input,K_ORDER,FOLLOW_K_ORDER_in_tableProperty5396); if (state.failed) return;
					match(input,K_BY,FOLLOW_K_BY_in_tableProperty5398); if (state.failed) return;
					match(input,199,FOLLOW_199_in_tableProperty5400); if (state.failed) return;
					pushFollow(FOLLOW_tableClusteringOrder_in_tableProperty5402);
					tableClusteringOrder(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:800:64: ( ',' tableClusteringOrder[stmt] )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==203) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Parser.g:800:65: ',' tableClusteringOrder[stmt]
							{
							match(input,203,FOLLOW_203_in_tableProperty5406); if (state.failed) return;
							pushFollow(FOLLOW_tableClusteringOrder_in_tableProperty5408);
							tableClusteringOrder(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop98;
						}
					}

					match(input,200,FOLLOW_200_in_tableProperty5413); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableProperty"



	// $ANTLR start "tableClusteringOrder"
	// Parser.g:803:1: tableClusteringOrder[CreateTableStatement.Raw stmt] : k= ident ( K_ASC | K_DESC ) ;
	public final void tableClusteringOrder(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean ascending = true; 
		try {
			// Parser.g:805:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:805:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_tableClusteringOrder5441);
			k=ident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:805:15: ( K_ASC | K_DESC )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_ASC) ) {
				alt100=1;
			}
			else if ( (LA100_0==K_DESC) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// Parser.g:805:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_tableClusteringOrder5444); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:805:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_tableClusteringOrder5448); if (state.failed) return;
					if ( state.backtracking==0 ) { ascending = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt.extendClusteringOrder(k, ascending); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableClusteringOrder"



	// $ANTLR start "createTypeStatement"
	// Parser.g:815:1: createTypeStatement returns [CreateTypeStatement.Raw stmt] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')' ;
	public final CreateTypeStatement.Raw createTypeStatement() throws RecognitionException {
		CreateTypeStatement.Raw stmt = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:817:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')' )
			// Parser.g:817:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement5486); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement5488); if (state.failed) return stmt;
			// Parser.g:817:23: ( K_IF K_NOT K_EXISTS )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==K_IF) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Parser.g:817:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement5491); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement5493); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement5495); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement5513);
			tn=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTypeStatement.Raw(tn, ifNotExists); }
			match(input,199,FOLLOW_199_in_createTypeStatement5526); if (state.failed) return stmt;
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement5528);
			typeColumns(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:819:32: ( ',' ( typeColumns[stmt] )? )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==203) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// Parser.g:819:34: ',' ( typeColumns[stmt] )?
					{
					match(input,203,FOLLOW_203_in_createTypeStatement5533); if (state.failed) return stmt;
					// Parser.g:819:38: ( typeColumns[stmt] )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==IDENT||LA102_0==K_ACCESS||(LA102_0 >= K_AGGREGATE && LA102_0 <= K_ALL)||LA102_0==K_AS||LA102_0==K_ASCII||(LA102_0 >= K_BIGINT && LA102_0 <= K_BOOLEAN)||(LA102_0 >= K_CALLED && LA102_0 <= K_CLUSTERING)||(LA102_0 >= K_COMPACT && LA102_0 <= K_COUNTER)||(LA102_0 >= K_CUSTOM && LA102_0 <= K_DEFAULT)||(LA102_0 >= K_DISTINCT && LA102_0 <= K_DOUBLE)||LA102_0==K_DURATION||(LA102_0 >= K_EXISTS && LA102_0 <= K_FLOAT)||LA102_0==K_FROZEN||(LA102_0 >= K_FUNCTION && LA102_0 <= K_FUNCTIONS)||(LA102_0 >= K_GROUP && LA102_0 <= K_HASHED)||(LA102_0 >= K_INET && LA102_0 <= K_INPUT)||(LA102_0 >= K_INT && LA102_0 <= K_INTERNALS)||(LA102_0 >= K_JSON && LA102_0 <= K_KEYS)||(LA102_0 >= K_KEYSPACES && LA102_0 <= K_LIKE)||(LA102_0 >= K_LIST && LA102_0 <= K_MAP)||(LA102_0 >= K_MAXWRITETIME && LA102_0 <= K_MBEANS)||LA102_0==K_NOLOGIN||LA102_0==K_NOSUPERUSER||(LA102_0 >= K_ONLY && LA102_0 <= K_OPTIONS)||(LA102_0 >= K_PARTITION && LA102_0 <= K_PERMISSIONS)||(LA102_0 >= K_REPLACE && LA102_0 <= K_RETURNS)||(LA102_0 >= K_ROLE && LA102_0 <= K_ROLES)||(LA102_0 >= K_SFUNC && LA102_0 <= K_TINYINT)||LA102_0==K_TRIGGER||(LA102_0 >= K_TTL && LA102_0 <= K_TYPES)||LA102_0==K_UNSET||(LA102_0 >= K_USER && LA102_0 <= K_USERS)||(LA102_0 >= K_UUID && LA102_0 <= K_VARINT)||LA102_0==K_WRITETIME||LA102_0==QUOTED_NAME) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// Parser.g:819:38: typeColumns[stmt]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement5535);
							typeColumns(stmt);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

					}

					}
					break;

				default :
					break loop103;
				}
			}

			match(input,200,FOLLOW_200_in_createTypeStatement5542); if (state.failed) return stmt;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:822:1: typeColumns[CreateTypeStatement.Raw stmt] : k= fident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement.Raw stmt) throws RecognitionException {
		FieldIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:823:5: (k= fident v= comparatorType )
			// Parser.g:823:7: k= fident v= comparatorType
			{
			pushFollow(FOLLOW_fident_in_typeColumns5562);
			k=fident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_comparatorType_in_typeColumns5566);
			v=comparatorType();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { stmt.addField(k, v); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:830:1: createIndexStatement returns [CreateIndexStatement.Raw stmt] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement.Raw createIndexStatement() throws RecognitionException {
		CreateIndexStatement.Raw stmt = null;


		Token cls=null;
		QualifiedName cf =null;


		        IndexAttributes props = new IndexAttributes();
		        boolean ifNotExists = false;
		        QualifiedName name = new QualifiedName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:837:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:837:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement5600); if (state.failed) return stmt;
			// Parser.g:837:16: ( K_CUSTOM )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_CUSTOM) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Parser.g:837:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement5603); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { props.isCustom = true; }
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement5609); if (state.failed) return stmt;
			// Parser.g:837:63: ( K_IF K_NOT K_EXISTS )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==K_IF) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// Parser.g:837:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement5612); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement5614); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement5616); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:838:9: ( idxName[name] )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==IDENT||LA106_0==K_ACCESS||(LA106_0 >= K_AGGREGATE && LA106_0 <= K_ALL)||LA106_0==K_AS||LA106_0==K_ASCII||(LA106_0 >= K_BIGINT && LA106_0 <= K_BOOLEAN)||(LA106_0 >= K_CALLED && LA106_0 <= K_CLUSTERING)||(LA106_0 >= K_COMPACT && LA106_0 <= K_COUNTER)||(LA106_0 >= K_CUSTOM && LA106_0 <= K_DEFAULT)||(LA106_0 >= K_DISTINCT && LA106_0 <= K_DOUBLE)||LA106_0==K_DURATION||(LA106_0 >= K_EXISTS && LA106_0 <= K_FLOAT)||LA106_0==K_FROZEN||(LA106_0 >= K_FUNCTION && LA106_0 <= K_FUNCTIONS)||(LA106_0 >= K_GROUP && LA106_0 <= K_HASHED)||(LA106_0 >= K_INET && LA106_0 <= K_INPUT)||(LA106_0 >= K_INT && LA106_0 <= K_INTERNALS)||(LA106_0 >= K_JSON && LA106_0 <= K_KEYS)||(LA106_0 >= K_KEYSPACES && LA106_0 <= K_LIKE)||(LA106_0 >= K_LIST && LA106_0 <= K_MAP)||(LA106_0 >= K_MAXWRITETIME && LA106_0 <= K_MBEANS)||LA106_0==K_NOLOGIN||LA106_0==K_NOSUPERUSER||(LA106_0 >= K_ONLY && LA106_0 <= K_OPTIONS)||(LA106_0 >= K_PARTITION && LA106_0 <= K_PERMISSIONS)||(LA106_0 >= K_REPLACE && LA106_0 <= K_RETURNS)||(LA106_0 >= K_ROLE && LA106_0 <= K_ROLES)||(LA106_0 >= K_SFUNC && LA106_0 <= K_TINYINT)||LA106_0==K_TRIGGER||(LA106_0 >= K_TTL && LA106_0 <= K_TYPES)||LA106_0==K_UNSET||(LA106_0 >= K_USER && LA106_0 <= K_USERS)||(LA106_0 >= K_UUID && LA106_0 <= K_VARINT)||LA106_0==K_WRITETIME||(LA106_0 >= QMARK && LA106_0 <= QUOTED_NAME)) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Parser.g:838:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement5632);
					idxName(name);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement5637); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement5641);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,199,FOLLOW_199_in_createIndexStatement5643); if (state.failed) return stmt;
			// Parser.g:838:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==EMPTY_QUOTED_NAME||LA108_0==IDENT||LA108_0==K_ACCESS||(LA108_0 >= K_AGGREGATE && LA108_0 <= K_ALL)||LA108_0==K_AS||LA108_0==K_ASCII||(LA108_0 >= K_BIGINT && LA108_0 <= K_BOOLEAN)||(LA108_0 >= K_CALLED && LA108_0 <= K_CLUSTERING)||(LA108_0 >= K_COMPACT && LA108_0 <= K_COUNTER)||(LA108_0 >= K_CUSTOM && LA108_0 <= K_DEFAULT)||(LA108_0 >= K_DISTINCT && LA108_0 <= K_DOUBLE)||(LA108_0 >= K_DURATION && LA108_0 <= K_ENTRIES)||(LA108_0 >= K_EXISTS && LA108_0 <= K_FLOAT)||(LA108_0 >= K_FROZEN && LA108_0 <= K_FUNCTIONS)||(LA108_0 >= K_GROUP && LA108_0 <= K_HASHED)||(LA108_0 >= K_INET && LA108_0 <= K_INPUT)||(LA108_0 >= K_INT && LA108_0 <= K_INTERNALS)||(LA108_0 >= K_JSON && LA108_0 <= K_KEYS)||(LA108_0 >= K_KEYSPACES && LA108_0 <= K_LIKE)||(LA108_0 >= K_LIST && LA108_0 <= K_MAP)||(LA108_0 >= K_MAXWRITETIME && LA108_0 <= K_MBEANS)||LA108_0==K_NOLOGIN||LA108_0==K_NOSUPERUSER||(LA108_0 >= K_ONLY && LA108_0 <= K_OPTIONS)||(LA108_0 >= K_PARTITION && LA108_0 <= K_PERMISSIONS)||(LA108_0 >= K_REPLACE && LA108_0 <= K_RETURNS)||(LA108_0 >= K_ROLE && LA108_0 <= K_ROLES)||(LA108_0 >= K_SFUNC && LA108_0 <= K_TINYINT)||LA108_0==K_TRIGGER||(LA108_0 >= K_TTL && LA108_0 <= K_TYPES)||LA108_0==K_UNSET||(LA108_0 >= K_USER && LA108_0 <= K_USERS)||(LA108_0 >= K_UUID && LA108_0 <= K_VARINT)||LA108_0==K_WRITETIME||LA108_0==QUOTED_NAME) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Parser.g:838:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement5646);
					indexIdent(targets);
					state._fsp--;
					if (state.failed) return stmt;
					// Parser.g:838:76: ( ',' indexIdent[targets] )*
					loop107:
					while (true) {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==203) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// Parser.g:838:77: ',' indexIdent[targets]
							{
							match(input,203,FOLLOW_203_in_createIndexStatement5650); if (state.failed) return stmt;
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement5652);
							indexIdent(targets);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

						default :
							break loop107;
						}
					}

					}
					break;

			}

			match(input,200,FOLLOW_200_in_createIndexStatement5659); if (state.failed) return stmt;
			// Parser.g:839:9: ( K_USING cls= STRING_LITERAL )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==K_USING) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// Parser.g:839:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement5670); if (state.failed) return stmt;
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement5674); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { props.customClass = (cls!=null?cls.getText():null); }
					}
					break;

			}

			// Parser.g:840:9: ( K_WITH properties[props] )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==K_WITH) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Parser.g:840:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement5689); if (state.failed) return stmt;
					pushFollow(FOLLOW_properties_in_createIndexStatement5691);
					properties(props);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new CreateIndexStatement.Raw(cf, name, targets, props, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:844:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnIdentifier c =null;

		try {
			// Parser.g:845:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt111=5;
			switch ( input.LA(1) ) {
			case EMPTY_QUOTED_NAME:
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt111=1;
				}
				break;
			case K_VALUES:
				{
				int LA111_2 = input.LA(2);
				if ( (LA111_2==199) ) {
					alt111=2;
				}
				else if ( (LA111_2==200||LA111_2==203) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA111_3 = input.LA(2);
				if ( (LA111_3==199) ) {
					alt111=3;
				}
				else if ( (LA111_3==200||LA111_3==203) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt111=4;
				}
				break;
			case K_FULL:
				{
				alt111=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:845:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent5723);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.simpleIndexOn(c)); }
					}
					break;
				case 2 :
					// Parser.g:846:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent5751); if (state.failed) return;
					match(input,199,FOLLOW_199_in_indexIdent5753); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5757);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5759); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.valuesOf(c)); }
					}
					break;
				case 3 :
					// Parser.g:847:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent5770); if (state.failed) return;
					match(input,199,FOLLOW_199_in_indexIdent5772); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5776);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5778); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysOf(c)); }
					}
					break;
				case 4 :
					// Parser.g:848:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent5791); if (state.failed) return;
					match(input,199,FOLLOW_199_in_indexIdent5793); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5797);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5799); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysAndValuesOf(c)); }
					}
					break;
				case 5 :
					// Parser.g:849:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent5809); if (state.failed) return;
					match(input,199,FOLLOW_199_in_indexIdent5811); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5815);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5817); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.fullCollection(c)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:860:1: createMaterializedViewStatement returns [CreateViewStatement.Raw stmt] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )? ;
	public final CreateViewStatement.Raw createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement.Raw stmt = null;


		QualifiedName cf =null;
		List<RawSelector> sclause =null;
		QualifiedName basecf =null;
		WhereClause.Builder wclause =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:864:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )? )
			// Parser.g:864:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement5854); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5856); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement5858); if (state.failed) return stmt;
			// Parser.g:864:38: ( K_IF K_NOT K_EXISTS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_IF) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:864:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement5861); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement5863); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement5865); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5873);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement5875); if (state.failed) return stmt;
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement5885); if (state.failed) return stmt;
			pushFollow(FOLLOW_selectors_in_createMaterializedViewStatement5889);
			sclause=selectors();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement5891); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5895);
			basecf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:866:9: ( K_WHERE wclause= whereClause )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==K_WHERE) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// Parser.g:866:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement5906); if (state.failed) return stmt;
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement5910);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             stmt = new CreateViewStatement.Raw(basecf, cf, sclause, where, ifNotExists);
			        }
			pushFollow(FOLLOW_viewPrimaryKey_in_createMaterializedViewStatement5932);
			viewPrimaryKey(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:872:9: ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==K_WITH) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Parser.g:872:11: K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement5945); if (state.failed) return stmt;
					pushFollow(FOLLOW_viewProperty_in_createMaterializedViewStatement5947);
					viewProperty(stmt);
					state._fsp--;
					if (state.failed) return stmt;
					// Parser.g:872:37: ( K_AND viewProperty[stmt] )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==K_AND) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// Parser.g:872:39: K_AND viewProperty[stmt]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement5952); if (state.failed) return stmt;
							pushFollow(FOLLOW_viewProperty_in_createMaterializedViewStatement5954);
							viewProperty(stmt);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

						default :
							break loop114;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "viewPrimaryKey"
	// Parser.g:875:1: viewPrimaryKey[CreateViewStatement.Raw stmt] : K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')' ;
	public final void viewPrimaryKey(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier c =null;

		try {
			// Parser.g:876:5: ( K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')' )
			// Parser.g:876:7: K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')'
			{
			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_viewPrimaryKey5978); if (state.failed) return;
			match(input,K_KEY,FOLLOW_K_KEY_in_viewPrimaryKey5980); if (state.failed) return;
			match(input,199,FOLLOW_199_in_viewPrimaryKey5982); if (state.failed) return;
			pushFollow(FOLLOW_viewPartitionKey_in_viewPrimaryKey5984);
			viewPartitionKey(stmt);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:876:50: ( ',' c= ident )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==203) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Parser.g:876:51: ',' c= ident
					{
					match(input,203,FOLLOW_203_in_viewPrimaryKey5988); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_viewPrimaryKey5992);
					c=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { stmt.markClusteringColumn(c); }
					}
					break;

				default :
					break loop116;
				}
			}

			match(input,200,FOLLOW_200_in_viewPrimaryKey5999); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewPrimaryKey"



	// $ANTLR start "viewPartitionKey"
	// Parser.g:879:1: viewPartitionKey[CreateViewStatement.Raw stmt] : (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void viewPartitionKey(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>();
		try {
			// Parser.g:882:5: (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==IDENT||LA118_0==K_ACCESS||(LA118_0 >= K_AGGREGATE && LA118_0 <= K_ALL)||LA118_0==K_AS||LA118_0==K_ASCII||(LA118_0 >= K_BIGINT && LA118_0 <= K_BOOLEAN)||(LA118_0 >= K_CALLED && LA118_0 <= K_CLUSTERING)||(LA118_0 >= K_COMPACT && LA118_0 <= K_COUNTER)||(LA118_0 >= K_CUSTOM && LA118_0 <= K_DEFAULT)||(LA118_0 >= K_DISTINCT && LA118_0 <= K_DOUBLE)||LA118_0==K_DURATION||(LA118_0 >= K_EXISTS && LA118_0 <= K_FLOAT)||LA118_0==K_FROZEN||(LA118_0 >= K_FUNCTION && LA118_0 <= K_FUNCTIONS)||(LA118_0 >= K_GROUP && LA118_0 <= K_HASHED)||(LA118_0 >= K_INET && LA118_0 <= K_INPUT)||(LA118_0 >= K_INT && LA118_0 <= K_INTERNALS)||(LA118_0 >= K_JSON && LA118_0 <= K_KEYS)||(LA118_0 >= K_KEYSPACES && LA118_0 <= K_LIKE)||(LA118_0 >= K_LIST && LA118_0 <= K_MAP)||(LA118_0 >= K_MAXWRITETIME && LA118_0 <= K_MBEANS)||LA118_0==K_NOLOGIN||LA118_0==K_NOSUPERUSER||(LA118_0 >= K_ONLY && LA118_0 <= K_OPTIONS)||(LA118_0 >= K_PARTITION && LA118_0 <= K_PERMISSIONS)||(LA118_0 >= K_REPLACE && LA118_0 <= K_RETURNS)||(LA118_0 >= K_ROLE && LA118_0 <= K_ROLES)||(LA118_0 >= K_SFUNC && LA118_0 <= K_TINYINT)||LA118_0==K_TRIGGER||(LA118_0 >= K_TTL && LA118_0 <= K_TYPES)||LA118_0==K_UNSET||(LA118_0 >= K_USER && LA118_0 <= K_USERS)||(LA118_0 >= K_UUID && LA118_0 <= K_VARINT)||LA118_0==K_WRITETIME||LA118_0==QUOTED_NAME) ) {
				alt118=1;
			}
			else if ( (LA118_0==199) ) {
				alt118=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}

			switch (alt118) {
				case 1 :
					// Parser.g:882:7: k1= ident
					{
					pushFollow(FOLLOW_ident_in_viewPartitionKey6036);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1);}
					}
					break;
				case 2 :
					// Parser.g:883:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,199,FOLLOW_199_in_viewPartitionKey6046); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_viewPartitionKey6050);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1); }
					// Parser.g:883:35: ( ',' kn= ident )*
					loop117:
					while (true) {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==203) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// Parser.g:883:37: ',' kn= ident
							{
							match(input,203,FOLLOW_203_in_viewPartitionKey6056); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_viewPartitionKey6060);
							kn=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { l.add(kn); }
							}
							break;

						default :
							break loop117;
						}
					}

					match(input,200,FOLLOW_200_in_viewPartitionKey6067); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) { stmt.setPartitionKeyColumns(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewPartitionKey"



	// $ANTLR start "viewProperty"
	// Parser.g:886:1: viewProperty[CreateViewStatement.Raw stmt] : ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')' );
	public final void viewProperty(CreateViewStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:887:5: ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')' )
			int alt120=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt120=1;
				}
				break;
			case K_COMPACT:
				{
				int LA120_2 = input.LA(2);
				if ( (LA120_2==K_STORAGE) ) {
					alt120=2;
				}
				else if ( (LA120_2==212) ) {
					alt120=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA120_3 = input.LA(2);
				if ( (LA120_3==K_ORDER) ) {
					alt120=3;
				}
				else if ( (LA120_3==212) ) {
					alt120=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}
			switch (alt120) {
				case 1 :
					// Parser.g:887:7: property[stmt.attrs]
					{
					pushFollow(FOLLOW_property_in_viewProperty6085);
					property(stmt.attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:888:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_viewProperty6094); if (state.failed) return;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_viewProperty6096); if (state.failed) return;
					if ( state.backtracking==0 ) { throw new SyntaxException("COMPACT STORAGE tables are not allowed starting with version 4.0"); }
					}
					break;
				case 3 :
					// Parser.g:889:7: K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_viewProperty6106); if (state.failed) return;
					match(input,K_ORDER,FOLLOW_K_ORDER_in_viewProperty6108); if (state.failed) return;
					match(input,K_BY,FOLLOW_K_BY_in_viewProperty6110); if (state.failed) return;
					match(input,199,FOLLOW_199_in_viewProperty6112); if (state.failed) return;
					pushFollow(FOLLOW_viewClusteringOrder_in_viewProperty6114);
					viewClusteringOrder(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:889:63: ( ',' viewClusteringOrder[stmt] )*
					loop119:
					while (true) {
						int alt119=2;
						int LA119_0 = input.LA(1);
						if ( (LA119_0==203) ) {
							alt119=1;
						}

						switch (alt119) {
						case 1 :
							// Parser.g:889:64: ',' viewClusteringOrder[stmt]
							{
							match(input,203,FOLLOW_203_in_viewProperty6118); if (state.failed) return;
							pushFollow(FOLLOW_viewClusteringOrder_in_viewProperty6120);
							viewClusteringOrder(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop119;
						}
					}

					match(input,200,FOLLOW_200_in_viewProperty6125); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewProperty"



	// $ANTLR start "viewClusteringOrder"
	// Parser.g:892:1: viewClusteringOrder[CreateViewStatement.Raw stmt] : k= ident ( K_ASC | K_DESC ) ;
	public final void viewClusteringOrder(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean ascending = true; 
		try {
			// Parser.g:894:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:894:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_viewClusteringOrder6153);
			k=ident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:894:15: ( K_ASC | K_DESC )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==K_ASC) ) {
				alt121=1;
			}
			else if ( (LA121_0==K_DESC) ) {
				alt121=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// Parser.g:894:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_viewClusteringOrder6156); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:894:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_viewClusteringOrder6160); if (state.failed) return;
					if ( state.backtracking==0 ) { ascending = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt.extendClusteringOrder(k, ascending); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewClusteringOrder"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:900:1: createTriggerStatement returns [CreateTriggerStatement.Raw stmt] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement.Raw createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement.Raw stmt = null;


		Token cls=null;
		ColumnIdentifier name =null;
		QualifiedName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:904:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:904:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement6198); if (state.failed) return stmt;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement6200); if (state.failed) return stmt;
			// Parser.g:904:26: ( K_IF K_NOT K_EXISTS )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==K_IF) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// Parser.g:904:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement6203); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement6205); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement6207); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:904:74: (name= ident )
			// Parser.g:904:75: name= ident
			{
			pushFollow(FOLLOW_ident_in_createTriggerStatement6217);
			name=ident();
			state._fsp--;
			if (state.failed) return stmt;
			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement6228); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement6232);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement6234); if (state.failed) return stmt;
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement6238); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTriggerStatement.Raw(cf, name.toString(), (cls!=null?cls.getText():null), ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:912:1: dropTriggerStatement returns [DropTriggerStatement.Raw stmt] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement.Raw dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement.Raw stmt = null;


		ColumnIdentifier name =null;
		QualifiedName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:914:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName )
			// Parser.g:914:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement6279); if (state.failed) return stmt;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement6281); if (state.failed) return stmt;
			// Parser.g:914:24: ( K_IF K_EXISTS )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==K_IF) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// Parser.g:914:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement6284); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement6286); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			// Parser.g:914:63: (name= ident )
			// Parser.g:914:64: name= ident
			{
			pushFollow(FOLLOW_ident_in_dropTriggerStatement6296);
			name=ident();
			state._fsp--;
			if (state.failed) return stmt;
			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement6299); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement6303);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTriggerStatement.Raw(cf, name.toString(), ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:921:1: alterKeyspaceStatement returns [AlterKeyspaceStatement.Raw stmt] : K_ALTER K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement.Raw alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement.Raw stmt = null;


		String ks =null;


		     KeyspaceAttributes attrs = new KeyspaceAttributes();
		     boolean ifExists = false;
		    
		try {
			// Parser.g:926:5: ( K_ALTER K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:926:7: K_ALTER K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement6343); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6345); if (state.failed) return stmt;
			// Parser.g:926:26: ( K_IF K_EXISTS )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==K_IF) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// Parser.g:926:27: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterKeyspaceStatement6348); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterKeyspaceStatement6350); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement6359);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement6369); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement6371);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterKeyspaceStatement.Raw(ks, attrs, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:937:1: alterTableStatement returns [AlterTableStatement.Raw stmt] : K_ALTER K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP ( K_IF K_EXISTS )? (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME ( K_IF K_EXISTS )? (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* ) | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] ) ;
	public final AlterTableStatement.Raw alterTableStatement() throws RecognitionException {
		AlterTableStatement.Raw stmt = null;


		Token t=null;
		QualifiedName cf =null;
		ColumnIdentifier id =null;
		CQL3Type.Raw v =null;
		boolean b =false;
		ColumnIdentifier id1 =null;
		CQL3Type.Raw v1 =null;
		boolean b1 =false;
		ColumnIdentifier idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnIdentifier toId1 =null;
		ColumnIdentifier toIdn =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:939:5: ( K_ALTER K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP ( K_IF K_EXISTS )? (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME ( K_IF K_EXISTS )? (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* ) | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] ) )
			// Parser.g:939:7: K_ALTER K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP ( K_IF K_EXISTS )? (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME ( K_IF K_EXISTS )? (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* ) | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6406); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6408); if (state.failed) return stmt;
			// Parser.g:939:30: ( K_IF K_EXISTS )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==K_IF) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// Parser.g:939:31: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterTableStatement6411); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTableStatement6413); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement6428);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterTableStatement.Raw(cf, ifExists); }
			// Parser.g:941:7: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP ( K_IF K_EXISTS )? (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME ( K_IF K_EXISTS )? (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* ) | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] )
			int alt135=6;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt135=1;
				}
				break;
			case K_ADD:
				{
				alt135=2;
				}
				break;
			case K_DROP:
				{
				int LA135_3 = input.LA(2);
				if ( (LA135_3==K_COMPACT) ) {
					int LA135_6 = input.LA(3);
					if ( (LA135_6==K_STORAGE) ) {
						alt135=5;
					}
					else if ( (LA135_6==EOF||LA135_6==K_USING||LA135_6==209) ) {
						alt135=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 135, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA135_3==IDENT||LA135_3==K_ACCESS||(LA135_3 >= K_AGGREGATE && LA135_3 <= K_ALL)||LA135_3==K_AS||LA135_3==K_ASCII||(LA135_3 >= K_BIGINT && LA135_3 <= K_BOOLEAN)||(LA135_3 >= K_CALLED && LA135_3 <= K_CLUSTERING)||(LA135_3 >= K_CONTAINS && LA135_3 <= K_COUNTER)||(LA135_3 >= K_CUSTOM && LA135_3 <= K_DEFAULT)||(LA135_3 >= K_DISTINCT && LA135_3 <= K_DOUBLE)||LA135_3==K_DURATION||(LA135_3 >= K_EXISTS && LA135_3 <= K_FLOAT)||LA135_3==K_FROZEN||(LA135_3 >= K_FUNCTION && LA135_3 <= K_FUNCTIONS)||(LA135_3 >= K_GROUP && LA135_3 <= K_IF)||(LA135_3 >= K_INET && LA135_3 <= K_INPUT)||(LA135_3 >= K_INT && LA135_3 <= K_INTERNALS)||(LA135_3 >= K_JSON && LA135_3 <= K_KEYS)||(LA135_3 >= K_KEYSPACES && LA135_3 <= K_LIKE)||(LA135_3 >= K_LIST && LA135_3 <= K_MAP)||(LA135_3 >= K_MAXWRITETIME && LA135_3 <= K_MBEANS)||LA135_3==K_NOLOGIN||LA135_3==K_NOSUPERUSER||(LA135_3 >= K_ONLY && LA135_3 <= K_OPTIONS)||(LA135_3 >= K_PARTITION && LA135_3 <= K_PERMISSIONS)||(LA135_3 >= K_REPLACE && LA135_3 <= K_RETURNS)||(LA135_3 >= K_ROLE && LA135_3 <= K_ROLES)||(LA135_3 >= K_SFUNC && LA135_3 <= K_TINYINT)||LA135_3==K_TRIGGER||(LA135_3 >= K_TTL && LA135_3 <= K_TYPES)||LA135_3==K_UNSET||(LA135_3 >= K_USER && LA135_3 <= K_USERS)||(LA135_3 >= K_UUID && LA135_3 <= K_VARINT)||LA135_3==K_WRITETIME||LA135_3==QUOTED_NAME||LA135_3==199) ) {
					alt135=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return stmt;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 135, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_RENAME:
				{
				alt135=4;
				}
				break;
			case K_WITH:
				{
				alt135=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:942:9: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6448); if (state.failed) return stmt;
					pushFollow(FOLLOW_cident_in_alterTableStatement6452);
					id=cident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement6454); if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement6458);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.alter(id, v); }
					}
					break;
				case 2 :
					// Parser.g:944:9: K_ADD ( K_IF K_NOT K_EXISTS )? (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement6471); if (state.failed) return stmt;
					// Parser.g:944:15: ( K_IF K_NOT K_EXISTS )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==K_IF) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// Parser.g:944:17: K_IF K_NOT K_EXISTS
							{
							match(input,K_IF,FOLLOW_K_IF_in_alterTableStatement6475); if (state.failed) return stmt;
							match(input,K_NOT,FOLLOW_K_NOT_in_alterTableStatement6477); if (state.failed) return stmt;
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTableStatement6479); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.ifColumnNotExists(true); }
							}
							break;

					}

					// Parser.g:945:15: (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) )
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==IDENT||LA128_0==K_ACCESS||(LA128_0 >= K_AGGREGATE && LA128_0 <= K_ALL)||LA128_0==K_AS||LA128_0==K_ASCII||(LA128_0 >= K_BIGINT && LA128_0 <= K_BOOLEAN)||(LA128_0 >= K_CALLED && LA128_0 <= K_CLUSTERING)||(LA128_0 >= K_COMPACT && LA128_0 <= K_COUNTER)||(LA128_0 >= K_CUSTOM && LA128_0 <= K_DEFAULT)||(LA128_0 >= K_DISTINCT && LA128_0 <= K_DOUBLE)||LA128_0==K_DURATION||(LA128_0 >= K_EXISTS && LA128_0 <= K_FLOAT)||LA128_0==K_FROZEN||(LA128_0 >= K_FUNCTION && LA128_0 <= K_FUNCTIONS)||(LA128_0 >= K_GROUP && LA128_0 <= K_HASHED)||(LA128_0 >= K_INET && LA128_0 <= K_INPUT)||(LA128_0 >= K_INT && LA128_0 <= K_INTERNALS)||(LA128_0 >= K_JSON && LA128_0 <= K_KEYS)||(LA128_0 >= K_KEYSPACES && LA128_0 <= K_LIKE)||(LA128_0 >= K_LIST && LA128_0 <= K_MAP)||(LA128_0 >= K_MAXWRITETIME && LA128_0 <= K_MBEANS)||LA128_0==K_NOLOGIN||LA128_0==K_NOSUPERUSER||(LA128_0 >= K_ONLY && LA128_0 <= K_OPTIONS)||(LA128_0 >= K_PARTITION && LA128_0 <= K_PERMISSIONS)||(LA128_0 >= K_REPLACE && LA128_0 <= K_RETURNS)||(LA128_0 >= K_ROLE && LA128_0 <= K_ROLES)||(LA128_0 >= K_SFUNC && LA128_0 <= K_TINYINT)||LA128_0==K_TRIGGER||(LA128_0 >= K_TTL && LA128_0 <= K_TYPES)||LA128_0==K_UNSET||(LA128_0 >= K_USER && LA128_0 <= K_USERS)||(LA128_0 >= K_UUID && LA128_0 <= K_VARINT)||LA128_0==K_WRITETIME||LA128_0==QUOTED_NAME) ) {
						alt128=1;
					}
					else if ( (LA128_0==199) ) {
						alt128=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 128, 0, input);
						throw nvae;
					}

					switch (alt128) {
						case 1 :
							// Parser.g:945:24: id= ident v= comparatorType b= isStaticColumn
							{
							pushFollow(FOLLOW_ident_in_alterTableStatement6511);
							id=ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6516);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6521);
							b=isStaticColumn();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.add(id,  v,  b);  }
							}
							break;
						case 2 :
							// Parser.g:946:18: ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' )
							{
							// Parser.g:946:18: ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' )
							// Parser.g:946:19: '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')'
							{
							match(input,199,FOLLOW_199_in_alterTableStatement6543); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6548);
							id1=ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6552);
							v1=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6556);
							b1=isStaticColumn();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.add(id1, v1, b1); }
							// Parser.g:947:18: ( ',' idn= ident vn= comparatorType bn= isStaticColumn )*
							loop127:
							while (true) {
								int alt127=2;
								int LA127_0 = input.LA(1);
								if ( (LA127_0==203) ) {
									alt127=1;
								}

								switch (alt127) {
								case 1 :
									// Parser.g:947:20: ',' idn= ident vn= comparatorType bn= isStaticColumn
									{
									match(input,203,FOLLOW_203_in_alterTableStatement6579); if (state.failed) return stmt;
									pushFollow(FOLLOW_ident_in_alterTableStatement6583);
									idn=ident();
									state._fsp--;
									if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_alterTableStatement6587);
									vn=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6591);
									bn=isStaticColumn();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { stmt.add(idn, vn, bn); }
									}
									break;

								default :
									break loop127;
								}
							}

							match(input,200,FOLLOW_200_in_alterTableStatement6598); if (state.failed) return stmt;
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:949:9: K_DROP ( K_IF K_EXISTS )? (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )?
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement6612); if (state.failed) return stmt;
					// Parser.g:949:16: ( K_IF K_EXISTS )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==K_IF) ) {
						alt129=1;
					}
					switch (alt129) {
						case 1 :
							// Parser.g:949:18: K_IF K_EXISTS
							{
							match(input,K_IF,FOLLOW_K_IF_in_alterTableStatement6616); if (state.failed) return stmt;
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTableStatement6618); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.ifColumnExists(true); }
							}
							break;

					}

					// Parser.g:950:16: (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) )
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==IDENT||LA131_0==K_ACCESS||(LA131_0 >= K_AGGREGATE && LA131_0 <= K_ALL)||LA131_0==K_AS||LA131_0==K_ASCII||(LA131_0 >= K_BIGINT && LA131_0 <= K_BOOLEAN)||(LA131_0 >= K_CALLED && LA131_0 <= K_CLUSTERING)||(LA131_0 >= K_COMPACT && LA131_0 <= K_COUNTER)||(LA131_0 >= K_CUSTOM && LA131_0 <= K_DEFAULT)||(LA131_0 >= K_DISTINCT && LA131_0 <= K_DOUBLE)||LA131_0==K_DURATION||(LA131_0 >= K_EXISTS && LA131_0 <= K_FLOAT)||LA131_0==K_FROZEN||(LA131_0 >= K_FUNCTION && LA131_0 <= K_FUNCTIONS)||(LA131_0 >= K_GROUP && LA131_0 <= K_HASHED)||(LA131_0 >= K_INET && LA131_0 <= K_INPUT)||(LA131_0 >= K_INT && LA131_0 <= K_INTERNALS)||(LA131_0 >= K_JSON && LA131_0 <= K_KEYS)||(LA131_0 >= K_KEYSPACES && LA131_0 <= K_LIKE)||(LA131_0 >= K_LIST && LA131_0 <= K_MAP)||(LA131_0 >= K_MAXWRITETIME && LA131_0 <= K_MBEANS)||LA131_0==K_NOLOGIN||LA131_0==K_NOSUPERUSER||(LA131_0 >= K_ONLY && LA131_0 <= K_OPTIONS)||(LA131_0 >= K_PARTITION && LA131_0 <= K_PERMISSIONS)||(LA131_0 >= K_REPLACE && LA131_0 <= K_RETURNS)||(LA131_0 >= K_ROLE && LA131_0 <= K_ROLES)||(LA131_0 >= K_SFUNC && LA131_0 <= K_TINYINT)||LA131_0==K_TRIGGER||(LA131_0 >= K_TTL && LA131_0 <= K_TYPES)||LA131_0==K_UNSET||(LA131_0 >= K_USER && LA131_0 <= K_USERS)||(LA131_0 >= K_UUID && LA131_0 <= K_VARINT)||LA131_0==K_WRITETIME||LA131_0==QUOTED_NAME) ) {
						alt131=1;
					}
					else if ( (LA131_0==199) ) {
						alt131=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 131, 0, input);
						throw nvae;
					}

					switch (alt131) {
						case 1 :
							// Parser.g:950:24: id= ident
							{
							pushFollow(FOLLOW_ident_in_alterTableStatement6650);
							id=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.drop(id);  }
							}
							break;
						case 2 :
							// Parser.g:951:18: ( '(' id1= ident ( ',' idn= ident )* ')' )
							{
							// Parser.g:951:18: ( '(' id1= ident ( ',' idn= ident )* ')' )
							// Parser.g:951:19: '(' id1= ident ( ',' idn= ident )* ')'
							{
							match(input,199,FOLLOW_199_in_alterTableStatement6672); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6677);
							id1=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.drop(id1); }
							// Parser.g:952:18: ( ',' idn= ident )*
							loop130:
							while (true) {
								int alt130=2;
								int LA130_0 = input.LA(1);
								if ( (LA130_0==203) ) {
									alt130=1;
								}

								switch (alt130) {
								case 1 :
									// Parser.g:952:20: ',' idn= ident
									{
									match(input,203,FOLLOW_203_in_alterTableStatement6700); if (state.failed) return stmt;
									pushFollow(FOLLOW_ident_in_alterTableStatement6704);
									idn=ident();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { stmt.drop(idn); }
									}
									break;

								default :
									break loop130;
								}
							}

							match(input,200,FOLLOW_200_in_alterTableStatement6711); if (state.failed) return stmt;
							}

							}
							break;

					}

					// Parser.g:953:16: ( K_USING K_TIMESTAMP t= INTEGER )?
					int alt132=2;
					int LA132_0 = input.LA(1);
					if ( (LA132_0==K_USING) ) {
						alt132=1;
					}
					switch (alt132) {
						case 1 :
							// Parser.g:953:18: K_USING K_TIMESTAMP t= INTEGER
							{
							match(input,K_USING,FOLLOW_K_USING_in_alterTableStatement6733); if (state.failed) return stmt;
							match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_alterTableStatement6735); if (state.failed) return stmt;
							t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_alterTableStatement6739); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.timestamp(Long.parseLong(Constants.Literal.integer((t!=null?t.getText():null)).getText())); }
							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:955:9: K_RENAME ( K_IF K_EXISTS )? (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* )
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement6755); if (state.failed) return stmt;
					// Parser.g:955:18: ( K_IF K_EXISTS )?
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( (LA133_0==K_IF) ) {
						alt133=1;
					}
					switch (alt133) {
						case 1 :
							// Parser.g:955:20: K_IF K_EXISTS
							{
							match(input,K_IF,FOLLOW_K_IF_in_alterTableStatement6759); if (state.failed) return stmt;
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTableStatement6761); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.ifColumnExists(true); }
							}
							break;

					}

					// Parser.g:956:16: (id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* )
					// Parser.g:956:25: id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )*
					{
					pushFollow(FOLLOW_ident_in_alterTableStatement6794);
					id1=ident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6796); if (state.failed) return stmt;
					pushFollow(FOLLOW_ident_in_alterTableStatement6800);
					toId1=ident();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.rename(id1, toId1); }
					// Parser.g:957:17: ( K_AND idn= ident K_TO toIdn= ident )*
					loop134:
					while (true) {
						int alt134=2;
						int LA134_0 = input.LA(1);
						if ( (LA134_0==K_AND) ) {
							alt134=1;
						}

						switch (alt134) {
						case 1 :
							// Parser.g:957:19: K_AND idn= ident K_TO toIdn= ident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement6822); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6826);
							idn=ident();
							state._fsp--;
							if (state.failed) return stmt;
							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6828); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6832);
							toIdn=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.rename(idn, toIdn); }
							}
							break;

						default :
							break loop134;
						}
					}

					}

					}
					break;
				case 5 :
					// Parser.g:959:9: K_DROP K_COMPACT K_STORAGE
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement6850); if (state.failed) return stmt;
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_alterTableStatement6852); if (state.failed) return stmt;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_alterTableStatement6854); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.dropCompactStorage(); }
					}
					break;
				case 6 :
					// Parser.g:961:9: K_WITH properties[$stmt.attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement6867); if (state.failed) return stmt;
					pushFollow(FOLLOW_properties_in_alterTableStatement6869);
					properties(stmt.attrs);
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.attrs(); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "isStaticColumn"
	// Parser.g:965:1: isStaticColumn returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean isStaticColumn() throws RecognitionException {
		boolean isStaticColumn = false;


		 boolean isStatic = false; 
		try {
			// Parser.g:967:5: ( ( K_STATIC )? )
			// Parser.g:967:7: ( K_STATIC )?
			{
			// Parser.g:967:7: ( K_STATIC )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_STATIC) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:967:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_isStaticColumn6911); if (state.failed) return isStaticColumn;
					if ( state.backtracking==0 ) { isStatic=true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { isStaticColumn = isStatic; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "isStaticColumn"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:970:1: alterMaterializedViewStatement returns [AlterViewStatement.Raw stmt] : K_ALTER K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement.Raw alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement.Raw stmt = null;


		QualifiedName name =null;


		        TableAttributes attrs = new TableAttributes();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:975:5: ( K_ALTER K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:975:7: K_ALTER K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement6947); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6949); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement6951); if (state.failed) return stmt;
			// Parser.g:975:37: ( K_IF K_EXISTS )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_IF) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:975:38: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterMaterializedViewStatement6954); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterMaterializedViewStatement6956); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6965);
			name=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement6977); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement6979);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) {
			        stmt = new AlterViewStatement.Raw(name, attrs, ifExists);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:988:1: alterTypeStatement returns [AlterTypeStatement.Raw stmt] : K_ALTER K_TYPE ( K_IF K_EXISTS )? name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? f= fident v= comparatorType | K_RENAME ( K_IF K_EXISTS )? f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* ) ;
	public final AlterTypeStatement.Raw alterTypeStatement() throws RecognitionException {
		AlterTypeStatement.Raw stmt = null;


		UTName name =null;
		FieldIdentifier f =null;
		CQL3Type.Raw v =null;
		FieldIdentifier f1 =null;
		FieldIdentifier toF1 =null;
		FieldIdentifier fn =null;
		FieldIdentifier toFn =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:992:5: ( K_ALTER K_TYPE ( K_IF K_EXISTS )? name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? f= fident v= comparatorType | K_RENAME ( K_IF K_EXISTS )? f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* ) )
			// Parser.g:992:7: K_ALTER K_TYPE ( K_IF K_EXISTS )? name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? f= fident v= comparatorType | K_RENAME ( K_IF K_EXISTS )? f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement7019); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement7021); if (state.failed) return stmt;
			// Parser.g:992:22: ( K_IF K_EXISTS )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_IF) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:992:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterTypeStatement7024); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTypeStatement7026); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement7035);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterTypeStatement.Raw(name, ifExists); }
			// Parser.g:993:7: ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD ( K_IF K_NOT K_EXISTS )? f= fident v= comparatorType | K_RENAME ( K_IF K_EXISTS )? f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* )
			int alt142=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt142=1;
				}
				break;
			case K_ADD:
				{
				alt142=2;
				}
				break;
			case K_RENAME:
				{
				alt142=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 142, 0, input);
				throw nvae;
			}
			switch (alt142) {
				case 1 :
					// Parser.g:994:9: K_ALTER f= fident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement7055); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement7061);
					f=fident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement7063); if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement7067);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.alter(f, v); }
					}
					break;
				case 2 :
					// Parser.g:996:9: K_ADD ( K_IF K_NOT K_EXISTS )? f= fident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement7080); if (state.failed) return stmt;
					// Parser.g:996:15: ( K_IF K_NOT K_EXISTS )?
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==K_IF) ) {
						alt139=1;
					}
					switch (alt139) {
						case 1 :
							// Parser.g:996:16: K_IF K_NOT K_EXISTS
							{
							match(input,K_IF,FOLLOW_K_IF_in_alterTypeStatement7083); if (state.failed) return stmt;
							match(input,K_NOT,FOLLOW_K_NOT_in_alterTypeStatement7085); if (state.failed) return stmt;
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTypeStatement7087); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.ifFieldNotExists(true); }
							}
							break;

					}

					pushFollow(FOLLOW_fident_in_alterTypeStatement7100);
					f=fident();
					state._fsp--;
					if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement7104);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.add(f, v); }
					}
					break;
				case 3 :
					// Parser.g:998:9: K_RENAME ( K_IF K_EXISTS )? f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement7124); if (state.failed) return stmt;
					// Parser.g:998:18: ( K_IF K_EXISTS )?
					int alt140=2;
					int LA140_0 = input.LA(1);
					if ( (LA140_0==K_IF) ) {
						alt140=1;
					}
					switch (alt140) {
						case 1 :
							// Parser.g:998:19: K_IF K_EXISTS
							{
							match(input,K_IF,FOLLOW_K_IF_in_alterTypeStatement7127); if (state.failed) return stmt;
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterTypeStatement7129); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.ifFieldExists(true); }
							}
							break;

					}

					pushFollow(FOLLOW_fident_in_alterTypeStatement7138);
					f1=fident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement7140); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement7144);
					toF1=fident();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.rename(f1, toF1); }
					// Parser.g:999:10: ( K_AND fn= fident K_TO toFn= fident )*
					loop141:
					while (true) {
						int alt141=2;
						int LA141_0 = input.LA(1);
						if ( (LA141_0==K_AND) ) {
							alt141=1;
						}

						switch (alt141) {
						case 1 :
							// Parser.g:999:12: K_AND fn= fident K_TO toFn= fident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement7166); if (state.failed) return stmt;
							pushFollow(FOLLOW_fident_in_alterTypeStatement7170);
							fn=fident();
							state._fsp--;
							if (state.failed) return stmt;
							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement7172); if (state.failed) return stmt;
							pushFollow(FOLLOW_fident_in_alterTypeStatement7176);
							toFn=fident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.rename(fn, toFn); }
							}
							break;

						default :
							break loop141;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:1006:1: dropKeyspaceStatement returns [DropKeyspaceStatement.Raw stmt] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement.Raw dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement.Raw stmt = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1008:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:1008:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement7228); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement7230); if (state.failed) return stmt;
			// Parser.g:1008:25: ( K_IF K_EXISTS )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==K_IF) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// Parser.g:1008:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement7233); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement7235); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement7244);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropKeyspaceStatement.Raw(ks, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:1014:1: dropTableStatement returns [DropTableStatement.Raw stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName ;
	public final DropTableStatement.Raw dropTableStatement() throws RecognitionException {
		DropTableStatement.Raw stmt = null;


		QualifiedName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1016:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName )
			// Parser.g:1016:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement7278); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7280); if (state.failed) return stmt;
			// Parser.g:1016:29: ( K_IF K_EXISTS )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==K_IF) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// Parser.g:1016:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement7283); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement7285); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement7294);
			name=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTableStatement.Raw(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:1022:1: dropTypeStatement returns [DropTypeStatement.Raw stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement.Raw dropTypeStatement() throws RecognitionException {
		DropTypeStatement.Raw stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1024:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:1024:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement7328); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement7330); if (state.failed) return stmt;
			// Parser.g:1024:21: ( K_IF K_EXISTS )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==K_IF) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// Parser.g:1024:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement7333); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement7335); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement7344);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTypeStatement.Raw(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:1030:1: dropIndexStatement returns [DropIndexStatement.Raw stmt] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement.Raw dropIndexStatement() throws RecognitionException {
		DropIndexStatement.Raw stmt = null;


		QualifiedName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1032:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:1032:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement7378); if (state.failed) return stmt;
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement7380); if (state.failed) return stmt;
			// Parser.g:1032:22: ( K_IF K_EXISTS )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==K_IF) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// Parser.g:1032:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement7383); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement7385); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement7394);
			index=indexName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropIndexStatement.Raw(index, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:1039:1: dropMaterializedViewStatement returns [DropViewStatement.Raw stmt] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement.Raw dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement.Raw stmt = null;


		QualifiedName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1041:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:1041:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement7434); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7436); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement7438); if (state.failed) return stmt;
			// Parser.g:1041:36: ( K_IF K_EXISTS )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==K_IF) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// Parser.g:1041:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement7441); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7443); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7452);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropViewStatement.Raw(cf, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:1048:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		QualifiedName cf =null;

		try {
			// Parser.g:1049:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:1049:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement7483); if (state.failed) return stmt;
			// Parser.g:1049:18: ( K_COLUMNFAMILY )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==K_COLUMNFAMILY) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// Parser.g:1049:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement7486); if (state.failed) return stmt;
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement7492);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new TruncateStatement(cf); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:1055:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:1056:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:1056:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement7517); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement7529);
			permissionOrAll1=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement7537); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement7549);
			resource2=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement7557); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement7571);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:1068:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:1069:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:1069:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement7602); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement7614);
			permissionOrAll3=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement7622); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement7634);
			resource4=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement7642); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement7656);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:1081:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:1082:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:1082:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement7687); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7701);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement7709); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7723);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantRoleStatement(role, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:1092:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:1093:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:1093:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement7754); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7768);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement7776); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7790);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokeRoleStatement(role, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:1100:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1106:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1106:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement7828); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement7840);
			permissionOrAll6=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1108:7: ( K_ON resource )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==K_ON) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// Parser.g:1108:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement7850); if (state.failed) return stmt;
					pushFollow(FOLLOW_resource_in_listPermissionsStatement7852);
					resource5=resource();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { resource = resource5; }
					}
					break;

			}

			// Parser.g:1109:7: ( K_OF roleName[grantee] )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==K_OF) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// Parser.g:1109:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement7867); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement7869);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1110:7: ( K_NORECURSIVE )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==K_NORECURSIVE) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// Parser.g:1110:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7883); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:1114:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:1115:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:1115:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return perm;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:1119:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? ( ',' p= permission ( K_PERMISSION )? )* );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:1120:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? ( ',' p= permission ( K_PERMISSION )? )* )
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==K_ALL) ) {
				alt156=1;
			}
			else if ( (LA156_0==K_ALTER||LA156_0==K_AUTHORIZE||LA156_0==K_CREATE||LA156_0==K_DESCRIBE||LA156_0==K_DROP||LA156_0==K_EXECUTE||LA156_0==K_MODIFY||LA156_0==K_SELECT) ) {
				alt156=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return perms;}
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}

			switch (alt156) {
				case 1 :
					// Parser.g:1120:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll7976); if (state.failed) return perms;
					// Parser.g:1120:13: ( K_PERMISSIONS )?
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==K_PERMISSIONS) ) {
						alt152=1;
					}
					switch (alt152) {
						case 1 :
							// Parser.g:1120:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll7980); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = Permission.ALL; }
					}
					break;
				case 2 :
					// Parser.g:1121:7: p= permission ( K_PERMISSION )? ( ',' p= permission ( K_PERMISSION )? )*
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll8001);
					p=permission();
					state._fsp--;
					if (state.failed) return perms;
					// Parser.g:1121:20: ( K_PERMISSION )?
					int alt153=2;
					int LA153_0 = input.LA(1);
					if ( (LA153_0==K_PERMISSION) ) {
						alt153=1;
					}
					switch (alt153) {
						case 1 :
							// Parser.g:1121:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll8005); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = EnumSet.of(p); }
					// Parser.g:1121:72: ( ',' p= permission ( K_PERMISSION )? )*
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==203) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// Parser.g:1121:74: ',' p= permission ( K_PERMISSION )?
							{
							match(input,203,FOLLOW_203_in_permissionOrAll8014); if (state.failed) return perms;
							pushFollow(FOLLOW_permission_in_permissionOrAll8018);
							p=permission();
							state._fsp--;
							if (state.failed) return perms;
							// Parser.g:1121:91: ( K_PERMISSION )?
							int alt154=2;
							int LA154_0 = input.LA(1);
							if ( (LA154_0==K_PERMISSION) ) {
								alt154=1;
							}
							switch (alt154) {
								case 1 :
									// Parser.g:1121:93: K_PERMISSION
									{
									match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll8022); if (state.failed) return perms;
									}
									break;

							}

							if ( state.backtracking==0 ) { perms.add(p); }
							}
							break;

						default :
							break loop155;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:1124:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:1125:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt157=4;
			alt157 = dfa157.predict(input);
			switch (alt157) {
				case 1 :
					// Parser.g:1125:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource8053);
					d=dataResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = d; }
					}
					break;
				case 2 :
					// Parser.g:1126:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource8065);
					r=roleResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = r; }
					}
					break;
				case 3 :
					// Parser.g:1127:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource8077);
					f=functionResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = f; }
					}
					break;
				case 4 :
					// Parser.g:1128:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource8089);
					j=jmxResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = j; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:1131:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName | K_ALL K_TABLES K_IN K_KEYSPACE ks= keyspaceName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		QualifiedName cf =null;

		try {
			// Parser.g:1132:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName | K_ALL K_TABLES K_IN K_KEYSPACE ks= keyspaceName )
			int alt159=4;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				switch ( input.LA(2) ) {
				case K_KEYSPACES:
					{
					alt159=1;
					}
					break;
				case K_TABLES:
					{
					alt159=4;
					}
					break;
				case EOF:
				case K_FROM:
				case K_NORECURSIVE:
				case K_OF:
				case K_TO:
				case 206:
				case 209:
					{
					alt159=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 159, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_KEYSPACE:
				{
				alt159=2;
				}
				break;
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt159=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// Parser.g:1132:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource8112); if (state.failed) return res;
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource8114); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1133:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource8124); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_dataResource8130);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1134:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:1134:7: ( K_COLUMNFAMILY )?
					int alt158=2;
					int LA158_0 = input.LA(1);
					if ( (LA158_0==K_COLUMNFAMILY) ) {
						alt158=1;
					}
					switch (alt158) {
						case 1 :
							// Parser.g:1134:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource8142); if (state.failed) return res;
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource8151);
					cf=columnFamilyName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.table(cf.getKeyspace(), cf.getName()); }
					}
					break;
				case 4 :
					// Parser.g:1135:7: K_ALL K_TABLES K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource8161); if (state.failed) return res;
					match(input,K_TABLES,FOLLOW_K_TABLES_in_dataResource8163); if (state.failed) return res;
					match(input,K_IN,FOLLOW_K_IN_in_dataResource8165); if (state.failed) return res;
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource8167); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_dataResource8173);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.allTables(ks); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:1138:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:1139:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt160=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt160=1;
				}
				break;
			case K_MBEAN:
				{
				alt160=2;
				}
				break;
			case K_MBEANS:
				{
				alt160=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}
			switch (alt160) {
				case 1 :
					// Parser.g:1139:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource8196); if (state.failed) return res;
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource8198); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1142:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource8218); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource8220);
					mbean7=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); }
					}
					break;
				case 3 :
					// Parser.g:1143:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource8230); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource8232);
					mbean8=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:1146:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:1147:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==K_ALL) ) {
				alt161=1;
			}
			else if ( (LA161_0==K_ROLE) ) {
				alt161=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}

			switch (alt161) {
				case 1 :
					// Parser.g:1147:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource8255); if (state.failed) return res;
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource8257); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1148:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource8267); if (state.failed) return res;
					pushFollow(FOLLOW_userOrRoleName_in_roleResource8273);
					role=userOrRoleName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.role(role.getName()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:1151:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:1155:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt164=3;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==K_ALL) ) {
				int LA164_1 = input.LA(2);
				if ( (LA164_1==K_FUNCTIONS) ) {
					int LA164_3 = input.LA(3);
					if ( (LA164_3==K_IN) ) {
						alt164=2;
					}
					else if ( (LA164_3==EOF||LA164_3==K_FROM||LA164_3==K_NORECURSIVE||LA164_3==K_OF||LA164_3==K_TO||LA164_3==209) ) {
						alt164=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return res;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 164, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 164, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA164_0==K_FUNCTION) ) {
				alt164=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// Parser.g:1155:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8305); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8307); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1156:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8317); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8319); if (state.failed) return res;
					match(input,K_IN,FOLLOW_K_IN_in_functionResource8321); if (state.failed) return res;
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource8323); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_functionResource8329);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1158:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource8344); if (state.failed) return res;
					pushFollow(FOLLOW_functionName_in_functionResource8348);
					fn=functionName();
					state._fsp--;
					if (state.failed) return res;
					// Parser.g:1159:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:1160:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,199,FOLLOW_199_in_functionResource8366); if (state.failed) return res;
					// Parser.g:1161:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==IDENT||LA163_0==K_ACCESS||(LA163_0 >= K_AGGREGATE && LA163_0 <= K_ALL)||LA163_0==K_AS||LA163_0==K_ASCII||(LA163_0 >= K_BIGINT && LA163_0 <= K_BOOLEAN)||(LA163_0 >= K_CALLED && LA163_0 <= K_CLUSTERING)||(LA163_0 >= K_COMPACT && LA163_0 <= K_COUNTER)||(LA163_0 >= K_CUSTOM && LA163_0 <= K_DEFAULT)||(LA163_0 >= K_DISTINCT && LA163_0 <= K_DOUBLE)||LA163_0==K_DURATION||(LA163_0 >= K_EXISTS && LA163_0 <= K_FLOAT)||LA163_0==K_FROZEN||(LA163_0 >= K_FUNCTION && LA163_0 <= K_FUNCTIONS)||(LA163_0 >= K_GROUP && LA163_0 <= K_HASHED)||(LA163_0 >= K_INET && LA163_0 <= K_INPUT)||(LA163_0 >= K_INT && LA163_0 <= K_INTERNALS)||(LA163_0 >= K_JSON && LA163_0 <= K_KEYS)||(LA163_0 >= K_KEYSPACES && LA163_0 <= K_LIKE)||(LA163_0 >= K_LIST && LA163_0 <= K_MAP)||(LA163_0 >= K_MAXWRITETIME && LA163_0 <= K_MBEANS)||LA163_0==K_NOLOGIN||LA163_0==K_NOSUPERUSER||(LA163_0 >= K_ONLY && LA163_0 <= K_OPTIONS)||(LA163_0 >= K_PARTITION && LA163_0 <= K_PERMISSIONS)||(LA163_0 >= K_REPLACE && LA163_0 <= K_RETURNS)||(LA163_0 >= K_ROLE && LA163_0 <= K_ROLES)||(LA163_0 >= K_SET && LA163_0 <= K_TINYINT)||LA163_0==K_TRIGGER||(LA163_0 >= K_TTL && LA163_0 <= K_TYPES)||LA163_0==K_UNSET||(LA163_0 >= K_USER && LA163_0 <= K_USERS)||(LA163_0 >= K_UUID && LA163_0 <= K_VARINT)||LA163_0==K_WRITETIME||LA163_0==QUOTED_NAME||LA163_0==STRING_LITERAL) ) {
						alt163=1;
					}
					switch (alt163) {
						case 1 :
							// Parser.g:1162:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource8394);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return res;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							// Parser.g:1163:13: ( ',' v= comparatorType )*
							loop162:
							while (true) {
								int alt162=2;
								int LA162_0 = input.LA(1);
								if ( (LA162_0==203) ) {
									alt162=1;
								}

								switch (alt162) {
								case 1 :
									// Parser.g:1163:15: ',' v= comparatorType
									{
									match(input,203,FOLLOW_203_in_functionResource8412); if (state.failed) return res;
									pushFollow(FOLLOW_comparatorType_in_functionResource8416);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return res;
									if ( state.backtracking==0 ) { argsTypes.add(v); }
									}
									break;

								default :
									break loop162;
								}
							}

							}
							break;

					}

					match(input,200,FOLLOW_200_in_functionResource8444); if (state.failed) return res;
					}

					if ( state.backtracking==0 ) { res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1173:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1181:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1181:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement8492); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement8494); if (state.failed) return stmt;
			// Parser.g:1181:23: ( K_IF K_NOT K_EXISTS )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==K_IF) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// Parser.g:1181:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement8497); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement8499); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement8501); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement8509);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1182:7: ( K_WITH userPassword[opts] )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==K_WITH) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// Parser.g:1182:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement8521); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_createUserStatement8523);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1183:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt167=3;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==K_SUPERUSER) ) {
				alt167=1;
			}
			else if ( (LA167_0==K_NOSUPERUSER) ) {
				alt167=2;
			}
			switch (alt167) {
				case 1 :
					// Parser.g:1183:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement8537); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = true; }
					}
					break;
				case 2 :
					// Parser.g:1183:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement8543); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        if (opts.getPassword().isPresent() && opts.getHashedPassword().isPresent())
			        {
			           throw new SyntaxException("Options 'password' and 'hashed password' are mutually exclusive");
			        }
			        stmt = new CreateRoleStatement(name, opts, DCPermissions.all(), ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1195:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER ( K_IF K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:1201:5: ( K_ALTER K_USER ( K_IF K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1201:7: K_ALTER K_USER ( K_IF K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement8588); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement8590); if (state.failed) return stmt;
			// Parser.g:1201:22: ( K_IF K_EXISTS )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==K_IF) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// Parser.g:1201:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterUserStatement8593); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterUserStatement8595); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_alterUserStatement8603);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1202:7: ( K_WITH userPassword[opts] )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==K_WITH) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// Parser.g:1202:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement8615); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_alterUserStatement8617);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1203:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt170=3;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==K_SUPERUSER) ) {
				alt170=1;
			}
			else if ( (LA170_0==K_NOSUPERUSER) ) {
				alt170=2;
			}
			switch (alt170) {
				case 1 :
					// Parser.g:1203:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement8631); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, true); }
					}
					break;
				case 2 :
					// Parser.g:1204:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement8645); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, false); }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			         if (opts.getPassword().isPresent() && opts.getHashedPassword().isPresent())
			         {
			            throw new SyntaxException("Options 'password' and 'hashed password' are mutually exclusive");
			         }
			         stmt = new AlterRoleStatement(name, opts, null, ifExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1217:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1222:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1222:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement8691); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement8693); if (state.failed) return stmt;
			// Parser.g:1222:21: ( K_IF K_EXISTS )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==K_IF) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// Parser.g:1222:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement8696); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement8698); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement8706);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1228:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1229:5: ( K_LIST K_USERS )
			// Parser.g:1229:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement8731); if (state.failed) return stmt;
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement8733); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new ListUsersStatement(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1241:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        DCPermissions.Builder dcperms = DCPermissions.builder();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1247:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? )
			// Parser.g:1247:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement8767); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement8769); if (state.failed) return stmt;
			// Parser.g:1247:23: ( K_IF K_NOT K_EXISTS )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==K_IF) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// Parser.g:1247:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement8772); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement8774); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement8776); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement8784);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1248:7: ( K_WITH roleOptions[opts, dcperms] )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==K_WITH) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// Parser.g:1248:9: K_WITH roleOptions[opts, dcperms]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement8794); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement8796);
					roleOptions(opts, dcperms);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        if (opts.getPassword().isPresent() && opts.getHashedPassword().isPresent())
			        {
			            throw new SyntaxException("Options 'password' and 'hashed password' are mutually exclusive");
			        }
			        stmt = new CreateRoleStatement(name, opts, dcperms.build(), ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1276:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        DCPermissions.Builder dcperms = DCPermissions.builder();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:1282:5: ( K_ALTER K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? )
			// Parser.g:1282:7: K_ALTER K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement8840); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement8842); if (state.failed) return stmt;
			// Parser.g:1282:22: ( K_IF K_EXISTS )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==K_IF) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// Parser.g:1282:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_alterRoleStatement8845); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_alterRoleStatement8847); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement8855);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1283:7: ( K_WITH roleOptions[opts, dcperms] )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==K_WITH) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// Parser.g:1283:9: K_WITH roleOptions[opts, dcperms]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement8865); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement8867);
					roleOptions(opts, dcperms);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			         if (opts.getPassword().isPresent() && opts.getHashedPassword().isPresent())
			         {
			            throw new SyntaxException("Options 'password' and 'hashed password' are mutually exclusive");
			         }
			         stmt = new AlterRoleStatement(name, opts, dcperms.isModified() ? dcperms.build() : null, ifExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1296:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1300:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1300:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement8911); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement8913); if (state.failed) return stmt;
			// Parser.g:1300:21: ( K_IF K_EXISTS )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==K_IF) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// Parser.g:1300:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement8916); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement8918); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement8926);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1307:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1312:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1312:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement8966); if (state.failed) return stmt;
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement8968); if (state.failed) return stmt;
			// Parser.g:1313:7: ( K_OF roleName[grantee] )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==K_OF) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// Parser.g:1313:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement8978); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listRolesStatement8980);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1314:7: ( K_NORECURSIVE )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==K_NORECURSIVE) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// Parser.g:1314:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement8993); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListRolesStatement(grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1318:1: roleOptions[RoleOptions opts, DCPermissions.Builder dcperms] : roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )* ;
	public final void roleOptions(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
		try {
			// Parser.g:1319:5: ( roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )* )
			// Parser.g:1319:7: roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions9024);
			roleOption(opts, dcperms);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1319:33: ( K_AND roleOption[opts, dcperms] )*
			loop179:
			while (true) {
				int alt179=2;
				int LA179_0 = input.LA(1);
				if ( (LA179_0==K_AND) ) {
					alt179=1;
				}

				switch (alt179) {
				case 1 :
					// Parser.g:1319:34: K_AND roleOption[opts, dcperms]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions9028); if (state.failed) return;
					pushFollow(FOLLOW_roleOption_in_roleOptions9030);
					roleOption(opts, dcperms);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop179;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1322:1: roleOption[RoleOptions opts, DCPermissions.Builder dcperms] : ( K_PASSWORD '=' v= STRING_LITERAL | K_HASHED K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN | K_ACCESS K_TO K_ALL K_DATACENTERS | K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}' );
	public final void roleOption(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1323:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_HASHED K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN | K_ACCESS K_TO K_ALL K_DATACENTERS | K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}' )
			int alt181=7;
			alt181 = dfa181.predict(input);
			switch (alt181) {
				case 1 :
					// Parser.g:1323:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption9052); if (state.failed) return;
					match(input,212,FOLLOW_212_in_roleOption9054); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption9058); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1324:8: K_HASHED K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_HASHED,FOLLOW_K_HASHED_in_roleOption9069); if (state.failed) return;
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption9071); if (state.failed) return;
					match(input,212,FOLLOW_212_in_roleOption9073); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption9077); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.HASHED_PASSWORD, (v!=null?v.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1325:8: K_OPTIONS '=' m= fullMapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption9088); if (state.failed) return;
					match(input,212,FOLLOW_212_in_roleOption9090); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_roleOption9094);
					m=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); }
					}
					break;
				case 4 :
					// Parser.g:1326:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption9105); if (state.failed) return;
					match(input,212,FOLLOW_212_in_roleOption9107); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption9111); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;
				case 5 :
					// Parser.g:1327:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption9122); if (state.failed) return;
					match(input,212,FOLLOW_212_in_roleOption9124); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption9128); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;
				case 6 :
					// Parser.g:1328:8: K_ACCESS K_TO K_ALL K_DATACENTERS
					{
					match(input,K_ACCESS,FOLLOW_K_ACCESS_in_roleOption9139); if (state.failed) return;
					match(input,K_TO,FOLLOW_K_TO_in_roleOption9141); if (state.failed) return;
					match(input,K_ALL,FOLLOW_K_ALL_in_roleOption9143); if (state.failed) return;
					match(input,K_DATACENTERS,FOLLOW_K_DATACENTERS_in_roleOption9145); if (state.failed) return;
					if ( state.backtracking==0 ) { dcperms.all(); }
					}
					break;
				case 7 :
					// Parser.g:1329:8: K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}'
					{
					match(input,K_ACCESS,FOLLOW_K_ACCESS_in_roleOption9156); if (state.failed) return;
					match(input,K_TO,FOLLOW_K_TO_in_roleOption9158); if (state.failed) return;
					match(input,K_DATACENTERS,FOLLOW_K_DATACENTERS_in_roleOption9160); if (state.failed) return;
					match(input,219,FOLLOW_219_in_roleOption9162); if (state.failed) return;
					pushFollow(FOLLOW_dcPermission_in_roleOption9164);
					dcPermission(dcperms);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1329:62: ( ',' dcPermission[dcperms] )*
					loop180:
					while (true) {
						int alt180=2;
						int LA180_0 = input.LA(1);
						if ( (LA180_0==203) ) {
							alt180=1;
						}

						switch (alt180) {
						case 1 :
							// Parser.g:1329:63: ',' dcPermission[dcperms]
							{
							match(input,203,FOLLOW_203_in_roleOption9168); if (state.failed) return;
							pushFollow(FOLLOW_dcPermission_in_roleOption9170);
							dcPermission(dcperms);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop180;
						}
					}

					match(input,220,FOLLOW_220_in_roleOption9175); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "dcPermission"
	// Parser.g:1332:1: dcPermission[DCPermissions.Builder builder] : dc= STRING_LITERAL ;
	public final void dcPermission(DCPermissions.Builder builder) throws RecognitionException {
		Token dc=null;

		try {
			// Parser.g:1333:5: (dc= STRING_LITERAL )
			// Parser.g:1333:7: dc= STRING_LITERAL
			{
			dc=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dcPermission9195); if (state.failed) return;
			if ( state.backtracking==0 ) { builder.add((dc!=null?dc.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dcPermission"



	// $ANTLR start "userPassword"
	// Parser.g:1337:1: userPassword[RoleOptions opts] : ( K_PASSWORD v= STRING_LITERAL | K_HASHED K_PASSWORD v= STRING_LITERAL );
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1338:5: ( K_PASSWORD v= STRING_LITERAL | K_HASHED K_PASSWORD v= STRING_LITERAL )
			int alt182=2;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==K_PASSWORD) ) {
				alt182=1;
			}
			else if ( (LA182_0==K_HASHED) ) {
				alt182=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}

			switch (alt182) {
				case 1 :
					// Parser.g:1338:8: K_PASSWORD v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword9217); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword9221); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1339:8: K_HASHED K_PASSWORD v= STRING_LITERAL
					{
					match(input,K_HASHED,FOLLOW_K_HASHED_in_userPassword9232); if (state.failed) return;
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword9234); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword9238); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.HASHED_PASSWORD, (v!=null?v.getText():null)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "describeStatement"
	// Parser.g:1348:1: describeStatement returns [DescribeStatement stmt] : ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )? ;
	public final DescribeStatement describeStatement() throws RecognitionException {
		DescribeStatement stmt = null;


		Token ksT=null;
		Token tT=null;
		String ks =null;
		QualifiedName cf =null;
		QualifiedName idx =null;
		QualifiedName view =null;
		UTName tn =null;
		FunctionName fn =null;
		FunctionName ag =null;
		String ksK =null;
		String tK =null;


		        boolean fullSchema = false;
		        boolean pending = false;
		        boolean config = false;
		        boolean only = false;
		        QualifiedName gen = new QualifiedName();
		    
		try {
			// Parser.g:1356:5: ( ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )? )
			// Parser.g:1356:7: ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )?
			{
			if ( (input.LA(1) >= K_DESC && input.LA(1) <= K_DESCRIBE) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return stmt;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Parser.g:1357:5: ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) )
			int alt189=15;
			alt189 = dfa189.predict(input);
			switch (alt189) {
				case 1 :
					// Parser.g:1357:7: ( K_CLUSTER )=> K_CLUSTER
					{
					match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_describeStatement9293); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.cluster(); }
					}
					break;
				case 2 :
					// Parser.g:1358:7: ( K_FULL )? K_SCHEMA
					{
					// Parser.g:1358:7: ( K_FULL )?
					int alt183=2;
					int LA183_0 = input.LA(1);
					if ( (LA183_0==K_FULL) ) {
						alt183=1;
					}
					switch (alt183) {
						case 1 :
							// Parser.g:1358:8: K_FULL
							{
							match(input,K_FULL,FOLLOW_K_FULL_in_describeStatement9324); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { fullSchema=true; }
							}
							break;

					}

					match(input,K_SCHEMA,FOLLOW_K_SCHEMA_in_describeStatement9330); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.schema(fullSchema); }
					}
					break;
				case 3 :
					// Parser.g:1359:7: ( K_KEYSPACES )=> K_KEYSPACES
					{
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_describeStatement9349); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.keyspaces(); }
					}
					break;
				case 4 :
					// Parser.g:1360:7: ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )?
					{
					// Parser.g:1360:7: ( K_ONLY )?
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==K_ONLY) ) {
						alt184=1;
					}
					switch (alt184) {
						case 1 :
							// Parser.g:1360:8: K_ONLY
							{
							match(input,K_ONLY,FOLLOW_K_ONLY_in_describeStatement9376); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { only=true; }
							}
							break;

					}

					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_describeStatement9382); if (state.failed) return stmt;
					// Parser.g:1360:43: (ks= keyspaceName )?
					int alt185=2;
					int LA185_0 = input.LA(1);
					if ( (LA185_0==IDENT||LA185_0==K_ACCESS||(LA185_0 >= K_AGGREGATE && LA185_0 <= K_ALL)||LA185_0==K_AS||LA185_0==K_ASCII||(LA185_0 >= K_BIGINT && LA185_0 <= K_BOOLEAN)||(LA185_0 >= K_CALLED && LA185_0 <= K_CLUSTERING)||(LA185_0 >= K_COMPACT && LA185_0 <= K_COUNTER)||(LA185_0 >= K_CUSTOM && LA185_0 <= K_DEFAULT)||(LA185_0 >= K_DISTINCT && LA185_0 <= K_DOUBLE)||LA185_0==K_DURATION||(LA185_0 >= K_EXISTS && LA185_0 <= K_FLOAT)||LA185_0==K_FROZEN||(LA185_0 >= K_FUNCTION && LA185_0 <= K_FUNCTIONS)||(LA185_0 >= K_GROUP && LA185_0 <= K_HASHED)||(LA185_0 >= K_INET && LA185_0 <= K_INPUT)||(LA185_0 >= K_INT && LA185_0 <= K_INTERNALS)||(LA185_0 >= K_JSON && LA185_0 <= K_KEYS)||(LA185_0 >= K_KEYSPACES && LA185_0 <= K_LIKE)||(LA185_0 >= K_LIST && LA185_0 <= K_MAP)||(LA185_0 >= K_MAXWRITETIME && LA185_0 <= K_MBEANS)||LA185_0==K_NOLOGIN||LA185_0==K_NOSUPERUSER||(LA185_0 >= K_ONLY && LA185_0 <= K_OPTIONS)||(LA185_0 >= K_PARTITION && LA185_0 <= K_PERMISSIONS)||(LA185_0 >= K_REPLACE && LA185_0 <= K_RETURNS)||(LA185_0 >= K_ROLE && LA185_0 <= K_ROLES)||(LA185_0 >= K_SFUNC && LA185_0 <= K_TINYINT)||LA185_0==K_TRIGGER||(LA185_0 >= K_TTL && LA185_0 <= K_TYPES)||LA185_0==K_UNSET||(LA185_0 >= K_USER && LA185_0 <= K_USERS)||(LA185_0 >= K_UUID && LA185_0 <= K_VARINT)||LA185_0==K_WRITETIME||(LA185_0 >= QMARK && LA185_0 <= QUOTED_NAME)) ) {
						alt185=1;
					}
					switch (alt185) {
						case 1 :
							// Parser.g:1360:45: ks= keyspaceName
							{
							pushFollow(FOLLOW_keyspaceName_in_describeStatement9388);
							ks=keyspaceName();
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt = DescribeStatement.keyspace(ks, only); }
					}
					break;
				case 5 :
					// Parser.g:1362:7: ( K_TABLES )=> K_TABLES
					{
					match(input,K_TABLES,FOLLOW_K_TABLES_in_describeStatement9457); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.tables(); }
					}
					break;
				case 6 :
					// Parser.g:1363:7: K_COLUMNFAMILY cf= columnFamilyName
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_describeStatement9488); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9492);
					cf=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.table(cf.getKeyspace(), cf.getName()); }
					}
					break;
				case 7 :
					// Parser.g:1364:7: K_INDEX idx= columnFamilyName
					{
					match(input,K_INDEX,FOLLOW_K_INDEX_in_describeStatement9511); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9515);
					idx=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.index(idx.getKeyspace(), idx.getName()); }
					}
					break;
				case 8 :
					// Parser.g:1365:7: K_MATERIALIZED K_VIEW view= columnFamilyName
					{
					match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_describeStatement9540); if (state.failed) return stmt;
					match(input,K_VIEW,FOLLOW_K_VIEW_in_describeStatement9542); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9546);
					view=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.view(view.getKeyspace(), view.getName()); }
					}
					break;
				case 9 :
					// Parser.g:1366:7: ( K_TYPES )=> K_TYPES
					{
					match(input,K_TYPES,FOLLOW_K_TYPES_in_describeStatement9562); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.types(); }
					}
					break;
				case 10 :
					// Parser.g:1367:7: K_TYPE tn= userTypeName
					{
					match(input,K_TYPE,FOLLOW_K_TYPE_in_describeStatement9595); if (state.failed) return stmt;
					pushFollow(FOLLOW_userTypeName_in_describeStatement9599);
					tn=userTypeName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.type(tn.getKeyspace(), tn.getStringTypeName()); }
					}
					break;
				case 11 :
					// Parser.g:1368:7: ( K_FUNCTIONS )=> K_FUNCTIONS
					{
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_describeStatement9636); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.functions(); }
					}
					break;
				case 12 :
					// Parser.g:1369:7: K_FUNCTION fn= functionName
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_describeStatement9661); if (state.failed) return stmt;
					pushFollow(FOLLOW_functionName_in_describeStatement9665);
					fn=functionName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.function(fn.keyspace, fn.name); }
					}
					break;
				case 13 :
					// Parser.g:1370:7: ( K_AGGREGATES )=> K_AGGREGATES
					{
					match(input,K_AGGREGATES,FOLLOW_K_AGGREGATES_in_describeStatement9698); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.aggregates(); }
					}
					break;
				case 14 :
					// Parser.g:1371:7: K_AGGREGATE ag= functionName
					{
					match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_describeStatement9721); if (state.failed) return stmt;
					pushFollow(FOLLOW_functionName_in_describeStatement9725);
					ag=functionName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.aggregate(ag.keyspace, ag.name); }
					}
					break;
				case 15 :
					// Parser.g:1372:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword )
					{
					// Parser.g:1372:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )?
					int alt187=2;
					alt187 = dfa187.predict(input);
					switch (alt187) {
						case 1 :
							// Parser.g:1372:9: (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.'
							{
							// Parser.g:1372:9: (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword )
							int alt186=3;
							switch ( input.LA(1) ) {
							case IDENT:
								{
								alt186=1;
								}
								break;
							case QUOTED_NAME:
								{
								alt186=2;
								}
								break;
							case K_ACCESS:
							case K_AGGREGATE:
							case K_AGGREGATES:
							case K_ALL:
							case K_AS:
							case K_ASCII:
							case K_BIGINT:
							case K_BLOB:
							case K_BOOLEAN:
							case K_CALLED:
							case K_CAST:
							case K_CLUSTER:
							case K_CLUSTERING:
							case K_COMPACT:
							case K_CONTAINS:
							case K_COUNT:
							case K_COUNTER:
							case K_CUSTOM:
							case K_DATACENTERS:
							case K_DATE:
							case K_DECIMAL:
							case K_DEFAULT:
							case K_DISTINCT:
							case K_DOUBLE:
							case K_DURATION:
							case K_EXISTS:
							case K_FILTERING:
							case K_FINALFUNC:
							case K_FLOAT:
							case K_FROZEN:
							case K_FUNCTION:
							case K_FUNCTIONS:
							case K_GROUP:
							case K_HASHED:
							case K_INET:
							case K_INITCOND:
							case K_INPUT:
							case K_INT:
							case K_INTERNALS:
							case K_JSON:
							case K_KEY:
							case K_KEYS:
							case K_KEYSPACES:
							case K_LANGUAGE:
							case K_LIKE:
							case K_LIST:
							case K_LOGIN:
							case K_MAP:
							case K_MAXWRITETIME:
							case K_MBEAN:
							case K_MBEANS:
							case K_NOLOGIN:
							case K_NOSUPERUSER:
							case K_ONLY:
							case K_OPTIONS:
							case K_PARTITION:
							case K_PASSWORD:
							case K_PER:
							case K_PERMISSION:
							case K_PERMISSIONS:
							case K_REPLACE:
							case K_RETURNS:
							case K_ROLE:
							case K_ROLES:
							case K_SFUNC:
							case K_SMALLINT:
							case K_STATIC:
							case K_STORAGE:
							case K_STYPE:
							case K_SUPERUSER:
							case K_TABLES:
							case K_TEXT:
							case K_TIME:
							case K_TIMESTAMP:
							case K_TIMEUUID:
							case K_TINYINT:
							case K_TRIGGER:
							case K_TTL:
							case K_TUPLE:
							case K_TYPE:
							case K_TYPES:
							case K_UNSET:
							case K_USER:
							case K_USERS:
							case K_UUID:
							case K_VALUES:
							case K_VARCHAR:
							case K_VARINT:
							case K_WRITETIME:
								{
								alt186=3;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return stmt;}
								NoViableAltException nvae =
									new NoViableAltException("", 186, 0, input);
								throw nvae;
							}
							switch (alt186) {
								case 1 :
									// Parser.g:1372:11: ksT= IDENT
									{
									ksT=(Token)match(input,IDENT,FOLLOW_IDENT_in_describeStatement9757); if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace((ksT!=null?ksT.getText():null), false);}
									}
									break;
								case 2 :
									// Parser.g:1373:13: ksT= QUOTED_NAME
									{
									ksT=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_describeStatement9797); if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace((ksT!=null?ksT.getText():null), true);}
									}
									break;
								case 3 :
									// Parser.g:1374:13: ksK= unreserved_keyword
									{
									pushFollow(FOLLOW_unreserved_keyword_in_describeStatement9831);
									ksK=unreserved_keyword();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace(ksK, false);}
									}
									break;

							}

							match(input,206,FOLLOW_206_in_describeStatement9846); if (state.failed) return stmt;
							}
							break;

					}

					// Parser.g:1375:9: (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword )
					int alt188=3;
					switch ( input.LA(1) ) {
					case IDENT:
						{
						alt188=1;
						}
						break;
					case QUOTED_NAME:
						{
						alt188=2;
						}
						break;
					case K_ACCESS:
					case K_AGGREGATE:
					case K_AGGREGATES:
					case K_ALL:
					case K_AS:
					case K_ASCII:
					case K_BIGINT:
					case K_BLOB:
					case K_BOOLEAN:
					case K_CALLED:
					case K_CAST:
					case K_CLUSTER:
					case K_CLUSTERING:
					case K_COMPACT:
					case K_CONTAINS:
					case K_COUNT:
					case K_COUNTER:
					case K_CUSTOM:
					case K_DATACENTERS:
					case K_DATE:
					case K_DECIMAL:
					case K_DEFAULT:
					case K_DISTINCT:
					case K_DOUBLE:
					case K_DURATION:
					case K_EXISTS:
					case K_FILTERING:
					case K_FINALFUNC:
					case K_FLOAT:
					case K_FROZEN:
					case K_FUNCTION:
					case K_FUNCTIONS:
					case K_GROUP:
					case K_HASHED:
					case K_INET:
					case K_INITCOND:
					case K_INPUT:
					case K_INT:
					case K_INTERNALS:
					case K_JSON:
					case K_KEY:
					case K_KEYS:
					case K_KEYSPACES:
					case K_LANGUAGE:
					case K_LIKE:
					case K_LIST:
					case K_LOGIN:
					case K_MAP:
					case K_MAXWRITETIME:
					case K_MBEAN:
					case K_MBEANS:
					case K_NOLOGIN:
					case K_NOSUPERUSER:
					case K_ONLY:
					case K_OPTIONS:
					case K_PARTITION:
					case K_PASSWORD:
					case K_PER:
					case K_PERMISSION:
					case K_PERMISSIONS:
					case K_REPLACE:
					case K_RETURNS:
					case K_ROLE:
					case K_ROLES:
					case K_SFUNC:
					case K_SMALLINT:
					case K_STATIC:
					case K_STORAGE:
					case K_STYPE:
					case K_SUPERUSER:
					case K_TABLES:
					case K_TEXT:
					case K_TIME:
					case K_TIMESTAMP:
					case K_TIMEUUID:
					case K_TINYINT:
					case K_TRIGGER:
					case K_TTL:
					case K_TUPLE:
					case K_TYPE:
					case K_TYPES:
					case K_UNSET:
					case K_USER:
					case K_USERS:
					case K_UUID:
					case K_VALUES:
					case K_VARCHAR:
					case K_VARINT:
					case K_WRITETIME:
						{
						alt188=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 188, 0, input);
						throw nvae;
					}
					switch (alt188) {
						case 1 :
							// Parser.g:1375:11: tT= IDENT
							{
							tT=(Token)match(input,IDENT,FOLLOW_IDENT_in_describeStatement9863); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName((tT!=null?tT.getText():null), false);}
							}
							break;
						case 2 :
							// Parser.g:1376:11: tT= QUOTED_NAME
							{
							tT=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_describeStatement9904); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName((tT!=null?tT.getText():null), true);}
							}
							break;
						case 3 :
							// Parser.g:1377:11: tK= unreserved_keyword
							{
							pushFollow(FOLLOW_unreserved_keyword_in_describeStatement9939);
							tK=unreserved_keyword();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName(tK, false);}
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt = DescribeStatement.generic(gen.getKeyspace(), gen.getName()); }
					}
					break;

			}

			// Parser.g:1380:5: ( K_WITH K_INTERNALS )?
			int alt190=2;
			int LA190_0 = input.LA(1);
			if ( (LA190_0==K_WITH) ) {
				alt190=1;
			}
			switch (alt190) {
				case 1 :
					// Parser.g:1380:7: K_WITH K_INTERNALS
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_describeStatement10023); if (state.failed) return stmt;
					match(input,K_INTERNALS,FOLLOW_K_INTERNALS_in_describeStatement10025); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.withInternalDetails(); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "describeStatement"



	// $ANTLR start "cident"
	// Parser.g:1387:1: cident returns [ColumnIdentifier id] : ( EMPTY_QUOTED_NAME |t= ident );
	public final ColumnIdentifier cident() throws RecognitionException {
		ColumnIdentifier id = null;


		ColumnIdentifier t =null;

		try {
			// Parser.g:1388:5: ( EMPTY_QUOTED_NAME |t= ident )
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==EMPTY_QUOTED_NAME) ) {
				alt191=1;
			}
			else if ( (LA191_0==IDENT||LA191_0==K_ACCESS||(LA191_0 >= K_AGGREGATE && LA191_0 <= K_ALL)||LA191_0==K_AS||LA191_0==K_ASCII||(LA191_0 >= K_BIGINT && LA191_0 <= K_BOOLEAN)||(LA191_0 >= K_CALLED && LA191_0 <= K_CLUSTERING)||(LA191_0 >= K_COMPACT && LA191_0 <= K_COUNTER)||(LA191_0 >= K_CUSTOM && LA191_0 <= K_DEFAULT)||(LA191_0 >= K_DISTINCT && LA191_0 <= K_DOUBLE)||LA191_0==K_DURATION||(LA191_0 >= K_EXISTS && LA191_0 <= K_FLOAT)||LA191_0==K_FROZEN||(LA191_0 >= K_FUNCTION && LA191_0 <= K_FUNCTIONS)||(LA191_0 >= K_GROUP && LA191_0 <= K_HASHED)||(LA191_0 >= K_INET && LA191_0 <= K_INPUT)||(LA191_0 >= K_INT && LA191_0 <= K_INTERNALS)||(LA191_0 >= K_JSON && LA191_0 <= K_KEYS)||(LA191_0 >= K_KEYSPACES && LA191_0 <= K_LIKE)||(LA191_0 >= K_LIST && LA191_0 <= K_MAP)||(LA191_0 >= K_MAXWRITETIME && LA191_0 <= K_MBEANS)||LA191_0==K_NOLOGIN||LA191_0==K_NOSUPERUSER||(LA191_0 >= K_ONLY && LA191_0 <= K_OPTIONS)||(LA191_0 >= K_PARTITION && LA191_0 <= K_PERMISSIONS)||(LA191_0 >= K_REPLACE && LA191_0 <= K_RETURNS)||(LA191_0 >= K_ROLE && LA191_0 <= K_ROLES)||(LA191_0 >= K_SFUNC && LA191_0 <= K_TINYINT)||LA191_0==K_TRIGGER||(LA191_0 >= K_TTL && LA191_0 <= K_TYPES)||LA191_0==K_UNSET||(LA191_0 >= K_USER && LA191_0 <= K_USERS)||(LA191_0 >= K_UUID && LA191_0 <= K_VARINT)||LA191_0==K_WRITETIME||LA191_0==QUOTED_NAME) ) {
				alt191=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 191, 0, input);
				throw nvae;
			}

			switch (alt191) {
				case 1 :
					// Parser.g:1388:7: EMPTY_QUOTED_NAME
					{
					match(input,EMPTY_QUOTED_NAME,FOLLOW_EMPTY_QUOTED_NAME_in_cident10056); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned("", true); }
					}
					break;
				case 2 :
					// Parser.g:1389:7: t= ident
					{
					pushFollow(FOLLOW_ident_in_cident10071);
					t=ident();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = t; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1392:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1393:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt192=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt192=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt192=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt192=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 192, 0, input);
				throw nvae;
			}
			switch (alt192) {
				case 1 :
					// Parser.g:1393:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident10109); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1394:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident10134); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1395:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident10153);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "fident"
	// Parser.g:1398:1: fident returns [FieldIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final FieldIdentifier fident() throws RecognitionException {
		FieldIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1399:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt193=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt193=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt193=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt193=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 193, 0, input);
				throw nvae;
			}
			switch (alt193) {
				case 1 :
					// Parser.g:1399:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_fident10178); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1400:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_fident10203); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1401:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_fident10222);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "fident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1405:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1406:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt194=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt194=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt194=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt194=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 194, 0, input);
				throw nvae;
			}
			switch (alt194) {
				case 1 :
					// Parser.g:1406:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident10248); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1407:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident10273); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1408:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident10292);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1412:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 QualifiedName name = new QualifiedName(); 
		try {
			// Parser.g:1414:5: ( ksName[name] )
			// Parser.g:1414:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName10325);
			ksName(name);
			state._fsp--;
			if (state.failed) return id;
			if ( state.backtracking==0 ) { id = name.getKeyspace(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1417:1: indexName returns [QualifiedName name] : ( ksName[name] '.' )? idxName[name] ;
	public final QualifiedName indexName() throws RecognitionException {
		QualifiedName name = null;


		 name = new QualifiedName(); 
		try {
			// Parser.g:1419:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1419:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1419:7: ( ksName[name] '.' )?
			int alt195=2;
			alt195 = dfa195.predict(input);
			switch (alt195) {
				case 1 :
					// Parser.g:1419:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName10359);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,206,FOLLOW_206_in_indexName10362); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName10366);
			idxName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1422:1: columnFamilyName returns [QualifiedName name] : ( ksName[name] '.' )? cfName[name] ;
	public final QualifiedName columnFamilyName() throws RecognitionException {
		QualifiedName name = null;


		 name = new QualifiedName(); 
		try {
			// Parser.g:1424:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1424:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1424:7: ( ksName[name] '.' )?
			int alt196=2;
			alt196 = dfa196.predict(input);
			switch (alt196) {
				case 1 :
					// Parser.g:1424:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName10398);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,206,FOLLOW_206_in_columnFamilyName10401); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName10405);
			cfName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1427:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1428:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1428:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1428:7: (ks= noncol_ident '.' )?
			int alt197=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA197_1 = input.LA(2);
					if ( (LA197_1==206) ) {
						alt197=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA197_2 = input.LA(2);
					if ( (LA197_2==206) ) {
						alt197=1;
					}
					}
					break;
				case K_ACCESS:
				case K_AGGREGATE:
				case K_AGGREGATES:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTER:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DATACENTERS:
				case K_DEFAULT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_GROUP:
				case K_HASHED:
				case K_INITCOND:
				case K_INPUT:
				case K_INTERNALS:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_MBEAN:
				case K_MBEANS:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_ONLY:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_REPLACE:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TABLES:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_TYPES:
				case K_UNSET:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA197_3 = input.LA(2);
					if ( (LA197_3==206) ) {
						alt197=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DISTINCT:
				case K_DOUBLE:
				case K_DURATION:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_JSON:
				case K_MAXWRITETIME:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt197=1;
					}
					break;
				case K_KEY:
					{
					int LA197_5 = input.LA(2);
					if ( (LA197_5==206) ) {
						alt197=1;
					}
					}
					break;
			}
			switch (alt197) {
				case 1 :
					// Parser.g:1428:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName10430);
					ks=noncol_ident();
					state._fsp--;
					if (state.failed) return name;
					match(input,206,FOLLOW_206_in_userTypeName10432); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName10438);
			ut=non_type_ident();
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) { name = new UTName(ks, ut); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1431:1: userOrRoleName returns [RoleName name] : roleName[role] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 RoleName role = new RoleName(); 
		try {
			// Parser.g:1433:5: ( roleName[role] )
			// Parser.g:1433:7: roleName[role]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName10470);
			roleName(role);
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) {name = role;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1436:1: ksName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1437:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt198=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt198=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt198=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt198=3;
				}
				break;
			case QMARK:
				{
				alt198=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}
			switch (alt198) {
				case 1 :
					// Parser.g:1437:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName10493); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), false);}
					}
					break;
				case 2 :
					// Parser.g:1438:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName10518); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1439:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName10537);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace(k, false);}
					}
					break;
				case 4 :
					// Parser.g:1440:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName10547); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for keyspace names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1443:1: cfName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1444:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt199=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt199=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt199=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt199=3;
				}
				break;
			case QMARK:
				{
				alt199=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 199, 0, input);
				throw nvae;
			}
			switch (alt199) {
				case 1 :
					// Parser.g:1444:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName10569); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1445:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName10594); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1446:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName10613);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1447:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName10623); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for table names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1450:1: idxName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1451:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt200=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt200=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt200=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt200=3;
				}
				break;
			case QMARK:
				{
				alt200=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 200, 0, input);
				throw nvae;
			}
			switch (alt200) {
				case 1 :
					// Parser.g:1451:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName10645); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1452:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName10670); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1453:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName10689);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1454:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName10699); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for index names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1457:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1458:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt201=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt201=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt201=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt201=3;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MAXWRITETIME:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt201=4;
				}
				break;
			case QMARK:
				{
				alt201=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}
			switch (alt201) {
				case 1 :
					// Parser.g:1458:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName10721); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1459:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName10746); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((s!=null?s.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1460:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName10762); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true); }
					}
					break;
				case 4 :
					// Parser.g:1461:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName10781);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 5 :
					// Parser.g:1462:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName10791); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for role names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1465:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1466:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) )
			int alt203=8;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt203=1;
				}
				break;
			case INTEGER:
				{
				alt203=2;
				}
				break;
			case FLOAT:
				{
				alt203=3;
				}
				break;
			case BOOLEAN:
				{
				alt203=4;
				}
				break;
			case DURATION:
				{
				alt203=5;
				}
				break;
			case UUID:
				{
				alt203=6;
				}
				break;
			case HEXNUMBER:
				{
				alt203=7;
				}
				break;
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
				{
				alt203=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return constant;}
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}
			switch (alt203) {
				case 1 :
					// Parser.g:1466:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant10816); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.string((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1467:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant10828); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1468:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant10847); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); }
					}
					break;
				case 4 :
					// Parser.g:1469:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant10868); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.bool((t!=null?t.getText():null)); }
					}
					break;
				case 5 :
					// Parser.g:1470:7: t= DURATION
					{
					t=(Token)match(input,DURATION,FOLLOW_DURATION_in_constant10887); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.duration((t!=null?t.getText():null));}
					}
					break;
				case 6 :
					// Parser.g:1471:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant10905); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.uuid((t!=null?t.getText():null)); }
					}
					break;
				case 7 :
					// Parser.g:1472:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant10927); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.hex((t!=null?t.getText():null)); }
					}
					break;
				case 8 :
					// Parser.g:1473:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					{
					// Parser.g:1473:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					int alt202=3;
					switch ( input.LA(1) ) {
					case K_NEGATIVE_NAN:
					case K_POSITIVE_NAN:
						{
						alt202=1;
						}
						break;
					case K_POSITIVE_INFINITY:
						{
						alt202=2;
						}
						break;
					case K_NEGATIVE_INFINITY:
						{
						alt202=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return constant;}
						NoViableAltException nvae =
							new NoViableAltException("", 202, 0, input);
						throw nvae;
					}
					switch (alt202) {
						case 1 :
							// Parser.g:1473:8: ( K_POSITIVE_NAN | K_NEGATIVE_NAN )
							{
							if ( input.LA(1)==K_NEGATIVE_NAN||input.LA(1)==K_POSITIVE_NAN ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return constant;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("NaN"); }
							}
							break;
						case 2 :
							// Parser.g:1474:11: K_POSITIVE_INFINITY
							{
							match(input,K_POSITIVE_INFINITY,FOLLOW_K_POSITIVE_INFINITY_in_constant10963); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("Infinity"); }
							}
							break;
						case 3 :
							// Parser.g:1475:11: K_NEGATIVE_INFINITY
							{
							match(input,K_NEGATIVE_INFINITY,FOLLOW_K_NEGATIVE_INFINITY_in_constant10978); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("-Infinity"); }
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "fullMapLiteral"
	// Parser.g:1478:1: fullMapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal fullMapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>();
		try {
			// Parser.g:1481:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1481:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,219,FOLLOW_219_in_fullMapLiteral11019); if (state.failed) return map;
			// Parser.g:1481:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt205=2;
			int LA205_0 = input.LA(1);
			if ( (LA205_0==BOOLEAN||LA205_0==DURATION||LA205_0==FLOAT||LA205_0==HEXNUMBER||(LA205_0 >= IDENT && LA205_0 <= INTEGER)||LA205_0==K_ACCESS||(LA205_0 >= K_AGGREGATE && LA205_0 <= K_ALL)||LA205_0==K_AS||LA205_0==K_ASCII||(LA205_0 >= K_BIGINT && LA205_0 <= K_BOOLEAN)||(LA205_0 >= K_CALLED && LA205_0 <= K_CLUSTERING)||(LA205_0 >= K_COMPACT && LA205_0 <= K_COUNTER)||(LA205_0 >= K_CUSTOM && LA205_0 <= K_DEFAULT)||(LA205_0 >= K_DISTINCT && LA205_0 <= K_DOUBLE)||LA205_0==K_DURATION||(LA205_0 >= K_EXISTS && LA205_0 <= K_FLOAT)||LA205_0==K_FROZEN||(LA205_0 >= K_FUNCTION && LA205_0 <= K_FUNCTIONS)||(LA205_0 >= K_GROUP && LA205_0 <= K_HASHED)||(LA205_0 >= K_INET && LA205_0 <= K_INPUT)||(LA205_0 >= K_INT && LA205_0 <= K_INTERNALS)||(LA205_0 >= K_JSON && LA205_0 <= K_KEYS)||(LA205_0 >= K_KEYSPACES && LA205_0 <= K_LIKE)||(LA205_0 >= K_LIST && LA205_0 <= K_MAP)||(LA205_0 >= K_MAXWRITETIME && LA205_0 <= K_MBEANS)||(LA205_0 >= K_NEGATIVE_INFINITY && LA205_0 <= K_NOLOGIN)||LA205_0==K_NOSUPERUSER||LA205_0==K_NULL||(LA205_0 >= K_ONLY && LA205_0 <= K_OPTIONS)||(LA205_0 >= K_PARTITION && LA205_0 <= K_POSITIVE_NAN)||(LA205_0 >= K_REPLACE && LA205_0 <= K_RETURNS)||(LA205_0 >= K_ROLE && LA205_0 <= K_ROLES)||(LA205_0 >= K_SFUNC && LA205_0 <= K_TINYINT)||(LA205_0 >= K_TOKEN && LA205_0 <= K_TRIGGER)||(LA205_0 >= K_TTL && LA205_0 <= K_TYPES)||LA205_0==K_UNSET||(LA205_0 >= K_USER && LA205_0 <= K_USERS)||(LA205_0 >= K_UUID && LA205_0 <= K_VARINT)||LA205_0==K_WRITETIME||(LA205_0 >= QMARK && LA205_0 <= QUOTED_NAME)||LA205_0==STRING_LITERAL||LA205_0==UUID||LA205_0==199||LA205_0==204||LA205_0==208||LA205_0==215||LA205_0==219) ) {
				alt205=1;
			}
			switch (alt205) {
				case 1 :
					// Parser.g:1481:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_fullMapLiteral11025);
					k1=term();
					state._fsp--;
					if (state.failed) return map;
					match(input,208,FOLLOW_208_in_fullMapLiteral11027); if (state.failed) return map;
					pushFollow(FOLLOW_term_in_fullMapLiteral11031);
					v1=term();
					state._fsp--;
					if (state.failed) return map;
					if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
					// Parser.g:1481:65: ( ',' kn= term ':' vn= term )*
					loop204:
					while (true) {
						int alt204=2;
						int LA204_0 = input.LA(1);
						if ( (LA204_0==203) ) {
							alt204=1;
						}

						switch (alt204) {
						case 1 :
							// Parser.g:1481:67: ',' kn= term ':' vn= term
							{
							match(input,203,FOLLOW_203_in_fullMapLiteral11037); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral11041);
							kn=term();
							state._fsp--;
							if (state.failed) return map;
							match(input,208,FOLLOW_208_in_fullMapLiteral11043); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral11047);
							vn=term();
							state._fsp--;
							if (state.failed) return map;
							if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
							}
							break;

						default :
							break loop204;
						}
					}

					}
					break;

			}

			match(input,220,FOLLOW_220_in_fullMapLiteral11063); if (state.failed) return map;
			}

			if ( state.backtracking==0 ) { map = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "fullMapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1485:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : (m= mapLiteral[t] |s= setLiteral[t] );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw m =null;
		Term.Raw s =null;

		try {
			// Parser.g:1486:5: (m= mapLiteral[t] |s= setLiteral[t] )
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( (LA206_0==208) ) {
				alt206=1;
			}
			else if ( (LA206_0==203||LA206_0==220) ) {
				alt206=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 206, 0, input);
				throw nvae;
			}

			switch (alt206) {
				case 1 :
					// Parser.g:1486:7: m= mapLiteral[t]
					{
					pushFollow(FOLLOW_mapLiteral_in_setOrMapLiteral11087);
					m=mapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =m; }
					}
					break;
				case 2 :
					// Parser.g:1487:7: s= setLiteral[t]
					{
					pushFollow(FOLLOW_setLiteral_in_setOrMapLiteral11100);
					s=setLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =s; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "setLiteral"
	// Parser.g:1490:1: setLiteral[Term.Raw t] returns [Term.Raw value] : ( ',' tn= term )* ;
	public final Term.Raw setLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw tn =null;

		 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
		try {
			// Parser.g:1493:5: ( ( ',' tn= term )* )
			// Parser.g:1493:7: ( ',' tn= term )*
			{
			// Parser.g:1493:7: ( ',' tn= term )*
			loop207:
			while (true) {
				int alt207=2;
				int LA207_0 = input.LA(1);
				if ( (LA207_0==203) ) {
					alt207=1;
				}

				switch (alt207) {
				case 1 :
					// Parser.g:1493:9: ',' tn= term
					{
					match(input,203,FOLLOW_203_in_setLiteral11145); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_setLiteral11149);
					tn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { s.add(tn); }
					}
					break;

				default :
					break loop207;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Sets.Literal(s); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setLiteral"



	// $ANTLR start "mapLiteral"
	// Parser.g:1496:1: mapLiteral[Term.Raw k] returns [Term.Raw value] : ':' v= term ( ',' kn= term ':' vn= term )* ;
	public final Term.Raw mapLiteral(Term.Raw k) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
		try {
			// Parser.g:1499:5: ( ':' v= term ( ',' kn= term ':' vn= term )* )
			// Parser.g:1499:7: ':' v= term ( ',' kn= term ':' vn= term )*
			{
			match(input,208,FOLLOW_208_in_mapLiteral11194); if (state.failed) return value;
			pushFollow(FOLLOW_term_in_mapLiteral11198);
			v=term();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {  m.add(Pair.create(k, v)); }
			// Parser.g:1499:49: ( ',' kn= term ':' vn= term )*
			loop208:
			while (true) {
				int alt208=2;
				int LA208_0 = input.LA(1);
				if ( (LA208_0==203) ) {
					alt208=1;
				}

				switch (alt208) {
				case 1 :
					// Parser.g:1499:51: ',' kn= term ':' vn= term
					{
					match(input,203,FOLLOW_203_in_mapLiteral11204); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral11208);
					kn=term();
					state._fsp--;
					if (state.failed) return value;
					match(input,208,FOLLOW_208_in_mapLiteral11210); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral11214);
					vn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop208;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1502:1: collectionLiteral returns [Term.Raw value] : (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw l =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1503:5: (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt209=3;
			int LA209_0 = input.LA(1);
			if ( (LA209_0==215) ) {
				alt209=1;
			}
			else if ( (LA209_0==219) ) {
				int LA209_2 = input.LA(2);
				if ( (LA209_2==220) ) {
					alt209=3;
				}
				else if ( (LA209_2==BOOLEAN||LA209_2==DURATION||LA209_2==FLOAT||LA209_2==HEXNUMBER||(LA209_2 >= IDENT && LA209_2 <= INTEGER)||LA209_2==K_ACCESS||(LA209_2 >= K_AGGREGATE && LA209_2 <= K_ALL)||LA209_2==K_AS||LA209_2==K_ASCII||(LA209_2 >= K_BIGINT && LA209_2 <= K_BOOLEAN)||(LA209_2 >= K_CALLED && LA209_2 <= K_CLUSTERING)||(LA209_2 >= K_COMPACT && LA209_2 <= K_COUNTER)||(LA209_2 >= K_CUSTOM && LA209_2 <= K_DEFAULT)||(LA209_2 >= K_DISTINCT && LA209_2 <= K_DOUBLE)||LA209_2==K_DURATION||(LA209_2 >= K_EXISTS && LA209_2 <= K_FLOAT)||LA209_2==K_FROZEN||(LA209_2 >= K_FUNCTION && LA209_2 <= K_FUNCTIONS)||(LA209_2 >= K_GROUP && LA209_2 <= K_HASHED)||(LA209_2 >= K_INET && LA209_2 <= K_INPUT)||(LA209_2 >= K_INT && LA209_2 <= K_INTERNALS)||(LA209_2 >= K_JSON && LA209_2 <= K_KEYS)||(LA209_2 >= K_KEYSPACES && LA209_2 <= K_LIKE)||(LA209_2 >= K_LIST && LA209_2 <= K_MAP)||(LA209_2 >= K_MAXWRITETIME && LA209_2 <= K_MBEANS)||(LA209_2 >= K_NEGATIVE_INFINITY && LA209_2 <= K_NOLOGIN)||LA209_2==K_NOSUPERUSER||LA209_2==K_NULL||(LA209_2 >= K_ONLY && LA209_2 <= K_OPTIONS)||(LA209_2 >= K_PARTITION && LA209_2 <= K_POSITIVE_NAN)||(LA209_2 >= K_REPLACE && LA209_2 <= K_RETURNS)||(LA209_2 >= K_ROLE && LA209_2 <= K_ROLES)||(LA209_2 >= K_SFUNC && LA209_2 <= K_TINYINT)||(LA209_2 >= K_TOKEN && LA209_2 <= K_TRIGGER)||(LA209_2 >= K_TTL && LA209_2 <= K_TYPES)||LA209_2==K_UNSET||(LA209_2 >= K_USER && LA209_2 <= K_USERS)||(LA209_2 >= K_UUID && LA209_2 <= K_VARINT)||LA209_2==K_WRITETIME||(LA209_2 >= QMARK && LA209_2 <= QUOTED_NAME)||LA209_2==STRING_LITERAL||LA209_2==UUID||LA209_2==199||LA209_2==204||LA209_2==208||LA209_2==215||LA209_2==219) ) {
					alt209=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return value;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 209, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 209, 0, input);
				throw nvae;
			}

			switch (alt209) {
				case 1 :
					// Parser.g:1503:7: l= listLiteral
					{
					pushFollow(FOLLOW_listLiteral_in_collectionLiteral11242);
					l=listLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 2 :
					// Parser.g:1504:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,219,FOLLOW_219_in_collectionLiteral11252); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_collectionLiteral11256);
					t=term();
					state._fsp--;
					if (state.failed) return value;
					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral11260);
					v=setOrMapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = v; }
					match(input,220,FOLLOW_220_in_collectionLiteral11265); if (state.failed) return value;
					}
					break;
				case 3 :
					// Parser.g:1507:7: '{' '}'
					{
					match(input,219,FOLLOW_219_in_collectionLiteral11283); if (state.failed) return value;
					match(input,220,FOLLOW_220_in_collectionLiteral11285); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Sets.Literal(Collections.<Term.Raw>emptyList()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "listLiteral"
	// Parser.g:1510:1: listLiteral returns [Term.Raw value] : '[' (t1= term ( ',' tn= term )* )? ']' ;
	public final Term.Raw listLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		List<Term.Raw> l = new ArrayList<Term.Raw>();
		try {
			// Parser.g:1513:5: ( '[' (t1= term ( ',' tn= term )* )? ']' )
			// Parser.g:1513:7: '[' (t1= term ( ',' tn= term )* )? ']'
			{
			match(input,215,FOLLOW_215_in_listLiteral11326); if (state.failed) return value;
			// Parser.g:1513:11: (t1= term ( ',' tn= term )* )?
			int alt211=2;
			int LA211_0 = input.LA(1);
			if ( (LA211_0==BOOLEAN||LA211_0==DURATION||LA211_0==FLOAT||LA211_0==HEXNUMBER||(LA211_0 >= IDENT && LA211_0 <= INTEGER)||LA211_0==K_ACCESS||(LA211_0 >= K_AGGREGATE && LA211_0 <= K_ALL)||LA211_0==K_AS||LA211_0==K_ASCII||(LA211_0 >= K_BIGINT && LA211_0 <= K_BOOLEAN)||(LA211_0 >= K_CALLED && LA211_0 <= K_CLUSTERING)||(LA211_0 >= K_COMPACT && LA211_0 <= K_COUNTER)||(LA211_0 >= K_CUSTOM && LA211_0 <= K_DEFAULT)||(LA211_0 >= K_DISTINCT && LA211_0 <= K_DOUBLE)||LA211_0==K_DURATION||(LA211_0 >= K_EXISTS && LA211_0 <= K_FLOAT)||LA211_0==K_FROZEN||(LA211_0 >= K_FUNCTION && LA211_0 <= K_FUNCTIONS)||(LA211_0 >= K_GROUP && LA211_0 <= K_HASHED)||(LA211_0 >= K_INET && LA211_0 <= K_INPUT)||(LA211_0 >= K_INT && LA211_0 <= K_INTERNALS)||(LA211_0 >= K_JSON && LA211_0 <= K_KEYS)||(LA211_0 >= K_KEYSPACES && LA211_0 <= K_LIKE)||(LA211_0 >= K_LIST && LA211_0 <= K_MAP)||(LA211_0 >= K_MAXWRITETIME && LA211_0 <= K_MBEANS)||(LA211_0 >= K_NEGATIVE_INFINITY && LA211_0 <= K_NOLOGIN)||LA211_0==K_NOSUPERUSER||LA211_0==K_NULL||(LA211_0 >= K_ONLY && LA211_0 <= K_OPTIONS)||(LA211_0 >= K_PARTITION && LA211_0 <= K_POSITIVE_NAN)||(LA211_0 >= K_REPLACE && LA211_0 <= K_RETURNS)||(LA211_0 >= K_ROLE && LA211_0 <= K_ROLES)||(LA211_0 >= K_SFUNC && LA211_0 <= K_TINYINT)||(LA211_0 >= K_TOKEN && LA211_0 <= K_TRIGGER)||(LA211_0 >= K_TTL && LA211_0 <= K_TYPES)||LA211_0==K_UNSET||(LA211_0 >= K_USER && LA211_0 <= K_USERS)||(LA211_0 >= K_UUID && LA211_0 <= K_VARINT)||LA211_0==K_WRITETIME||(LA211_0 >= QMARK && LA211_0 <= QUOTED_NAME)||LA211_0==STRING_LITERAL||LA211_0==UUID||LA211_0==199||LA211_0==204||LA211_0==208||LA211_0==215||LA211_0==219) ) {
				alt211=1;
			}
			switch (alt211) {
				case 1 :
					// Parser.g:1513:13: t1= term ( ',' tn= term )*
					{
					pushFollow(FOLLOW_term_in_listLiteral11332);
					t1=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:1513:36: ( ',' tn= term )*
					loop210:
					while (true) {
						int alt210=2;
						int LA210_0 = input.LA(1);
						if ( (LA210_0==203) ) {
							alt210=1;
						}

						switch (alt210) {
						case 1 :
							// Parser.g:1513:38: ',' tn= term
							{
							match(input,203,FOLLOW_203_in_listLiteral11338); if (state.failed) return value;
							pushFollow(FOLLOW_term_in_listLiteral11342);
							tn=term();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop210;
						}
					}

					}
					break;

			}

			match(input,217,FOLLOW_217_in_listLiteral11352); if (state.failed) return value;
			if ( state.backtracking==0 ) { value = new Lists.Literal(l); }
			}

			if ( state.backtracking==0 ) {value = new Lists.Literal(l);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "listLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1516:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		FieldIdentifier k1 =null;
		Term.Raw v1 =null;
		FieldIdentifier kn =null;
		Term.Raw vn =null;

		 Map<FieldIdentifier, Term.Raw> m = new HashMap<>(); 
		try {
			// Parser.g:1520:5: ( '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' )
			// Parser.g:1520:7: '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}'
			{
			match(input,219,FOLLOW_219_in_usertypeLiteral11396); if (state.failed) return ut;
			pushFollow(FOLLOW_fident_in_usertypeLiteral11400);
			k1=fident();
			state._fsp--;
			if (state.failed) return ut;
			match(input,208,FOLLOW_208_in_usertypeLiteral11402); if (state.failed) return ut;
			pushFollow(FOLLOW_term_in_usertypeLiteral11406);
			v1=term();
			state._fsp--;
			if (state.failed) return ut;
			if ( state.backtracking==0 ) { m.put(k1, v1); }
			// Parser.g:1520:52: ( ',' kn= fident ':' vn= term )*
			loop212:
			while (true) {
				int alt212=2;
				int LA212_0 = input.LA(1);
				if ( (LA212_0==203) ) {
					alt212=1;
				}

				switch (alt212) {
				case 1 :
					// Parser.g:1520:54: ',' kn= fident ':' vn= term
					{
					match(input,203,FOLLOW_203_in_usertypeLiteral11412); if (state.failed) return ut;
					pushFollow(FOLLOW_fident_in_usertypeLiteral11416);
					kn=fident();
					state._fsp--;
					if (state.failed) return ut;
					match(input,208,FOLLOW_208_in_usertypeLiteral11418); if (state.failed) return ut;
					pushFollow(FOLLOW_term_in_usertypeLiteral11422);
					vn=term();
					state._fsp--;
					if (state.failed) return ut;
					if ( state.backtracking==0 ) { m.put(kn, vn); }
					}
					break;

				default :
					break loop212;
				}
			}

			match(input,220,FOLLOW_220_in_usertypeLiteral11429); if (state.failed) return ut;
			}

			if ( state.backtracking==0 ) { ut = new UserTypes.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1523:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1526:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1526:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,199,FOLLOW_199_in_tupleLiteral11466); if (state.failed) return tt;
			pushFollow(FOLLOW_term_in_tupleLiteral11470);
			t1=term();
			state._fsp--;
			if (state.failed) return tt;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:1526:34: ( ',' tn= term )*
			loop213:
			while (true) {
				int alt213=2;
				int LA213_0 = input.LA(1);
				if ( (LA213_0==203) ) {
					alt213=1;
				}

				switch (alt213) {
				case 1 :
					// Parser.g:1526:36: ',' tn= term
					{
					match(input,203,FOLLOW_203_in_tupleLiteral11476); if (state.failed) return tt;
					pushFollow(FOLLOW_term_in_tupleLiteral11480);
					tn=term();
					state._fsp--;
					if (state.failed) return tt;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop213;
				}
			}

			match(input,200,FOLLOW_200_in_tupleLiteral11487); if (state.failed) return tt;
			}

			if ( state.backtracking==0 ) { tt = new Tuples.Literal(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1529:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1530:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt214=7;
			alt214 = dfa214.predict(input);
			switch (alt214) {
				case 1 :
					// Parser.g:1530:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value11510);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:1531:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value11532);
					l=collectionLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 3 :
					// Parser.g:1532:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value11545);
					u=usertypeLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = u; }
					}
					break;
				case 4 :
					// Parser.g:1533:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value11560);
					t=tupleLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = t; }
					}
					break;
				case 5 :
					// Parser.g:1534:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value11576); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 6 :
					// Parser.g:1535:7: ':' id= noncol_ident
					{
					match(input,208,FOLLOW_208_in_value11600); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_value11604);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 7 :
					// Parser.g:1536:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value11615); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1539:1: intValue returns [Term.Raw value] : (t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1540:5: (t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt215=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt215=1;
				}
				break;
			case 208:
				{
				alt215=2;
				}
				break;
			case QMARK:
				{
				alt215=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 215, 0, input);
				throw nvae;
			}
			switch (alt215) {
				case 1 :
					// Parser.g:1540:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue11655); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1541:7: ':' id= noncol_ident
					{
					match(input,208,FOLLOW_208_in_intValue11669); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_intValue11673);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:1542:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue11684); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1545:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1548:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1548:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1548:7: (ks= keyspaceName '.' )?
			int alt216=2;
			alt216 = dfa216.predict(input);
			switch (alt216) {
				case 1 :
					// Parser.g:1548:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName11730);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return s;
					match(input,206,FOLLOW_206_in_functionName11732); if (state.failed) return s;
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName11738);
			f=allowedFunctionName();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = f == null ? null : new FunctionName(ks, f); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1551:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1552:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt217=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt217=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt217=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt217=3;
				}
				break;
			case K_TOKEN:
				{
				alt217=4;
				}
				break;
			case K_COUNT:
				{
				alt217=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 217, 0, input);
				throw nvae;
			}
			switch (alt217) {
				case 1 :
					// Parser.g:1552:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName11765); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null).toLowerCase(); }
					}
					break;
				case 2 :
					// Parser.g:1553:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName11799); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null); }
					}
					break;
				case 3 :
					// Parser.g:1554:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName11827);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = u; }
					}
					break;
				case 4 :
					// Parser.g:1555:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName11837); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "token"; }
					}
					break;
				case 5 :
					// Parser.g:1556:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName11869); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "count"; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1559:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1560:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt218=2;
			alt218 = dfa218.predict(input);
			switch (alt218) {
				case 1 :
					// Parser.g:1560:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function11916);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,199,FOLLOW_199_in_function11918); if (state.failed) return t;
					match(input,200,FOLLOW_200_in_function11920); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); }
					}
					break;
				case 2 :
					// Parser.g:1561:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function11950);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,199,FOLLOW_199_in_function11952); if (state.failed) return t;
					pushFollow(FOLLOW_functionArgs_in_function11956);
					args=functionArgs();
					state._fsp--;
					if (state.failed) return t;
					match(input,200,FOLLOW_200_in_function11958); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1564:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1566:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1566:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs11991);
			t1=term();
			state._fsp--;
			if (state.failed) return args;
			if ( state.backtracking==0 ) {args.add(t1); }
			// Parser.g:1566:32: ( ',' tn= term )*
			loop219:
			while (true) {
				int alt219=2;
				int LA219_0 = input.LA(1);
				if ( (LA219_0==203) ) {
					alt219=1;
				}

				switch (alt219) {
				case 1 :
					// Parser.g:1566:34: ',' tn= term
					{
					match(input,203,FOLLOW_203_in_functionArgs11997); if (state.failed) return args;
					pushFollow(FOLLOW_term_in_functionArgs12001);
					tn=term();
					state._fsp--;
					if (state.failed) return args;
					if ( state.backtracking==0 ) { args.add(tn); }
					}
					break;

				default :
					break loop219;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1569:1: term returns [Term.Raw term] : t= termAddition ;
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1570:5: (t= termAddition )
			// Parser.g:1570:7: t= termAddition
			{
			pushFollow(FOLLOW_termAddition_in_term12029);
			t=termAddition();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) { term = t; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "termAddition"
	// Parser.g:1573:1: termAddition returns [Term.Raw term] : l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* ;
	public final Term.Raw termAddition() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1574:5: (l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* )
			// Parser.g:1574:9: l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )*
			{
			pushFollow(FOLLOW_termMultiplication_in_termAddition12081);
			l=termMultiplication();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1575:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*
			loop220:
			while (true) {
				int alt220=3;
				alt220 = dfa220.predict(input);
				switch (alt220) {
				case 1 :
					// Parser.g:1575:11: '+' r= termMultiplication
					{
					match(input,201,FOLLOW_201_in_termAddition12097); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition12101);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('+', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1576:11: '-' r= termMultiplication
					{
					match(input,204,FOLLOW_204_in_termAddition12115); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition12119);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('-', term, r);}
					}
					break;

				default :
					break loop220;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termAddition"



	// $ANTLR start "termMultiplication"
	// Parser.g:1580:1: termMultiplication returns [Term.Raw term] : l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* ;
	public final Term.Raw termMultiplication() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1581:5: (l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* )
			// Parser.g:1581:9: l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			{
			pushFollow(FOLLOW_termGroup_in_termMultiplication12157);
			l=termGroup();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1582:9: ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			loop221:
			while (true) {
				int alt221=4;
				switch ( input.LA(1) ) {
				case 216:
					{
					alt221=1;
					}
					break;
				case 207:
					{
					alt221=2;
					}
					break;
				case 198:
					{
					alt221=3;
					}
					break;
				}
				switch (alt221) {
				case 1 :
					// Parser.g:1582:11: '\\*' r= termGroup
					{
					match(input,216,FOLLOW_216_in_termMultiplication12173); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication12177);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('*', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1583:11: '/' r= termGroup
					{
					match(input,207,FOLLOW_207_in_termMultiplication12191); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication12195);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('/', term, r);}
					}
					break;
				case 3 :
					// Parser.g:1584:11: '%' r= termGroup
					{
					match(input,198,FOLLOW_198_in_termMultiplication12209); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication12213);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('%', term, r);}
					}
					break;

				default :
					break loop221;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termMultiplication"



	// $ANTLR start "termGroup"
	// Parser.g:1588:1: termGroup returns [Term.Raw term] : (t= simpleTerm | '-' t= simpleTerm );
	public final Term.Raw termGroup() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1589:5: (t= simpleTerm | '-' t= simpleTerm )
			int alt222=2;
			int LA222_0 = input.LA(1);
			if ( (LA222_0==BOOLEAN||LA222_0==DURATION||LA222_0==FLOAT||LA222_0==HEXNUMBER||(LA222_0 >= IDENT && LA222_0 <= INTEGER)||LA222_0==K_ACCESS||(LA222_0 >= K_AGGREGATE && LA222_0 <= K_ALL)||LA222_0==K_AS||LA222_0==K_ASCII||(LA222_0 >= K_BIGINT && LA222_0 <= K_BOOLEAN)||(LA222_0 >= K_CALLED && LA222_0 <= K_CLUSTERING)||(LA222_0 >= K_COMPACT && LA222_0 <= K_COUNTER)||(LA222_0 >= K_CUSTOM && LA222_0 <= K_DEFAULT)||(LA222_0 >= K_DISTINCT && LA222_0 <= K_DOUBLE)||LA222_0==K_DURATION||(LA222_0 >= K_EXISTS && LA222_0 <= K_FLOAT)||LA222_0==K_FROZEN||(LA222_0 >= K_FUNCTION && LA222_0 <= K_FUNCTIONS)||(LA222_0 >= K_GROUP && LA222_0 <= K_HASHED)||(LA222_0 >= K_INET && LA222_0 <= K_INPUT)||(LA222_0 >= K_INT && LA222_0 <= K_INTERNALS)||(LA222_0 >= K_JSON && LA222_0 <= K_KEYS)||(LA222_0 >= K_KEYSPACES && LA222_0 <= K_LIKE)||(LA222_0 >= K_LIST && LA222_0 <= K_MAP)||(LA222_0 >= K_MAXWRITETIME && LA222_0 <= K_MBEANS)||(LA222_0 >= K_NEGATIVE_INFINITY && LA222_0 <= K_NOLOGIN)||LA222_0==K_NOSUPERUSER||LA222_0==K_NULL||(LA222_0 >= K_ONLY && LA222_0 <= K_OPTIONS)||(LA222_0 >= K_PARTITION && LA222_0 <= K_POSITIVE_NAN)||(LA222_0 >= K_REPLACE && LA222_0 <= K_RETURNS)||(LA222_0 >= K_ROLE && LA222_0 <= K_ROLES)||(LA222_0 >= K_SFUNC && LA222_0 <= K_TINYINT)||(LA222_0 >= K_TOKEN && LA222_0 <= K_TRIGGER)||(LA222_0 >= K_TTL && LA222_0 <= K_TYPES)||LA222_0==K_UNSET||(LA222_0 >= K_USER && LA222_0 <= K_USERS)||(LA222_0 >= K_UUID && LA222_0 <= K_VARINT)||LA222_0==K_WRITETIME||(LA222_0 >= QMARK && LA222_0 <= QUOTED_NAME)||LA222_0==STRING_LITERAL||LA222_0==UUID||LA222_0==199||LA222_0==208||LA222_0==215||LA222_0==219) ) {
				alt222=1;
			}
			else if ( (LA222_0==204) ) {
				alt222=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return term;}
				NoViableAltException nvae =
					new NoViableAltException("", 222, 0, input);
				throw nvae;
			}

			switch (alt222) {
				case 1 :
					// Parser.g:1589:7: t= simpleTerm
					{
					pushFollow(FOLLOW_simpleTerm_in_termGroup12249);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = t; }
					}
					break;
				case 2 :
					// Parser.g:1590:7: '-' t= simpleTerm
					{
					match(input,204,FOLLOW_204_in_termGroup12272); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_termGroup12277);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = FunctionCall.Raw.newNegation(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termGroup"



	// $ANTLR start "simpleTerm"
	// Parser.g:1593:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm | K_CAST '(' t= simpleTerm K_AS n= native_type ')' );
	public final Term.Raw simpleTerm() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;
		CQL3Type n =null;

		try {
			// Parser.g:1594:5: (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm | K_CAST '(' t= simpleTerm K_AS n= native_type ')' )
			int alt223=4;
			alt223 = dfa223.predict(input);
			switch (alt223) {
				case 1 :
					// Parser.g:1594:7: v= value
					{
					pushFollow(FOLLOW_value_in_simpleTerm12310);
					v=value();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = v; }
					}
					break;
				case 2 :
					// Parser.g:1595:7: f= function
					{
					pushFollow(FOLLOW_function_in_simpleTerm12361);
					f=function();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = f; }
					}
					break;
				case 3 :
					// Parser.g:1596:7: '(' c= comparatorType ')' t= simpleTerm
					{
					match(input,199,FOLLOW_199_in_simpleTerm12407); if (state.failed) return term;
					pushFollow(FOLLOW_comparatorType_in_simpleTerm12411);
					c=comparatorType();
					state._fsp--;
					if (state.failed) return term;
					match(input,200,FOLLOW_200_in_simpleTerm12413); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_simpleTerm12417);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = new TypeCast(c, t); }
					}
					break;
				case 4 :
					// Parser.g:1597:7: K_CAST '(' t= simpleTerm K_AS n= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_simpleTerm12436); if (state.failed) return term;
					match(input,199,FOLLOW_199_in_simpleTerm12438); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_simpleTerm12442);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					match(input,K_AS,FOLLOW_K_AS_in_simpleTerm12444); if (state.failed) return term;
					pushFollow(FOLLOW_native_type_in_simpleTerm12448);
					n=native_type();
					state._fsp--;
					if (state.failed) return term;
					match(input,200,FOLLOW_200_in_simpleTerm12450); if (state.failed) return term;
					if ( state.backtracking==0 ) { term = FunctionCall.Raw.newCast(t, n); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "simpleTerm"



	// $ANTLR start "columnOperation"
	// Parser.g:1600:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnIdentifier key =null;

		try {
			// Parser.g:1601:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1601:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation12472);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation12474);
			columnOperationDifferentiator(operations, key);
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1604:1: columnOperationDifferentiator[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Term.Raw k =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1605:5: ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] )
			int alt224=4;
			switch ( input.LA(1) ) {
			case 212:
				{
				alt224=1;
				}
				break;
			case 202:
			case 205:
				{
				alt224=2;
				}
				break;
			case 215:
				{
				alt224=3;
				}
				break;
			case 206:
				{
				alt224=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 224, 0, input);
				throw nvae;
			}
			switch (alt224) {
				case 1 :
					// Parser.g:1605:7: '=' normalColumnOperation[operations, key]
					{
					match(input,212,FOLLOW_212_in_columnOperationDifferentiator12493); if (state.failed) return;
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator12495);
					normalColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:1606:7: shorthandColumnOperation[operations, key]
					{
					pushFollow(FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator12504);
					shorthandColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Parser.g:1607:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,215,FOLLOW_215_in_columnOperationDifferentiator12513); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator12517);
					k=term();
					state._fsp--;
					if (state.failed) return;
					match(input,217,FOLLOW_217_in_columnOperationDifferentiator12519); if (state.failed) return;
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator12521);
					collectionColumnOperation(operations, key, k);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Parser.g:1608:7: '.' field= fident udtColumnOperation[operations, key, field]
					{
					match(input,206,FOLLOW_206_in_columnOperationDifferentiator12530); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnOperationDifferentiator12534);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator12536);
					udtColumnOperation(operations, key, field);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1611:1: normalColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnIdentifier c =null;

		try {
			// Parser.g:1612:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt226=3;
			alt226 = dfa226.predict(input);
			switch (alt226) {
				case 1 :
					// Parser.g:1612:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation12557);
					t=term();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1612:14: ( '+' c= cident )?
					int alt225=2;
					int LA225_0 = input.LA(1);
					if ( (LA225_0==201) ) {
						alt225=1;
					}
					switch (alt225) {
						case 1 :
							// Parser.g:1612:15: '+' c= cident
							{
							match(input,201,FOLLOW_201_in_normalColumnOperation12560); if (state.failed) return;
							pushFollow(FOLLOW_cident_in_normalColumnOperation12564);
							c=cident();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      }
					}
					break;
				case 2 :
					// Parser.g:1625:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation12585);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					sig=input.LT(1);
					if ( input.LA(1)==201||input.LA(1)==204 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation12599);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      }
					}
					break;
				case 3 :
					// Parser.g:1631:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation12617);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation12621); if (state.failed) return;
					if ( state.backtracking==0 ) {
					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "shorthandColumnOperation"
	// Parser.g:1641:1: shorthandColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : sig= ( '+=' | '-=' ) t= term ;
	public final void shorthandColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Token sig=null;
		Term.Raw t =null;

		try {
			// Parser.g:1642:5: (sig= ( '+=' | '-=' ) t= term )
			// Parser.g:1642:7: sig= ( '+=' | '-=' ) t= term
			{
			sig=input.LT(1);
			if ( input.LA(1)==202||input.LA(1)==205 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_shorthandColumnOperation12659);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+=") ? new Operation.Addition(t) : new Operation.Substraction(t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shorthandColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1648:1: collectionColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1649:5: ( '=' t= term )
			// Parser.g:1649:7: '=' t= term
			{
			match(input,212,FOLLOW_212_in_collectionColumnOperation12685); if (state.failed) return;
			pushFollow(FOLLOW_term_in_collectionColumnOperation12689);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1655:1: udtColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1656:5: ( '=' t= term )
			// Parser.g:1656:7: '=' t= term
			{
			match(input,212,FOLLOW_212_in_udtColumnOperation12715); if (state.failed) return;
			pushFollow(FOLLOW_term_in_udtColumnOperation12719);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1662:1: columnCondition[List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term |op= containsOperator t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnIdentifier key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1664:5: (key= cident (op= relationType t= term |op= containsOperator t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1664:7: key= cident (op= relationType t= term |op= containsOperator t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition12752);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1665:9: (op= relationType t= term |op= containsOperator t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt232=5;
			switch ( input.LA(1) ) {
			case 197:
			case 210:
			case 211:
			case 212:
			case 213:
			case 214:
				{
				alt232=1;
				}
				break;
			case K_CONTAINS:
				{
				alt232=2;
				}
				break;
			case K_IN:
				{
				alt232=3;
				}
				break;
			case 215:
				{
				alt232=4;
				}
				break;
			case 206:
				{
				alt232=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 232, 0, input);
				throw nvae;
			}
			switch (alt232) {
				case 1 :
					// Parser.g:1665:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition12766);
					op=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition12770);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); }
					}
					break;
				case 2 :
					// Parser.g:1666:11: op= containsOperator t= term
					{
					pushFollow(FOLLOW_containsOperator_in_columnCondition12786);
					op=containsOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition12790);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); }
					}
					break;
				case 3 :
					// Parser.g:1667:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition12804); if (state.failed) return;
					// Parser.g:1668:13: (values= singleColumnInValues |marker= inMarker )
					int alt227=2;
					int LA227_0 = input.LA(1);
					if ( (LA227_0==199) ) {
						alt227=1;
					}
					else if ( (LA227_0==QMARK||LA227_0==208) ) {
						alt227=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 227, 0, input);
						throw nvae;
					}

					switch (alt227) {
						case 1 :
							// Parser.g:1668:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition12822);
							values=singleColumnInValues();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); }
							}
							break;
						case 2 :
							// Parser.g:1669:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition12842);
							marker=inMarker();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); }
							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1671:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,215,FOLLOW_215_in_columnCondition12870); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition12874);
					element=term();
					state._fsp--;
					if (state.failed) return;
					match(input,217,FOLLOW_217_in_columnCondition12876); if (state.failed) return;
					// Parser.g:1672:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt229=2;
					int LA229_0 = input.LA(1);
					if ( (LA229_0==197||(LA229_0 >= 210 && LA229_0 <= 214)) ) {
						alt229=1;
					}
					else if ( (LA229_0==K_IN) ) {
						alt229=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 229, 0, input);
						throw nvae;
					}

					switch (alt229) {
						case 1 :
							// Parser.g:1672:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition12894);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition12898);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); }
							}
							break;
						case 2 :
							// Parser.g:1673:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition12916); if (state.failed) return;
							// Parser.g:1674:17: (values= singleColumnInValues |marker= inMarker )
							int alt228=2;
							int LA228_0 = input.LA(1);
							if ( (LA228_0==199) ) {
								alt228=1;
							}
							else if ( (LA228_0==QMARK||LA228_0==208) ) {
								alt228=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 228, 0, input);
								throw nvae;
							}

							switch (alt228) {
								case 1 :
									// Parser.g:1674:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition12938);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); }
									}
									break;
								case 2 :
									// Parser.g:1675:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition12962);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 5 :
					// Parser.g:1678:11: '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,206,FOLLOW_206_in_columnCondition13008); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnCondition13012);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1679:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt231=2;
					int LA231_0 = input.LA(1);
					if ( (LA231_0==197||(LA231_0 >= 210 && LA231_0 <= 214)) ) {
						alt231=1;
					}
					else if ( (LA231_0==K_IN) ) {
						alt231=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 231, 0, input);
						throw nvae;
					}

					switch (alt231) {
						case 1 :
							// Parser.g:1679:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition13030);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition13034);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); }
							}
							break;
						case 2 :
							// Parser.g:1680:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition13052); if (state.failed) return;
							// Parser.g:1681:17: (values= singleColumnInValues |marker= inMarker )
							int alt230=2;
							int LA230_0 = input.LA(1);
							if ( (LA230_0==199) ) {
								alt230=1;
							}
							else if ( (LA230_0==QMARK||LA230_0==208) ) {
								alt230=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 230, 0, input);
								throw nvae;
							}

							switch (alt230) {
								case 1 :
									// Parser.g:1681:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition13074);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); }
									}
									break;
								case 2 :
									// Parser.g:1682:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition13098);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1688:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1689:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1689:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties13160);
			property(props);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1689:23: ( K_AND property[props] )*
			loop233:
			while (true) {
				int alt233=2;
				int LA233_0 = input.LA(1);
				if ( (LA233_0==K_AND) ) {
					alt233=1;
				}

				switch (alt233) {
				case 1 :
					// Parser.g:1689:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties13164); if (state.failed) return;
					pushFollow(FOLLOW_property_in_properties13166);
					property(props);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop233;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1692:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1693:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral )
			int alt234=2;
			alt234 = dfa234.predict(input);
			switch (alt234) {
				case 1 :
					// Parser.g:1693:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property13189);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,212,FOLLOW_212_in_property13191); if (state.failed) return;
					pushFollow(FOLLOW_propertyValue_in_property13195);
					simple=propertyValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;
				case 2 :
					// Parser.g:1694:7: k= noncol_ident '=' map= fullMapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property13207);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,212,FOLLOW_212_in_property13209); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_property13213);
					map=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1697:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1698:5: (c= constant |u= unreserved_keyword )
			int alt235=2;
			int LA235_0 = input.LA(1);
			if ( (LA235_0==BOOLEAN||LA235_0==DURATION||LA235_0==FLOAT||LA235_0==HEXNUMBER||LA235_0==INTEGER||(LA235_0 >= K_NEGATIVE_INFINITY && LA235_0 <= K_NEGATIVE_NAN)||(LA235_0 >= K_POSITIVE_INFINITY && LA235_0 <= K_POSITIVE_NAN)||LA235_0==STRING_LITERAL||LA235_0==UUID) ) {
				alt235=1;
			}
			else if ( (LA235_0==K_ACCESS||(LA235_0 >= K_AGGREGATE && LA235_0 <= K_ALL)||LA235_0==K_AS||LA235_0==K_ASCII||(LA235_0 >= K_BIGINT && LA235_0 <= K_BOOLEAN)||(LA235_0 >= K_CALLED && LA235_0 <= K_CLUSTERING)||(LA235_0 >= K_COMPACT && LA235_0 <= K_COUNTER)||(LA235_0 >= K_CUSTOM && LA235_0 <= K_DEFAULT)||(LA235_0 >= K_DISTINCT && LA235_0 <= K_DOUBLE)||LA235_0==K_DURATION||(LA235_0 >= K_EXISTS && LA235_0 <= K_FLOAT)||LA235_0==K_FROZEN||(LA235_0 >= K_FUNCTION && LA235_0 <= K_FUNCTIONS)||(LA235_0 >= K_GROUP && LA235_0 <= K_HASHED)||(LA235_0 >= K_INET && LA235_0 <= K_INPUT)||(LA235_0 >= K_INT && LA235_0 <= K_INTERNALS)||(LA235_0 >= K_JSON && LA235_0 <= K_KEYS)||(LA235_0 >= K_KEYSPACES && LA235_0 <= K_LIKE)||(LA235_0 >= K_LIST && LA235_0 <= K_MAP)||(LA235_0 >= K_MAXWRITETIME && LA235_0 <= K_MBEANS)||LA235_0==K_NOLOGIN||LA235_0==K_NOSUPERUSER||(LA235_0 >= K_ONLY && LA235_0 <= K_OPTIONS)||(LA235_0 >= K_PARTITION && LA235_0 <= K_PERMISSIONS)||(LA235_0 >= K_REPLACE && LA235_0 <= K_RETURNS)||(LA235_0 >= K_ROLE && LA235_0 <= K_ROLES)||(LA235_0 >= K_SFUNC && LA235_0 <= K_TINYINT)||LA235_0==K_TRIGGER||(LA235_0 >= K_TTL && LA235_0 <= K_TYPES)||LA235_0==K_UNSET||(LA235_0 >= K_USER && LA235_0 <= K_USERS)||(LA235_0 >= K_UUID && LA235_0 <= K_VARINT)||LA235_0==K_WRITETIME) ) {
				alt235=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 235, 0, input);
				throw nvae;
			}

			switch (alt235) {
				case 1 :
					// Parser.g:1698:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue13238);
					c=constant();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = c.getRawText(); }
					}
					break;
				case 2 :
					// Parser.g:1699:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue13260);
					u=unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1702:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1703:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt236=6;
			switch ( input.LA(1) ) {
			case 212:
				{
				alt236=1;
				}
				break;
			case 210:
				{
				alt236=2;
				}
				break;
			case 211:
				{
				alt236=3;
				}
				break;
			case 213:
				{
				alt236=4;
				}
				break;
			case 214:
				{
				alt236=5;
				}
				break;
			case 197:
				{
				alt236=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 236, 0, input);
				throw nvae;
			}
			switch (alt236) {
				case 1 :
					// Parser.g:1703:7: '='
					{
					match(input,212,FOLLOW_212_in_relationType13283); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.EQ; }
					}
					break;
				case 2 :
					// Parser.g:1704:7: '<'
					{
					match(input,210,FOLLOW_210_in_relationType13294); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LT; }
					}
					break;
				case 3 :
					// Parser.g:1705:7: '<='
					{
					match(input,211,FOLLOW_211_in_relationType13305); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LTE; }
					}
					break;
				case 4 :
					// Parser.g:1706:7: '>'
					{
					match(input,213,FOLLOW_213_in_relationType13315); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GT; }
					}
					break;
				case 5 :
					// Parser.g:1707:7: '>='
					{
					match(input,214,FOLLOW_214_in_relationType13326); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GTE; }
					}
					break;
				case 6 :
					// Parser.g:1708:7: '!='
					{
					match(input,197,FOLLOW_197_in_relationType13336); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.NEQ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1711:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnIdentifier name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnIdentifier> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Operator rt =null;
		Term.Raw key =null;
		List<ColumnIdentifier> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1712:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt239=10;
			alt239 = dfa239.predict(input);
			switch (alt239) {
				case 1 :
					// Parser.g:1712:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation13358);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation13362);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13366);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, type, t)); }
					}
					break;
				case 2 :
					// Parser.g:1713:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation13378);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation13380); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13384);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); }
					}
					break;
				case 3 :
					// Parser.g:1714:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation13396);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IS,FOLLOW_K_IS_in_relation13398); if (state.failed) return;
					match(input,K_NOT,FOLLOW_K_NOT_in_relation13400); if (state.failed) return;
					match(input,K_NULL,FOLLOW_K_NULL_in_relation13402); if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); }
					}
					break;
				case 4 :
					// Parser.g:1715:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation13412); if (state.failed) return;
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation13416);
					l=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation13420);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13424);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new TokenRelation(l, type, t)); }
					}
					break;
				case 5 :
					// Parser.g:1717:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation13444);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation13446); if (state.failed) return;
					pushFollow(FOLLOW_inMarker_in_relation13450);
					marker=inMarker();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); }
					}
					break;
				case 6 :
					// Parser.g:1719:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation13470);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation13472); if (state.failed) return;
					pushFollow(FOLLOW_singleColumnInValues_in_relation13476);
					inValues=singleColumnInValues();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(SingleColumnRelation.createInRelation(name, inValues)); }
					}
					break;
				case 7 :
					// Parser.g:1721:7: name= cident rt= containsOperator t= term
					{
					pushFollow(FOLLOW_cident_in_relation13496);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_containsOperator_in_relation13500);
					rt=containsOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13504);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, rt, t)); }
					}
					break;
				case 8 :
					// Parser.g:1722:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation13516);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,215,FOLLOW_215_in_relation13518); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13522);
					key=term();
					state._fsp--;
					if (state.failed) return;
					match(input,217,FOLLOW_217_in_relation13524); if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation13528);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13532);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, key, type, t)); }
					}
					break;
				case 9 :
					// Parser.g:1723:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation13544);
					ids=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1724:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt238=3;
					alt238 = dfa238.predict(input);
					switch (alt238) {
						case 1 :
							// Parser.g:1724:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation13554); if (state.failed) return;
							// Parser.g:1725:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt237=4;
							int LA237_0 = input.LA(1);
							if ( (LA237_0==199) ) {
								switch ( input.LA(2) ) {
								case 200:
									{
									alt237=1;
									}
									break;
								case 199:
									{
									alt237=3;
									}
									break;
								case QMARK:
								case 208:
									{
									alt237=4;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 237, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA237_0==QMARK||LA237_0==208) ) {
								alt237=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 237, 0, input);
								throw nvae;
							}

							switch (alt237) {
								case 1 :
									// Parser.g:1725:13: '(' ')'
									{
									match(input,199,FOLLOW_199_in_relation13568); if (state.failed) return;
									match(input,200,FOLLOW_200_in_relation13570); if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); }
									}
									break;
								case 2 :
									// Parser.g:1727:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation13602);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); }
									}
									break;
								case 3 :
									// Parser.g:1729:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation13636);
									literals=tupleOfTupleLiterals();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) {
									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              }
									}
									break;
								case 4 :
									// Parser.g:1733:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation13670);
									markers=tupleOfMarkersForTuples();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, markers)); }
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1736:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation13712);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_tupleLiteral_in_relation13716);
							literal=tupleLiteral();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {
							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          }
							}
							break;
						case 3 :
							// Parser.g:1740:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation13742);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_markerForTuple_in_relation13746);
							tupleMarker=markerForTuple();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); }
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1743:7: '(' relation[$clauses] ')'
					{
					match(input,199,FOLLOW_199_in_relation13776); if (state.failed) return;
					pushFollow(FOLLOW_relation_in_relation13778);
					relation(clauses);
					state._fsp--;
					if (state.failed) return;
					match(input,200,FOLLOW_200_in_relation13781); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "containsOperator"
	// Parser.g:1746:1: containsOperator returns [Operator o] : K_CONTAINS ( K_KEY )? ;
	public final Operator containsOperator() throws RecognitionException {
		Operator o = null;


		try {
			// Parser.g:1747:5: ( K_CONTAINS ( K_KEY )? )
			// Parser.g:1747:7: K_CONTAINS ( K_KEY )?
			{
			match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_containsOperator13802); if (state.failed) return o;
			if ( state.backtracking==0 ) { o = Operator.CONTAINS; }
			// Parser.g:1747:45: ( K_KEY )?
			int alt240=2;
			int LA240_0 = input.LA(1);
			if ( (LA240_0==K_KEY) ) {
				int LA240_1 = input.LA(2);
				if ( (LA240_1==BOOLEAN||LA240_1==DURATION||LA240_1==FLOAT||LA240_1==HEXNUMBER||(LA240_1 >= IDENT && LA240_1 <= INTEGER)||LA240_1==K_ACCESS||(LA240_1 >= K_AGGREGATE && LA240_1 <= K_ALL)||LA240_1==K_AS||LA240_1==K_ASCII||(LA240_1 >= K_BIGINT && LA240_1 <= K_BOOLEAN)||(LA240_1 >= K_CALLED && LA240_1 <= K_CLUSTERING)||(LA240_1 >= K_COMPACT && LA240_1 <= K_COUNTER)||(LA240_1 >= K_CUSTOM && LA240_1 <= K_DEFAULT)||(LA240_1 >= K_DISTINCT && LA240_1 <= K_DOUBLE)||LA240_1==K_DURATION||(LA240_1 >= K_EXISTS && LA240_1 <= K_FLOAT)||LA240_1==K_FROZEN||(LA240_1 >= K_FUNCTION && LA240_1 <= K_FUNCTIONS)||(LA240_1 >= K_GROUP && LA240_1 <= K_HASHED)||(LA240_1 >= K_INET && LA240_1 <= K_INPUT)||(LA240_1 >= K_INT && LA240_1 <= K_INTERNALS)||(LA240_1 >= K_JSON && LA240_1 <= K_KEYS)||(LA240_1 >= K_KEYSPACES && LA240_1 <= K_LIKE)||(LA240_1 >= K_LIST && LA240_1 <= K_MAP)||(LA240_1 >= K_MAXWRITETIME && LA240_1 <= K_MBEANS)||(LA240_1 >= K_NEGATIVE_INFINITY && LA240_1 <= K_NOLOGIN)||LA240_1==K_NOSUPERUSER||LA240_1==K_NULL||(LA240_1 >= K_ONLY && LA240_1 <= K_OPTIONS)||(LA240_1 >= K_PARTITION && LA240_1 <= K_POSITIVE_NAN)||(LA240_1 >= K_REPLACE && LA240_1 <= K_RETURNS)||(LA240_1 >= K_ROLE && LA240_1 <= K_ROLES)||(LA240_1 >= K_SFUNC && LA240_1 <= K_TINYINT)||(LA240_1 >= K_TOKEN && LA240_1 <= K_TRIGGER)||(LA240_1 >= K_TTL && LA240_1 <= K_TYPES)||LA240_1==K_UNSET||(LA240_1 >= K_USER && LA240_1 <= K_USERS)||(LA240_1 >= K_UUID && LA240_1 <= K_VARINT)||LA240_1==K_WRITETIME||(LA240_1 >= QMARK && LA240_1 <= QUOTED_NAME)||LA240_1==STRING_LITERAL||LA240_1==UUID||LA240_1==199||LA240_1==204||LA240_1==208||LA240_1==215||LA240_1==219) ) {
					alt240=1;
				}
			}
			switch (alt240) {
				case 1 :
					// Parser.g:1747:46: K_KEY
					{
					match(input,K_KEY,FOLLOW_K_KEY_in_containsOperator13807); if (state.failed) return o;
					if ( state.backtracking==0 ) { o = Operator.CONTAINS_KEY; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return o;
	}
	// $ANTLR end "containsOperator"



	// $ANTLR start "inMarker"
	// Parser.g:1750:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1751:5: ( QMARK | ':' name= noncol_ident )
			int alt241=2;
			int LA241_0 = input.LA(1);
			if ( (LA241_0==QMARK) ) {
				alt241=1;
			}
			else if ( (LA241_0==208) ) {
				alt241=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 241, 0, input);
				throw nvae;
			}

			switch (alt241) {
				case 1 :
					// Parser.g:1751:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker13832); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1752:7: ':' name= noncol_ident
					{
					match(input,208,FOLLOW_208_in_inMarker13842); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarker13846);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1755:1: tupleOfIdentifiers returns [List<ColumnIdentifier> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnIdentifier> ids = null;


		ColumnIdentifier n1 =null;
		ColumnIdentifier ni =null;

		 ids = new ArrayList<ColumnIdentifier>(); 
		try {
			// Parser.g:1757:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1757:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,199,FOLLOW_199_in_tupleOfIdentifiers13878); if (state.failed) return ids;
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers13882);
			n1=cident();
			state._fsp--;
			if (state.failed) return ids;
			if ( state.backtracking==0 ) { ids.add(n1); }
			// Parser.g:1757:39: ( ',' ni= cident )*
			loop242:
			while (true) {
				int alt242=2;
				int LA242_0 = input.LA(1);
				if ( (LA242_0==203) ) {
					alt242=1;
				}

				switch (alt242) {
				case 1 :
					// Parser.g:1757:40: ',' ni= cident
					{
					match(input,203,FOLLOW_203_in_tupleOfIdentifiers13887); if (state.failed) return ids;
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers13891);
					ni=cident();
					state._fsp--;
					if (state.failed) return ids;
					if ( state.backtracking==0 ) { ids.add(ni); }
					}
					break;

				default :
					break loop242;
				}
			}

			match(input,200,FOLLOW_200_in_tupleOfIdentifiers13897); if (state.failed) return ids;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1760:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1762:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1762:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,199,FOLLOW_199_in_singleColumnInValues13927); if (state.failed) return terms;
			// Parser.g:1762:11: (t1= term ( ',' ti= term )* )?
			int alt244=2;
			int LA244_0 = input.LA(1);
			if ( (LA244_0==BOOLEAN||LA244_0==DURATION||LA244_0==FLOAT||LA244_0==HEXNUMBER||(LA244_0 >= IDENT && LA244_0 <= INTEGER)||LA244_0==K_ACCESS||(LA244_0 >= K_AGGREGATE && LA244_0 <= K_ALL)||LA244_0==K_AS||LA244_0==K_ASCII||(LA244_0 >= K_BIGINT && LA244_0 <= K_BOOLEAN)||(LA244_0 >= K_CALLED && LA244_0 <= K_CLUSTERING)||(LA244_0 >= K_COMPACT && LA244_0 <= K_COUNTER)||(LA244_0 >= K_CUSTOM && LA244_0 <= K_DEFAULT)||(LA244_0 >= K_DISTINCT && LA244_0 <= K_DOUBLE)||LA244_0==K_DURATION||(LA244_0 >= K_EXISTS && LA244_0 <= K_FLOAT)||LA244_0==K_FROZEN||(LA244_0 >= K_FUNCTION && LA244_0 <= K_FUNCTIONS)||(LA244_0 >= K_GROUP && LA244_0 <= K_HASHED)||(LA244_0 >= K_INET && LA244_0 <= K_INPUT)||(LA244_0 >= K_INT && LA244_0 <= K_INTERNALS)||(LA244_0 >= K_JSON && LA244_0 <= K_KEYS)||(LA244_0 >= K_KEYSPACES && LA244_0 <= K_LIKE)||(LA244_0 >= K_LIST && LA244_0 <= K_MAP)||(LA244_0 >= K_MAXWRITETIME && LA244_0 <= K_MBEANS)||(LA244_0 >= K_NEGATIVE_INFINITY && LA244_0 <= K_NOLOGIN)||LA244_0==K_NOSUPERUSER||LA244_0==K_NULL||(LA244_0 >= K_ONLY && LA244_0 <= K_OPTIONS)||(LA244_0 >= K_PARTITION && LA244_0 <= K_POSITIVE_NAN)||(LA244_0 >= K_REPLACE && LA244_0 <= K_RETURNS)||(LA244_0 >= K_ROLE && LA244_0 <= K_ROLES)||(LA244_0 >= K_SFUNC && LA244_0 <= K_TINYINT)||(LA244_0 >= K_TOKEN && LA244_0 <= K_TRIGGER)||(LA244_0 >= K_TTL && LA244_0 <= K_TYPES)||LA244_0==K_UNSET||(LA244_0 >= K_USER && LA244_0 <= K_USERS)||(LA244_0 >= K_UUID && LA244_0 <= K_VARINT)||LA244_0==K_WRITETIME||(LA244_0 >= QMARK && LA244_0 <= QUOTED_NAME)||LA244_0==STRING_LITERAL||LA244_0==UUID||LA244_0==199||LA244_0==204||LA244_0==208||LA244_0==215||LA244_0==219) ) {
				alt244=1;
			}
			switch (alt244) {
				case 1 :
					// Parser.g:1762:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues13935);
					t1=term();
					state._fsp--;
					if (state.failed) return terms;
					if ( state.backtracking==0 ) { terms.add(t1); }
					// Parser.g:1762:43: ( ',' ti= term )*
					loop243:
					while (true) {
						int alt243=2;
						int LA243_0 = input.LA(1);
						if ( (LA243_0==203) ) {
							alt243=1;
						}

						switch (alt243) {
						case 1 :
							// Parser.g:1762:44: ',' ti= term
							{
							match(input,203,FOLLOW_203_in_singleColumnInValues13940); if (state.failed) return terms;
							pushFollow(FOLLOW_term_in_singleColumnInValues13944);
							ti=term();
							state._fsp--;
							if (state.failed) return terms;
							if ( state.backtracking==0 ) { terms.add(ti); }
							}
							break;

						default :
							break loop243;
						}
					}

					}
					break;

			}

			match(input,200,FOLLOW_200_in_singleColumnInValues13953); if (state.failed) return terms;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1765:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1767:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1767:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,199,FOLLOW_199_in_tupleOfTupleLiterals13983); if (state.failed) return literals;
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13987);
			t1=tupleLiteral();
			state._fsp--;
			if (state.failed) return literals;
			if ( state.backtracking==0 ) { literals.add(t1); }
			// Parser.g:1767:50: ( ',' ti= tupleLiteral )*
			loop245:
			while (true) {
				int alt245=2;
				int LA245_0 = input.LA(1);
				if ( (LA245_0==203) ) {
					alt245=1;
				}

				switch (alt245) {
				case 1 :
					// Parser.g:1767:51: ',' ti= tupleLiteral
					{
					match(input,203,FOLLOW_203_in_tupleOfTupleLiterals13992); if (state.failed) return literals;
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13996);
					ti=tupleLiteral();
					state._fsp--;
					if (state.failed) return literals;
					if ( state.backtracking==0 ) { literals.add(ti); }
					}
					break;

				default :
					break loop245;
				}
			}

			match(input,200,FOLLOW_200_in_tupleOfTupleLiterals14002); if (state.failed) return literals;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1770:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1771:5: ( QMARK | ':' name= noncol_ident )
			int alt246=2;
			int LA246_0 = input.LA(1);
			if ( (LA246_0==QMARK) ) {
				alt246=1;
			}
			else if ( (LA246_0==208) ) {
				alt246=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 246, 0, input);
				throw nvae;
			}

			switch (alt246) {
				case 1 :
					// Parser.g:1771:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple14023); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1772:7: ':' name= noncol_ident
					{
					match(input,208,FOLLOW_208_in_markerForTuple14033); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple14037);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1775:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1777:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1777:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,199,FOLLOW_199_in_tupleOfMarkersForTuples14069); if (state.failed) return markers;
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples14073);
			m1=markerForTuple();
			state._fsp--;
			if (state.failed) return markers;
			if ( state.backtracking==0 ) { markers.add(m1); }
			// Parser.g:1777:51: ( ',' mi= markerForTuple )*
			loop247:
			while (true) {
				int alt247=2;
				int LA247_0 = input.LA(1);
				if ( (LA247_0==203) ) {
					alt247=1;
				}

				switch (alt247) {
				case 1 :
					// Parser.g:1777:52: ',' mi= markerForTuple
					{
					match(input,203,FOLLOW_203_in_tupleOfMarkersForTuples14078); if (state.failed) return markers;
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples14082);
					mi=markerForTuple();
					state._fsp--;
					if (state.failed) return markers;
					if ( state.backtracking==0 ) { markers.add(mi); }
					}
					break;

				default :
					break loop247;
				}
			}

			match(input,200,FOLLOW_200_in_tupleOfMarkersForTuples14088); if (state.failed) return markers;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1780:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1781:5: ( QMARK | ':' name= noncol_ident )
			int alt248=2;
			int LA248_0 = input.LA(1);
			if ( (LA248_0==QMARK) ) {
				alt248=1;
			}
			else if ( (LA248_0==208) ) {
				alt248=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 248, 0, input);
				throw nvae;
			}

			switch (alt248) {
				case 1 :
					// Parser.g:1781:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple14109); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1782:7: ':' name= noncol_ident
					{
					match(input,208,FOLLOW_208_in_inMarkerForTuple14119); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple14123);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1785:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1786:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt249=6;
			alt249 = dfa249.predict(input);
			switch (alt249) {
				case 1 :
					// Parser.g:1786:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType14148);
					n=native_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.from(n); }
					}
					break;
				case 2 :
					// Parser.g:1787:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType14164);
					c=collection_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = c; }
					}
					break;
				case 3 :
					// Parser.g:1788:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType14176);
					tt=tuple_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = tt; }
					}
					break;
				case 4 :
					// Parser.g:1789:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType14192);
					id=userTypeName();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.userType(id); }
					}
					break;
				case 5 :
					// Parser.g:1790:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType14204); if (state.failed) return t;
					match(input,210,FOLLOW_210_in_comparatorType14206); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_comparatorType14210);
					f=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					match(input,213,FOLLOW_213_in_comparatorType14212); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = f.freeze();
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      }
					}
					break;
				case 6 :
					// Parser.g:1798:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType14230); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        }
					      }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1810:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1811:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt250=21;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt250=1;
				}
				break;
			case K_BIGINT:
				{
				alt250=2;
				}
				break;
			case K_BLOB:
				{
				alt250=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt250=4;
				}
				break;
			case K_COUNTER:
				{
				alt250=5;
				}
				break;
			case K_DECIMAL:
				{
				alt250=6;
				}
				break;
			case K_DOUBLE:
				{
				alt250=7;
				}
				break;
			case K_DURATION:
				{
				alt250=8;
				}
				break;
			case K_FLOAT:
				{
				alt250=9;
				}
				break;
			case K_INET:
				{
				alt250=10;
				}
				break;
			case K_INT:
				{
				alt250=11;
				}
				break;
			case K_SMALLINT:
				{
				alt250=12;
				}
				break;
			case K_TEXT:
				{
				alt250=13;
				}
				break;
			case K_TIMESTAMP:
				{
				alt250=14;
				}
				break;
			case K_TINYINT:
				{
				alt250=15;
				}
				break;
			case K_UUID:
				{
				alt250=16;
				}
				break;
			case K_VARCHAR:
				{
				alt250=17;
				}
				break;
			case K_VARINT:
				{
				alt250=18;
				}
				break;
			case K_TIMEUUID:
				{
				alt250=19;
				}
				break;
			case K_DATE:
				{
				alt250=20;
				}
				break;
			case K_TIME:
				{
				alt250=21;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 250, 0, input);
				throw nvae;
			}
			switch (alt250) {
				case 1 :
					// Parser.g:1811:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type14259); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.ASCII; }
					}
					break;
				case 2 :
					// Parser.g:1812:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type14273); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BIGINT; }
					}
					break;
				case 3 :
					// Parser.g:1813:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type14286); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BLOB; }
					}
					break;
				case 4 :
					// Parser.g:1814:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type14301); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BOOLEAN; }
					}
					break;
				case 5 :
					// Parser.g:1815:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type14313); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.COUNTER; }
					}
					break;
				case 6 :
					// Parser.g:1816:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type14325); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DECIMAL; }
					}
					break;
				case 7 :
					// Parser.g:1817:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type14337); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DOUBLE; }
					}
					break;
				case 8 :
					// Parser.g:1818:7: K_DURATION
					{
					match(input,K_DURATION,FOLLOW_K_DURATION_in_native_type14350); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DURATION; }
					}
					break;
				case 9 :
					// Parser.g:1819:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type14361); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.FLOAT; }
					}
					break;
				case 10 :
					// Parser.g:1820:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type14375); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INET;}
					}
					break;
				case 11 :
					// Parser.g:1821:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type14390); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INT; }
					}
					break;
				case 12 :
					// Parser.g:1822:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type14406); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.SMALLINT; }
					}
					break;
				case 13 :
					// Parser.g:1823:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type14417); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TEXT; }
					}
					break;
				case 14 :
					// Parser.g:1824:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type14432); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMESTAMP; }
					}
					break;
				case 15 :
					// Parser.g:1825:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type14442); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TINYINT; }
					}
					break;
				case 16 :
					// Parser.g:1826:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type14454); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.UUID; }
					}
					break;
				case 17 :
					// Parser.g:1827:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type14469); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARCHAR; }
					}
					break;
				case 18 :
					// Parser.g:1828:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type14481); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARINT; }
					}
					break;
				case 19 :
					// Parser.g:1829:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type14494); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMEUUID; }
					}
					break;
				case 20 :
					// Parser.g:1830:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type14505); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DATE; }
					}
					break;
				case 21 :
					// Parser.g:1831:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type14520); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIME; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1834:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1835:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt251=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt251=1;
				}
				break;
			case K_LIST:
				{
				alt251=2;
				}
				break;
			case K_SET:
				{
				alt251=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return pt;}
				NoViableAltException nvae =
					new NoViableAltException("", 251, 0, input);
				throw nvae;
			}
			switch (alt251) {
				case 1 :
					// Parser.g:1835:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type14548); if (state.failed) return pt;
					match(input,210,FOLLOW_210_in_collection_type14551); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14555);
					t1=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,203,FOLLOW_203_in_collection_type14557); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14561);
					t2=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,213,FOLLOW_213_in_collection_type14563); if (state.failed) return pt;
					if ( state.backtracking==0 ) {
					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        }
					}
					break;
				case 2 :
					// Parser.g:1841:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type14581); if (state.failed) return pt;
					match(input,210,FOLLOW_210_in_collection_type14583); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14587);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,213,FOLLOW_213_in_collection_type14589); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.list(t); }
					}
					break;
				case 3 :
					// Parser.g:1843:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type14607); if (state.failed) return pt;
					match(input,210,FOLLOW_210_in_collection_type14610); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14614);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,213,FOLLOW_213_in_collection_type14616); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.set(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1847:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		List<CQL3Type.Raw> types = new ArrayList<>();
		try {
			// Parser.g:1850:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1850:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type14665); if (state.failed) return t;
			match(input,210,FOLLOW_210_in_tuple_type14667); if (state.failed) return t;
			pushFollow(FOLLOW_comparatorType_in_tuple_type14671);
			t1=comparatorType();
			state._fsp--;
			if (state.failed) return t;
			if ( state.backtracking==0 ) { types.add(t1); }
			// Parser.g:1850:56: ( ',' tn= comparatorType )*
			loop252:
			while (true) {
				int alt252=2;
				int LA252_0 = input.LA(1);
				if ( (LA252_0==203) ) {
					alt252=1;
				}

				switch (alt252) {
				case 1 :
					// Parser.g:1850:57: ',' tn= comparatorType
					{
					match(input,203,FOLLOW_203_in_tuple_type14676); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_tuple_type14680);
					tn=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { types.add(tn); }
					}
					break;

				default :
					break loop252;
				}
			}

			match(input,213,FOLLOW_213_in_tuple_type14686); if (state.failed) return t;
			}

			if ( state.backtracking==0 ) {t = CQL3Type.Raw.tuple(types);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1853:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1854:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt253=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt253=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt253=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt253=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 253, 0, input);
				throw nvae;
			}
			switch (alt253) {
				case 1 :
					// Parser.g:1854:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username14703); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Parser.g:1855:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username14711); if (state.failed) return retval;
					}
					break;
				case 3 :
					// Parser.g:1856:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username14719); if (state.failed) return retval;
					if ( state.backtracking==0 ) { addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1859:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1860:5: ( STRING_LITERAL )
			// Parser.g:1860:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean14738); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1865:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1866:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt254=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt254=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt254=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DEFAULT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_HASHED:
			case K_INITCOND:
			case K_INPUT:
			case K_INTERNALS:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt254=3;
				}
				break;
			case K_KEY:
				{
				alt254=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 254, 0, input);
				throw nvae;
			}
			switch (alt254) {
				case 1 :
					// Parser.g:1866:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident14763); if (state.failed) return id;
					if ( state.backtracking==0 ) { if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1867:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident14794); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1868:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident14819);
					k=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1869:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident14831); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((kk!=null?kk.getText():null), false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1872:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_MAXWRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1873:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_MAXWRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) )
			int alt255=2;
			int LA255_0 = input.LA(1);
			if ( (LA255_0==K_ACCESS||(LA255_0 >= K_AGGREGATE && LA255_0 <= K_ALL)||LA255_0==K_AS||LA255_0==K_ASCII||(LA255_0 >= K_BIGINT && LA255_0 <= K_BOOLEAN)||LA255_0==K_CALLED||(LA255_0 >= K_CLUSTER && LA255_0 <= K_CLUSTERING)||(LA255_0 >= K_COMPACT && LA255_0 <= K_CONTAINS)||LA255_0==K_COUNTER||(LA255_0 >= K_CUSTOM && LA255_0 <= K_DEFAULT)||LA255_0==K_DOUBLE||LA255_0==K_DURATION||(LA255_0 >= K_EXISTS && LA255_0 <= K_FLOAT)||LA255_0==K_FROZEN||(LA255_0 >= K_FUNCTION && LA255_0 <= K_FUNCTIONS)||(LA255_0 >= K_GROUP && LA255_0 <= K_HASHED)||(LA255_0 >= K_INET && LA255_0 <= K_INPUT)||(LA255_0 >= K_INT && LA255_0 <= K_INTERNALS)||LA255_0==K_KEYS||(LA255_0 >= K_KEYSPACES && LA255_0 <= K_LIKE)||(LA255_0 >= K_LIST && LA255_0 <= K_MAP)||(LA255_0 >= K_MBEAN && LA255_0 <= K_MBEANS)||LA255_0==K_NOLOGIN||LA255_0==K_NOSUPERUSER||(LA255_0 >= K_ONLY && LA255_0 <= K_OPTIONS)||(LA255_0 >= K_PARTITION && LA255_0 <= K_PERMISSIONS)||(LA255_0 >= K_REPLACE && LA255_0 <= K_RETURNS)||(LA255_0 >= K_ROLE && LA255_0 <= K_ROLES)||(LA255_0 >= K_SFUNC && LA255_0 <= K_TINYINT)||LA255_0==K_TRIGGER||(LA255_0 >= K_TUPLE && LA255_0 <= K_TYPES)||LA255_0==K_UNSET||(LA255_0 >= K_USER && LA255_0 <= K_USERS)||(LA255_0 >= K_UUID && LA255_0 <= K_VARINT)) ) {
				alt255=1;
			}
			else if ( (LA255_0==K_CAST||LA255_0==K_COUNT||LA255_0==K_DISTINCT||(LA255_0 >= K_JSON && LA255_0 <= K_KEY)||LA255_0==K_MAXWRITETIME||LA255_0==K_TTL||LA255_0==K_WRITETIME) ) {
				alt255=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 255, 0, input);
				throw nvae;
			}

			switch (alt255) {
				case 1 :
					// Parser.g:1873:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword14874);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1874:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_MAXWRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_JSON && input.LA(1) <= K_KEY)||input.LA(1)==K_MAXWRITETIME||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return str;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1877:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1878:5: (u= basic_unreserved_keyword |t= native_type )
			int alt256=2;
			int LA256_0 = input.LA(1);
			if ( (LA256_0==K_ACCESS||(LA256_0 >= K_AGGREGATE && LA256_0 <= K_ALL)||LA256_0==K_AS||LA256_0==K_CALLED||(LA256_0 >= K_CLUSTER && LA256_0 <= K_CLUSTERING)||(LA256_0 >= K_COMPACT && LA256_0 <= K_CONTAINS)||(LA256_0 >= K_CUSTOM && LA256_0 <= K_DATACENTERS)||LA256_0==K_DEFAULT||(LA256_0 >= K_EXISTS && LA256_0 <= K_FINALFUNC)||LA256_0==K_FROZEN||(LA256_0 >= K_FUNCTION && LA256_0 <= K_FUNCTIONS)||(LA256_0 >= K_GROUP && LA256_0 <= K_HASHED)||(LA256_0 >= K_INITCOND && LA256_0 <= K_INPUT)||LA256_0==K_INTERNALS||LA256_0==K_KEYS||(LA256_0 >= K_KEYSPACES && LA256_0 <= K_LIKE)||(LA256_0 >= K_LIST && LA256_0 <= K_MAP)||(LA256_0 >= K_MBEAN && LA256_0 <= K_MBEANS)||LA256_0==K_NOLOGIN||LA256_0==K_NOSUPERUSER||(LA256_0 >= K_ONLY && LA256_0 <= K_OPTIONS)||(LA256_0 >= K_PARTITION && LA256_0 <= K_PERMISSIONS)||(LA256_0 >= K_REPLACE && LA256_0 <= K_RETURNS)||(LA256_0 >= K_ROLE && LA256_0 <= K_ROLES)||LA256_0==K_SFUNC||(LA256_0 >= K_STATIC && LA256_0 <= K_TABLES)||LA256_0==K_TRIGGER||(LA256_0 >= K_TUPLE && LA256_0 <= K_TYPES)||LA256_0==K_UNSET||(LA256_0 >= K_USER && LA256_0 <= K_USERS)||LA256_0==K_VALUES) ) {
				alt256=1;
			}
			else if ( (LA256_0==K_ASCII||(LA256_0 >= K_BIGINT && LA256_0 <= K_BOOLEAN)||LA256_0==K_COUNTER||(LA256_0 >= K_DATE && LA256_0 <= K_DECIMAL)||LA256_0==K_DOUBLE||LA256_0==K_DURATION||LA256_0==K_FLOAT||LA256_0==K_INET||LA256_0==K_INT||LA256_0==K_SMALLINT||(LA256_0 >= K_TEXT && LA256_0 <= K_TINYINT)||LA256_0==K_UUID||(LA256_0 >= K_VARCHAR && LA256_0 <= K_VARINT)) ) {
				alt256=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 256, 0, input);
				throw nvae;
			}

			switch (alt256) {
				case 1 :
					// Parser.g:1878:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword14945);
					u=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1879:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword14957);
					t=native_type();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = t.toString(); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1882:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_HASHED | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1883:5: (k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_HASHED | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET ) )
			// Parser.g:1883:7: k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_HASHED | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET )
			{
			k=input.LT(1);
			if ( input.LA(1)==K_ACCESS||(input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||(input.LA(1) >= K_CLUSTER && input.LA(1) <= K_CLUSTERING)||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||(input.LA(1) >= K_CUSTOM && input.LA(1) <= K_DATACENTERS)||input.LA(1)==K_DEFAULT||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||(input.LA(1) >= K_GROUP && input.LA(1) <= K_HASHED)||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_INTERNALS||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||(input.LA(1) >= K_MBEAN && input.LA(1) <= K_MBEANS)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||(input.LA(1) >= K_ONLY && input.LA(1) <= K_OPTIONS)||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||(input.LA(1) >= K_REPLACE && input.LA(1) <= K_RETURNS)||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_TABLES)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPES)||input.LA(1)==K_UNSET||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// $ANTLR start synpred1_Parser
	public final void synpred1_Parser_fragment() throws RecognitionException {
		// Parser.g:276:9: ( K_JSON selectClause )
		// Parser.g:276:10: K_JSON selectClause
		{
		match(input,K_JSON,FOLLOW_K_JSON_in_synpred1_Parser1088); if (state.failed) return;
		pushFollow(FOLLOW_selectClause_in_synpred1_Parser1090);
		selectClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Parser

	// $ANTLR start synpred2_Parser
	public final void synpred2_Parser_fragment() throws RecognitionException {
		// Parser.g:298:7: ( K_DISTINCT selectors )
		// Parser.g:298:8: K_DISTINCT selectors
		{
		match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_synpred2_Parser1291); if (state.failed) return;
		pushFollow(FOLLOW_selectors_in_synpred2_Parser1293);
		selectors();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Parser

	// $ANTLR start synpred3_Parser
	public final void synpred3_Parser_fragment() throws RecognitionException {
		// Parser.g:332:7: ( selectionGroupWithField )
		// Parser.g:332:8: selectionGroupWithField
		{
		pushFollow(FOLLOW_selectionGroupWithField_in_synpred3_Parser1622);
		selectionGroupWithField();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Parser

	// $ANTLR start synpred4_Parser
	public final void synpred4_Parser_fragment() throws RecognitionException {
		// Parser.g:366:7: ( selectionTypeHint )
		// Parser.g:366:8: selectionTypeHint
		{
		pushFollow(FOLLOW_selectionTypeHint_in_synpred4_Parser1909);
		selectionTypeHint();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Parser

	// $ANTLR start synpred5_Parser
	public final void synpred5_Parser_fragment() throws RecognitionException {
		// Parser.g:1357:7: ( K_CLUSTER )
		// Parser.g:1357:8: K_CLUSTER
		{
		match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_synpred5_Parser9289); if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_Parser

	// $ANTLR start synpred6_Parser
	public final void synpred6_Parser_fragment() throws RecognitionException {
		// Parser.g:1359:7: ( K_KEYSPACES )
		// Parser.g:1359:8: K_KEYSPACES
		{
		match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_synpred6_Parser9345); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_Parser

	// $ANTLR start synpred7_Parser
	public final void synpred7_Parser_fragment() throws RecognitionException {
		// Parser.g:1362:7: ( K_TABLES )
		// Parser.g:1362:8: K_TABLES
		{
		match(input,K_TABLES,FOLLOW_K_TABLES_in_synpred7_Parser9452); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_Parser

	// $ANTLR start synpred8_Parser
	public final void synpred8_Parser_fragment() throws RecognitionException {
		// Parser.g:1366:7: ( K_TYPES )
		// Parser.g:1366:8: K_TYPES
		{
		match(input,K_TYPES,FOLLOW_K_TYPES_in_synpred8_Parser9557); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_Parser

	// $ANTLR start synpred9_Parser
	public final void synpred9_Parser_fragment() throws RecognitionException {
		// Parser.g:1368:7: ( K_FUNCTIONS )
		// Parser.g:1368:8: K_FUNCTIONS
		{
		match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_synpred9_Parser9631); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_Parser

	// $ANTLR start synpred10_Parser
	public final void synpred10_Parser_fragment() throws RecognitionException {
		// Parser.g:1370:7: ( K_AGGREGATES )
		// Parser.g:1370:8: K_AGGREGATES
		{
		match(input,K_AGGREGATES,FOLLOW_K_AGGREGATES_in_synpred10_Parser9693); if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_Parser

	// Delegated rules

	public final boolean synpred2_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA157 dfa157 = new DFA157(this);
	protected DFA181 dfa181 = new DFA181(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA187 dfa187 = new DFA187(this);
	protected DFA195 dfa195 = new DFA195(this);
	protected DFA196 dfa196 = new DFA196(this);
	protected DFA214 dfa214 = new DFA214(this);
	protected DFA216 dfa216 = new DFA216(this);
	protected DFA218 dfa218 = new DFA218(this);
	protected DFA220 dfa220 = new DFA220(this);
	protected DFA223 dfa223 = new DFA223(this);
	protected DFA226 dfa226 = new DFA226(this);
	protected DFA234 dfa234 = new DFA234(this);
	protected DFA239 dfa239 = new DFA239(this);
	protected DFA238 dfa238 = new DFA238(this);
	protected DFA249 dfa249 = new DFA249(this);
	static final String DFA1_eotS =
		"\64\uffff";
	static final String DFA1_eofS =
		"\64\uffff";
	static final String DFA1_minS =
		"\1\41\7\uffff\2\35\1\62\2\27\1\37\11\uffff\1\u0083\22\uffff\1\165\2\uffff"+
		"\1\112\5\uffff\1\35";
	static final String DFA1_maxS =
		"\1\u00a2\7\uffff\3\u00a3\2\u00bb\1\u00a4\11\uffff\1\u0083\22\uffff\1\u0097"+
		"\2\uffff\1\176\5\uffff\1\115";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\51\1\10\1\11\1\23\1\27"+
		"\1\31\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1"+
		"\35\1\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\64\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\15\uffff\1\10\5\uffff\1\5\2\16\2\uffff\1\11\14\uffff"+
			"\1\13\10\uffff\1\2\14\uffff\1\15\37\uffff\1\14\3\uffff\1\1\20\uffff\1"+
			"\7\6\uffff\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\24\uffff\1\20\5\uffff\1\26\24\uffff\1\30\6\uffff\1\26\13\uffff"+
			"\1\17\7\uffff\1\25\17\uffff\1\27\15\uffff\1\24\22\uffff\1\22\3\uffff"+
			"\1\23\5\uffff\1\21",
			"\1\41\24\uffff\1\33\32\uffff\1\40\6\uffff\1\34\13\uffff\1\32\7\uffff"+
			"\1\43\35\uffff\1\42\22\uffff\1\36\3\uffff\1\37\5\uffff\1\35",
			"\1\44\55\uffff\1\45\7\uffff\1\51\35\uffff\1\50\26\uffff\1\47\5\uffff"+
			"\1\46",
			"\1\54\3\uffff\1\54\1\uffff\2\54\1\52\1\uffff\1\53\2\uffff\1\54\1\uffff"+
			"\1\54\1\53\2\uffff\3\54\1\uffff\4\54\1\uffff\4\54\1\53\5\54\2\uffff\1"+
			"\53\2\54\1\53\1\54\1\uffff\1\53\4\54\1\uffff\1\54\1\uffff\2\54\1\uffff"+
			"\2\54\3\uffff\3\54\1\uffff\2\54\2\uffff\3\54\1\uffff\3\54\1\uffff\3\54"+
			"\1\uffff\3\54\1\53\2\uffff\1\54\1\uffff\1\54\4\uffff\2\54\2\uffff\5\54"+
			"\4\uffff\2\54\1\uffff\2\54\1\uffff\1\53\1\uffff\14\54\2\uffff\1\54\1"+
			"\uffff\4\54\1\uffff\1\54\2\uffff\2\54\1\uffff\4\54\3\uffff\1\54\10\uffff"+
			"\2\54\3\uffff\1\54",
			"\1\57\3\uffff\1\57\1\uffff\2\57\1\55\1\uffff\1\56\2\uffff\1\57\1\uffff"+
			"\1\57\1\56\2\uffff\3\57\1\uffff\4\57\1\uffff\4\57\1\56\5\57\2\uffff\1"+
			"\56\2\57\1\56\1\57\1\uffff\1\56\4\57\1\uffff\1\57\1\uffff\2\57\1\uffff"+
			"\2\57\3\uffff\3\57\1\uffff\2\57\2\uffff\3\57\1\uffff\3\57\1\uffff\3\57"+
			"\1\uffff\3\57\1\56\2\uffff\1\57\1\uffff\1\57\4\uffff\2\57\2\uffff\5\57"+
			"\4\uffff\2\57\1\uffff\2\57\1\uffff\1\56\1\uffff\14\57\2\uffff\1\57\1"+
			"\uffff\4\57\1\uffff\1\57\2\uffff\2\57\1\uffff\4\57\3\uffff\1\57\10\uffff"+
			"\2\57\3\uffff\1\57",
			"\1\62\1\uffff\1\62\5\uffff\1\62\17\uffff\1\62\7\uffff\1\62\2\uffff\1"+
			"\62\2\uffff\1\62\46\uffff\1\62\32\uffff\1\61\1\uffff\1\62\32\uffff\1"+
			"\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
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
			"",
			"",
			"",
			"",
			"",
			"\1\53\10\uffff\1\53\30\uffff\1\54",
			"",
			"",
			"\1\57\52\uffff\1\56\10\uffff\1\56",
			"",
			"",
			"",
			"",
			"",
			"\1\31\57\uffff\1\30"
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
			return "207:1: cqlStatement returns [CQLStatement.Raw stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement );";
		}
	}

	static final String DFA2_eotS =
		"\65\uffff";
	static final String DFA2_eofS =
		"\65\uffff";
	static final String DFA2_minS =
		"\1\6\1\0\63\uffff";
	static final String DFA2_maxS =
		"\1\u00db\1\0\63\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\61\uffff\1\1";
	static final String DFA2_specialS =
		"\1\uffff\1\0\63\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
			"\3\2\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\5\2\3\uffff\2\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\2\2\3\uffff\3\2\1\uffff\2\2\2\uffff\1\1\2\2\1\uffff\3\2\1\uffff\3\2"+
			"\1\uffff\3\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff"+
			"\7\2\2\uffff\2\2\1\uffff\2\2\3\uffff\14\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff"+
			"\1\2\10\uffff\1\2\4\uffff\1\2\3\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
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
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "276:7: ( ( K_JSON selectClause )=> K_JSON )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA2_1 = input.LA(1);
						 
						int index2_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Parser()) ) {s = 52;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index2_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 2, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS =
		"\64\uffff";
	static final String DFA11_eofS =
		"\64\uffff";
	static final String DFA11_minS =
		"\1\6\1\0\62\uffff";
	static final String DFA11_maxS =
		"\1\u00db\1\0\62\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\60\uffff\1\1";
	static final String DFA11_specialS =
		"\1\uffff\1\0\62\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
			"\3\2\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\5\2\3\uffff\1\1\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2"+
			"\1\uffff\2\2\3\uffff\3\2\1\uffff\2\2\2\uffff\3\2\1\uffff\3\2\1\uffff"+
			"\3\2\1\uffff\3\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff"+
			"\7\2\2\uffff\2\2\1\uffff\2\2\3\uffff\14\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff"+
			"\1\2\10\uffff\1\2\4\uffff\1\2\3\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
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
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "295:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_1 = input.LA(1);
						 
						int index11_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Parser()) ) {s = 51;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index11_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA17_eotS =
		"\63\uffff";
	static final String DFA17_eofS =
		"\63\uffff";
	static final String DFA17_minS =
		"\1\6\57\0\3\uffff";
	static final String DFA17_maxS =
		"\1\u00db\57\0\3\uffff";
	static final String DFA17_acceptS =
		"\60\uffff\1\3\1\1\1\2";
	static final String DFA17_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\3\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\35\4\uffff\1\36\5\uffff\1\34\3\uffff\1\40\1\uffff\1\1\1\33\2\uffff"+
			"\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\52\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11\1\3\3\uffff"+
			"\1\53\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\53\1\3\1\uffff\3\3\1"+
			"\uffff\3\3\1\uffff\1\47\2\3\1\uffff\1\43\1\41\1\3\1\uffff\1\3\1\uffff"+
			"\1\44\2\uffff\2\3\2\uffff\5\3\1\42\1\41\2\uffff\2\3\1\uffff\2\3\3\uffff"+
			"\1\3\1\17\5\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\54\1\3\1\uffff\1\51"+
			"\3\3\1\uffff\1\3\2\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\50"+
			"\10\uffff\1\46\1\2\3\uffff\1\32\2\uffff\1\37\10\uffff\1\55\4\uffff\1"+
			"\60\3\uffff\1\45\6\uffff\1\56\3\uffff\1\57",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "331:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_1 = input.LA(1);
						 
						int index17_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_2 = input.LA(1);
						 
						int index17_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_3 = input.LA(1);
						 
						int index17_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_4 = input.LA(1);
						 
						int index17_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_5 = input.LA(1);
						 
						int index17_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_6 = input.LA(1);
						 
						int index17_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_7 = input.LA(1);
						 
						int index17_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_8 = input.LA(1);
						 
						int index17_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_9 = input.LA(1);
						 
						int index17_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_10 = input.LA(1);
						 
						int index17_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_11 = input.LA(1);
						 
						int index17_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_12 = input.LA(1);
						 
						int index17_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_13 = input.LA(1);
						 
						int index17_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_14 = input.LA(1);
						 
						int index17_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_15 = input.LA(1);
						 
						int index17_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_16 = input.LA(1);
						 
						int index17_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_17 = input.LA(1);
						 
						int index17_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_18 = input.LA(1);
						 
						int index17_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_19 = input.LA(1);
						 
						int index17_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_20 = input.LA(1);
						 
						int index17_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_21 = input.LA(1);
						 
						int index17_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_22 = input.LA(1);
						 
						int index17_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_23 = input.LA(1);
						 
						int index17_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_24 = input.LA(1);
						 
						int index17_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_25 = input.LA(1);
						 
						int index17_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_26 = input.LA(1);
						 
						int index17_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA17_27 = input.LA(1);
						 
						int index17_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA17_28 = input.LA(1);
						 
						int index17_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA17_29 = input.LA(1);
						 
						int index17_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA17_30 = input.LA(1);
						 
						int index17_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA17_31 = input.LA(1);
						 
						int index17_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA17_32 = input.LA(1);
						 
						int index17_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA17_33 = input.LA(1);
						 
						int index17_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA17_34 = input.LA(1);
						 
						int index17_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA17_35 = input.LA(1);
						 
						int index17_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA17_36 = input.LA(1);
						 
						int index17_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA17_37 = input.LA(1);
						 
						int index17_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA17_38 = input.LA(1);
						 
						int index17_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA17_39 = input.LA(1);
						 
						int index17_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA17_40 = input.LA(1);
						 
						int index17_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA17_41 = input.LA(1);
						 
						int index17_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA17_42 = input.LA(1);
						 
						int index17_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA17_43 = input.LA(1);
						 
						int index17_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA17_44 = input.LA(1);
						 
						int index17_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA17_45 = input.LA(1);
						 
						int index17_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA17_46 = input.LA(1);
						 
						int index17_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_46);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA17_47 = input.LA(1);
						 
						int index17_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 49;}
						else if ( (true) ) {s = 50;}
						 
						input.seek(index17_47);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA22_eotS =
		"\62\uffff";
	static final String DFA22_eofS =
		"\62\uffff";
	static final String DFA22_minS =
		"\1\6\54\uffff\1\0\4\uffff";
	static final String DFA22_maxS =
		"\1\u00db\54\uffff\1\0\4\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\54\uffff\1\4\1\5\1\2\1\3";
	static final String DFA22_specialS =
		"\55\uffff\1\0\4\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\4\uffff\1\1\5\uffff\1\1\3\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff"+
			"\3\1\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
			"\5\1\3\uffff\2\1\1\uffff\1\1\2\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
			"\2\1\3\uffff\3\1\1\uffff\2\1\2\uffff\3\1\1\uffff\3\1\1\uffff\3\1\1\uffff"+
			"\3\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\7\1\2\uffff"+
			"\2\1\1\uffff\2\1\3\uffff\14\1\1\uffff\2\1\1\uffff\4\1\1\uffff\1\1\2\uffff"+
			"\2\1\1\uffff\4\1\3\uffff\1\1\10\uffff\2\1\3\uffff\1\1\2\uffff\1\1\10"+
			"\uffff\1\55\10\uffff\1\1\6\uffff\1\56\3\uffff\1\57",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "362:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_45 = input.LA(1);
						 
						int index22_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index22_45);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA30_eotS =
		"\127\uffff";
	static final String DFA30_eofS =
		"\1\uffff\31\42\1\uffff\1\32\5\42\4\uffff\31\42\31\32";
	static final String DFA30_minS =
		"\1\6\31\40\1\uffff\6\40\2\uffff\2\27\62\40";
	static final String DFA30_maxS =
		"\1\u00d0\31\u00dc\1\uffff\6\u00dc\2\uffff\2\u00b7\62\u00dc";
	static final String DFA30_acceptS =
		"\32\uffff\1\2\6\uffff\1\3\1\1\64\uffff";
	static final String DFA30_specialS =
		"\127\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\32\4\uffff\1\32\5\uffff\1\32\3\uffff\1\32\1\uffff\1\1\1\32\2\uffff"+
			"\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\37\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11\1\3\3\uffff"+
			"\1\40\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\40\1\3\1\uffff\3\3\1"+
			"\uffff\3\3\1\uffff\1\34\2\3\1\uffff\2\32\1\3\1\uffff\1\3\1\uffff\1\32"+
			"\2\uffff\2\3\2\uffff\5\3\2\32\2\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17"+
			"\5\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\41\1\3\1\uffff\1\36\3\3\1\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\35\10\uffff\1\33"+
			"\1\2\3\uffff\1\32\2\uffff\1\32\21\uffff\1\32",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\uffff\2\32\1\uffff\2\32\1\uffff\1\44\3\32\5\uffff"+
			"\3\32\2\uffff\1\32",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\uffff\2\42\1\uffff\2\42\1\uffff\1\43\3\42\5\uffff"+
			"\3\42\2\uffff\1\42",
			"",
			"",
			"\1\45\3\uffff\1\47\1\uffff\3\47\4\uffff\1\47\1\uffff\1\50\3\uffff\1"+
			"\51\1\52\1\53\1\uffff\1\47\1\42\2\47\1\uffff\2\47\1\75\1\54\1\uffff\2"+
			"\47\1\73\1\55\1\47\3\uffff\1\42\1\56\1\uffff\1\57\2\uffff\3\47\1\60\1"+
			"\uffff\1\47\1\uffff\2\47\1\uffff\2\47\3\uffff\1\61\2\47\1\uffff\1\62"+
			"\1\47\2\uffff\2\42\1\47\1\uffff\3\47\1\uffff\3\47\1\uffff\1\42\2\47\3"+
			"\uffff\1\47\1\uffff\1\47\4\uffff\2\47\2\uffff\5\47\4\uffff\2\47\1\uffff"+
			"\2\47\3\uffff\1\47\1\63\5\47\1\64\1\74\1\65\1\72\1\66\1\uffff\1\41\1"+
			"\47\1\uffff\1\42\3\47\1\uffff\1\47\2\uffff\2\47\1\uffff\1\67\1\47\1\70"+
			"\1\71\3\uffff\1\42\11\uffff\1\46",
			"\1\76\3\uffff\1\100\1\uffff\3\100\4\uffff\1\100\1\uffff\1\101\3\uffff"+
			"\1\102\1\103\1\104\1\uffff\1\100\1\32\2\100\1\uffff\2\100\1\126\1\105"+
			"\1\uffff\2\100\1\124\1\106\1\100\3\uffff\1\32\1\107\1\uffff\1\110\2\uffff"+
			"\3\100\1\111\1\uffff\1\100\1\uffff\2\100\1\uffff\2\100\3\uffff\1\112"+
			"\2\100\1\uffff\1\113\1\100\2\uffff\2\32\1\100\1\uffff\3\100\1\uffff\3"+
			"\100\1\uffff\1\32\2\100\3\uffff\1\100\1\uffff\1\100\4\uffff\2\100\2\uffff"+
			"\5\100\4\uffff\2\100\1\uffff\2\100\3\uffff\1\100\1\114\5\100\1\115\1"+
			"\125\1\116\1\123\1\117\1\uffff\1\41\1\100\1\uffff\1\32\3\100\1\uffff"+
			"\1\100\2\uffff\2\100\1\uffff\1\120\1\100\1\121\1\122\3\uffff\1\32\11"+
			"\uffff\1\77",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\42\3\uffff\1\42\45\uffff\1\42\31\uffff\1\42\24\uffff\1\42\2\uffff"+
			"\1\42\111\uffff\1\42\1\41\2\42\1\uffff\2\42\1\uffff\4\42\5\uffff\3\42"+
			"\2\uffff\1\42",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32",
			"\1\32\3\uffff\1\32\45\uffff\1\32\31\uffff\1\32\24\uffff\1\32\2\uffff"+
			"\1\32\111\uffff\1\32\1\41\2\32\1\uffff\2\32\1\uffff\4\32\5\uffff\3\32"+
			"\2\uffff\1\32"
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "410:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );";
		}
	}

	static final String DFA31_eotS =
		"\15\uffff";
	static final String DFA31_eofS =
		"\15\uffff";
	static final String DFA31_minS =
		"\1\27\5\u00c7\1\uffff\1\6\5\uffff";
	static final String DFA31_maxS =
		"\1\u00b7\5\u00ce\1\uffff\1\u00db\5\uffff";
	static final String DFA31_acceptS =
		"\6\uffff\1\6\1\uffff\1\2\1\3\1\4\1\5\1\1";
	static final String DFA31_specialS =
		"\15\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\6\3\uffff\1\6\1\uffff\3\6\4\uffff\1\6\1\uffff\1\6\3\uffff\3\6\1\uffff"+
			"\1\6\1\5\2\6\1\uffff\2\6\1\1\1\6\1\uffff\5\6\3\uffff\2\6\1\uffff\1\6"+
			"\2\uffff\4\6\1\uffff\1\6\1\uffff\2\6\1\uffff\2\6\3\uffff\3\6\1\uffff"+
			"\2\6\2\uffff\3\6\1\uffff\3\6\1\uffff\3\6\1\uffff\1\2\2\6\3\uffff\1\6"+
			"\1\uffff\1\6\4\uffff\2\6\2\uffff\5\6\4\uffff\2\6\1\uffff\2\6\3\uffff"+
			"\14\6\1\uffff\2\6\1\uffff\1\4\3\6\1\uffff\1\6\2\uffff\2\6\1\uffff\4\6"+
			"\3\uffff\1\3\10\uffff\2\6",
			"\1\7\6\uffff\1\6",
			"\1\10\6\uffff\1\6",
			"\1\11\6\uffff\1\6",
			"\1\12\6\uffff\1\6",
			"\1\13\6\uffff\1\6",
			"",
			"\1\6\4\uffff\1\6\5\uffff\1\6\3\uffff\1\6\1\uffff\2\6\2\uffff\1\6\1\uffff"+
			"\3\6\4\uffff\1\6\1\uffff\1\6\3\uffff\3\6\1\uffff\4\6\1\uffff\4\6\1\uffff"+
			"\5\6\3\uffff\2\6\1\uffff\1\6\2\uffff\4\6\1\uffff\1\6\1\uffff\2\6\1\uffff"+
			"\2\6\3\uffff\3\6\1\uffff\2\6\2\uffff\3\6\1\uffff\3\6\1\uffff\3\6\1\uffff"+
			"\3\6\1\uffff\3\6\1\uffff\1\6\1\uffff\1\6\2\uffff\2\6\2\uffff\7\6\2\uffff"+
			"\2\6\1\uffff\2\6\3\uffff\14\6\1\uffff\2\6\1\uffff\4\6\1\uffff\1\6\2\uffff"+
			"\2\6\1\uffff\4\6\3\uffff\1\6\10\uffff\2\6\3\uffff\1\6\2\uffff\1\6\10"+
			"\uffff\2\6\3\uffff\1\6\3\uffff\1\6\6\uffff\1\6\1\14\2\uffff\1\6",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "416:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_MAXWRITETIME '(' c= sident m= selectorModifier[c] ')' | K_WRITETIME '(' c= sident m= selectorModifier[c] ')' | K_TTL '(' c= sident m= selectorModifier[c] ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );";
		}
	}

	static final String DFA61_eotS =
		"\36\uffff";
	static final String DFA61_eofS =
		"\36\uffff";
	static final String DFA61_minS =
		"\1\16\32\112\3\uffff";
	static final String DFA61_maxS =
		"\1\u00b7\32\u00d7\3\uffff";
	static final String DFA61_acceptS =
		"\33\uffff\1\1\1\2\1\3";
	static final String DFA61_specialS =
		"\36\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\1\10\uffff\1\2\3\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff"+
			"\1\6\1\7\1\10\1\uffff\1\4\1\32\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4"+
			"\1\30\1\12\1\4\3\uffff\1\32\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\2\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff"+
			"\2\32\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\1\32\2\4\3\uffff\1\4\1\uffff"+
			"\1\4\4\uffff\2\4\2\uffff\5\4\4\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\20"+
			"\5\4\1\21\1\31\1\22\1\27\1\23\2\uffff\1\4\1\uffff\1\32\3\4\1\uffff\1"+
			"\4\2\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\32\11\uffff\1\3",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\u0080\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "598:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );";
		}
	}

	static final String DFA157_eotS =
		"\12\uffff";
	static final String DFA157_eofS =
		"\1\uffff\1\2\1\uffff\4\2\3\uffff";
	static final String DFA157_minS =
		"\1\27\1\112\1\uffff\2\27\2\112\3\uffff";
	static final String DFA157_maxS =
		"\1\u00b7\1\u00d1\1\uffff\4\u00d1\3\uffff";
	static final String DFA157_acceptS =
		"\2\uffff\1\1\4\uffff\1\2\1\3\1\4";
	static final String DFA157_specialS =
		"\12\uffff}>";
	static final String[] DFA157_transitionS = {
			"\1\2\3\uffff\1\2\1\uffff\2\2\1\1\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
			"\1\uffff\11\2\1\uffff\5\2\3\uffff\2\2\1\uffff\1\2\2\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\1\4\1\2\1\uffff\2\2\3\uffff\3\2\1\uffff\2\2\2\uffff\7\2"+
			"\1\uffff\3\2\1\uffff\1\2\1\5\1\6\3\uffff\1\2\1\uffff\1\2\4\uffff\2\2"+
			"\2\uffff\5\2\4\uffff\2\2\1\uffff\1\3\1\2\3\uffff\14\2\2\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2",
			"\1\2\3\uffff\1\10\22\uffff\1\2\11\uffff\1\11\4\uffff\1\2\3\uffff\1\2"+
			"\22\uffff\1\7\11\uffff\1\2\5\uffff\1\2\66\uffff\1\2\2\uffff\1\2",
			"",
			"\1\7\3\uffff\1\7\1\uffff\3\7\4\uffff\1\7\1\uffff\1\7\3\uffff\3\7\1\uffff"+
			"\4\7\1\uffff\4\7\1\uffff\5\7\3\uffff\2\7\1\uffff\1\7\2\uffff\4\7\1\2"+
			"\1\7\1\uffff\2\7\1\uffff\2\7\3\uffff\3\7\1\uffff\2\7\2\uffff\3\7\1\uffff"+
			"\3\7\1\uffff\3\7\1\uffff\3\7\3\uffff\1\7\1\2\1\7\2\uffff\1\2\1\uffff"+
			"\2\7\2\uffff\5\7\4\uffff\2\7\1\uffff\2\7\3\uffff\14\7\1\2\1\uffff\1\7"+
			"\1\uffff\4\7\1\uffff\1\7\2\uffff\2\7\1\uffff\4\7\3\uffff\1\7\10\uffff"+
			"\2\7\3\uffff\1\7\22\uffff\1\2\2\uffff\1\2",
			"\1\10\3\uffff\1\10\1\uffff\3\10\4\uffff\1\10\1\uffff\1\10\3\uffff\3"+
			"\10\1\uffff\4\10\1\uffff\4\10\1\uffff\5\10\3\uffff\2\10\1\uffff\1\10"+
			"\2\uffff\4\10\1\2\1\10\1\uffff\2\10\1\uffff\2\10\3\uffff\3\10\1\uffff"+
			"\2\10\2\uffff\3\10\1\uffff\3\10\1\uffff\3\10\1\uffff\3\10\3\uffff\1\10"+
			"\1\2\1\10\2\uffff\1\2\1\uffff\2\10\2\uffff\5\10\4\uffff\2\10\1\uffff"+
			"\2\10\3\uffff\14\10\1\2\2\10\1\uffff\4\10\1\uffff\1\10\2\uffff\2\10\1"+
			"\uffff\4\10\3\uffff\1\10\10\uffff\2\10\26\uffff\1\2\2\uffff\1\2",
			"\1\2\45\uffff\1\2\3\uffff\1\2\42\uffff\1\2\43\uffff\1\11\22\uffff\1"+
			"\2\2\uffff\1\2",
			"\1\2\45\uffff\1\2\3\uffff\1\2\42\uffff\1\2\43\uffff\1\11\22\uffff\1"+
			"\2\2\uffff\1\2",
			"",
			"",
			""
	};

	static final short[] DFA157_eot = DFA.unpackEncodedString(DFA157_eotS);
	static final short[] DFA157_eof = DFA.unpackEncodedString(DFA157_eofS);
	static final char[] DFA157_min = DFA.unpackEncodedStringToUnsignedChars(DFA157_minS);
	static final char[] DFA157_max = DFA.unpackEncodedStringToUnsignedChars(DFA157_maxS);
	static final short[] DFA157_accept = DFA.unpackEncodedString(DFA157_acceptS);
	static final short[] DFA157_special = DFA.unpackEncodedString(DFA157_specialS);
	static final short[][] DFA157_transition;

	static {
		int numStates = DFA157_transitionS.length;
		DFA157_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA157_transition[i] = DFA.unpackEncodedString(DFA157_transitionS[i]);
		}
	}

	protected class DFA157 extends DFA {

		public DFA157(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 157;
			this.eot = DFA157_eot;
			this.eof = DFA157_eof;
			this.min = DFA157_min;
			this.max = DFA157_max;
			this.accept = DFA157_accept;
			this.special = DFA157_special;
			this.transition = DFA157_transition;
		}
		@Override
		public String getDescription() {
			return "1124:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );";
		}
	}

	static final String DFA181_eotS =
		"\12\uffff";
	static final String DFA181_eofS =
		"\12\uffff";
	static final String DFA181_minS =
		"\1\33\5\uffff\1\u0097\1\37\2\uffff";
	static final String DFA181_maxS =
		"\1\u0090\5\uffff\1\u0097\1\71\2\uffff";
	static final String DFA181_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7";
	static final String DFA181_specialS =
		"\12\uffff}>";
	static final String[] DFA181_transitionS = {
			"\1\6\65\uffff\1\2\24\uffff\1\5\20\uffff\1\3\3\uffff\1\1\24\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"\1\7",
			"\1\10\31\uffff\1\11",
			"",
			""
	};

	static final short[] DFA181_eot = DFA.unpackEncodedString(DFA181_eotS);
	static final short[] DFA181_eof = DFA.unpackEncodedString(DFA181_eofS);
	static final char[] DFA181_min = DFA.unpackEncodedStringToUnsignedChars(DFA181_minS);
	static final char[] DFA181_max = DFA.unpackEncodedStringToUnsignedChars(DFA181_maxS);
	static final short[] DFA181_accept = DFA.unpackEncodedString(DFA181_acceptS);
	static final short[] DFA181_special = DFA.unpackEncodedString(DFA181_specialS);
	static final short[][] DFA181_transition;

	static {
		int numStates = DFA181_transitionS.length;
		DFA181_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA181_transition[i] = DFA.unpackEncodedString(DFA181_transitionS[i]);
		}
	}

	protected class DFA181 extends DFA {

		public DFA181(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 181;
			this.eot = DFA181_eot;
			this.eof = DFA181_eof;
			this.min = DFA181_min;
			this.max = DFA181_max;
			this.accept = DFA181_accept;
			this.special = DFA181_special;
			this.transition = DFA181_transition;
		}
		@Override
		public String getDescription() {
			return "1322:1: roleOption[RoleOptions opts, DCPermissions.Builder dcperms] : ( K_PASSWORD '=' v= STRING_LITERAL | K_HASHED K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN | K_ACCESS K_TO K_ALL K_DATACENTERS | K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}' );";
		}
	}

	static final String DFA189_eotS =
		"\32\uffff";
	static final String DFA189_eofS =
		"\4\uffff\1\20\6\uffff\1\20\1\uffff\1\20\1\uffff\1\20\12\uffff";
	static final String DFA189_minS =
		"\1\27\1\0\1\uffff\1\0\1\140\1\uffff\1\0\3\uffff\1\0\1\27\1\0\1\27\1\0"+
		"\1\27\12\uffff";
	static final String DFA189_maxS =
		"\1\u00b7\1\0\1\uffff\1\0\1\u00d1\1\uffff\1\0\3\uffff\1\0\1\u00d1\1\0\1"+
		"\u00d1\1\0\1\u00d1\12\uffff";
	static final String DFA189_acceptS =
		"\2\uffff\1\2\2\uffff\1\4\1\uffff\1\6\1\7\1\10\6\uffff\1\17\1\1\1\3\1\5"+
		"\1\11\1\12\1\13\1\14\1\15\1\16";
	static final String DFA189_specialS =
		"\1\uffff\1\3\1\uffff\1\4\2\uffff\1\5\3\uffff\1\0\1\uffff\1\1\1\uffff\1"+
		"\2\13\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\20\3\uffff\1\20\1\uffff\1\17\1\16\1\20\4\uffff\1\20\1\uffff\1\20\3"+
			"\uffff\3\20\1\uffff\2\20\1\1\1\20\1\7\4\20\1\uffff\5\20\3\uffff\2\20"+
			"\1\uffff\1\20\2\uffff\4\20\1\uffff\1\20\1\2\1\15\1\14\1\uffff\2\20\2"+
			"\uffff\1\10\3\20\1\uffff\2\20\2\uffff\3\20\1\5\1\3\2\20\1\uffff\3\20"+
			"\1\11\3\20\3\uffff\1\20\1\uffff\1\20\4\uffff\1\4\1\20\2\uffff\5\20\4"+
			"\uffff\2\20\1\uffff\2\20\1\2\2\uffff\6\20\1\6\5\20\2\uffff\1\20\1\uffff"+
			"\2\20\1\13\1\12\1\uffff\1\20\2\uffff\2\20\1\uffff\4\20\3\uffff\1\20\11"+
			"\uffff\1\20",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\5\113\uffff\1\20\41\uffff\1\20\2\uffff\1\20",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"\1\25\3\uffff\1\25\1\uffff\3\25\4\uffff\1\25\1\uffff\1\25\3\uffff\3"+
			"\25\1\uffff\4\25\1\uffff\4\25\1\uffff\5\25\3\uffff\2\25\1\uffff\1\25"+
			"\2\uffff\4\25\1\uffff\1\25\1\uffff\2\25\1\uffff\2\25\3\uffff\3\25\1\uffff"+
			"\2\25\2\uffff\3\25\1\uffff\3\25\1\uffff\3\25\1\uffff\3\25\3\uffff\1\25"+
			"\1\uffff\1\25\4\uffff\2\25\2\uffff\5\25\4\uffff\2\25\1\uffff\2\25\3\uffff"+
			"\14\25\2\uffff\1\25\1\uffff\4\25\1\uffff\1\25\2\uffff\2\25\1\uffff\4"+
			"\25\2\uffff\1\20\1\25\11\uffff\1\25\26\uffff\1\20\2\uffff\1\20",
			"\1\uffff",
			"\1\27\3\uffff\1\27\1\uffff\3\27\4\uffff\1\27\1\uffff\1\27\3\uffff\3"+
			"\27\1\uffff\4\27\1\uffff\4\27\1\uffff\5\27\3\uffff\2\27\1\uffff\1\27"+
			"\2\uffff\4\27\1\uffff\1\27\1\uffff\2\27\1\uffff\2\27\3\uffff\3\27\1\uffff"+
			"\2\27\2\uffff\3\27\1\uffff\3\27\1\uffff\3\27\1\uffff\3\27\3\uffff\1\27"+
			"\1\uffff\1\27\4\uffff\2\27\2\uffff\5\27\4\uffff\2\27\1\uffff\2\27\3\uffff"+
			"\14\27\1\uffff\2\27\1\uffff\4\27\1\uffff\1\27\2\uffff\2\27\1\uffff\4"+
			"\27\2\uffff\1\20\1\27\10\uffff\2\27\26\uffff\1\20\2\uffff\1\20",
			"\1\uffff",
			"\1\31\3\uffff\1\31\1\uffff\3\31\4\uffff\1\31\1\uffff\1\31\3\uffff\3"+
			"\31\1\uffff\4\31\1\uffff\4\31\1\uffff\5\31\3\uffff\2\31\1\uffff\1\31"+
			"\2\uffff\4\31\1\uffff\1\31\1\uffff\2\31\1\uffff\2\31\3\uffff\3\31\1\uffff"+
			"\2\31\2\uffff\3\31\1\uffff\3\31\1\uffff\3\31\1\uffff\3\31\3\uffff\1\31"+
			"\1\uffff\1\31\4\uffff\2\31\2\uffff\5\31\4\uffff\2\31\1\uffff\2\31\3\uffff"+
			"\14\31\1\uffff\2\31\1\uffff\4\31\1\uffff\1\31\2\uffff\2\31\1\uffff\4"+
			"\31\2\uffff\1\20\1\31\10\uffff\2\31\26\uffff\1\20\2\uffff\1\20",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1357:5: ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA189_10 = input.LA(1);
						 
						int index189_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred8_Parser()) ) {s = 20;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_10);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA189_12 = input.LA(1);
						 
						int index189_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Parser()) ) {s = 22;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_12);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA189_14 = input.LA(1);
						 
						int index189_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_Parser()) ) {s = 24;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_14);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA189_1 = input.LA(1);
						 
						int index189_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred5_Parser()) ) {s = 17;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_1);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA189_3 = input.LA(1);
						 
						int index189_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred6_Parser()) ) {s = 18;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_3);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA189_6 = input.LA(1);
						 
						int index189_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_Parser()) ) {s = 19;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index189_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 189, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA187_eotS =
		"\34\uffff";
	static final String DFA187_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA187_minS =
		"\1\27\31\u00ac\2\uffff";
	static final String DFA187_maxS =
		"\1\u00b7\31\u00d1\2\uffff";
	static final String DFA187_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA187_specialS =
		"\34\uffff}>";
	static final String[] DFA187_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\31\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2"+
			"\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff\1\2",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"",
			""
	};

	static final short[] DFA187_eot = DFA.unpackEncodedString(DFA187_eotS);
	static final short[] DFA187_eof = DFA.unpackEncodedString(DFA187_eofS);
	static final char[] DFA187_min = DFA.unpackEncodedStringToUnsignedChars(DFA187_minS);
	static final char[] DFA187_max = DFA.unpackEncodedStringToUnsignedChars(DFA187_maxS);
	static final short[] DFA187_accept = DFA.unpackEncodedString(DFA187_acceptS);
	static final short[] DFA187_special = DFA.unpackEncodedString(DFA187_specialS);
	static final short[][] DFA187_transition;

	static {
		int numStates = DFA187_transitionS.length;
		DFA187_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA187_transition[i] = DFA.unpackEncodedString(DFA187_transitionS[i]);
		}
	}

	protected class DFA187 extends DFA {

		public DFA187(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 187;
			this.eot = DFA187_eot;
			this.eof = DFA187_eof;
			this.min = DFA187_min;
			this.max = DFA187_max;
			this.accept = DFA187_accept;
			this.special = DFA187_special;
			this.transition = DFA187_transition;
		}
		@Override
		public String getDescription() {
			return "1372:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )?";
		}
	}

	static final String DFA195_eotS =
		"\35\uffff";
	static final String DFA195_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA195_minS =
		"\1\27\32\u00ce\2\uffff";
	static final String DFA195_maxS =
		"\1\u00b7\32\u00d1\2\uffff";
	static final String DFA195_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA195_specialS =
		"\35\uffff}>";
	static final String[] DFA195_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\31\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2"+
			"\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff\1\32\1\2",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA195_eot = DFA.unpackEncodedString(DFA195_eotS);
	static final short[] DFA195_eof = DFA.unpackEncodedString(DFA195_eofS);
	static final char[] DFA195_min = DFA.unpackEncodedStringToUnsignedChars(DFA195_minS);
	static final char[] DFA195_max = DFA.unpackEncodedStringToUnsignedChars(DFA195_maxS);
	static final short[] DFA195_accept = DFA.unpackEncodedString(DFA195_acceptS);
	static final short[] DFA195_special = DFA.unpackEncodedString(DFA195_specialS);
	static final short[][] DFA195_transition;

	static {
		int numStates = DFA195_transitionS.length;
		DFA195_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA195_transition[i] = DFA.unpackEncodedString(DFA195_transitionS[i]);
		}
	}

	protected class DFA195 extends DFA {

		public DFA195(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 195;
			this.eot = DFA195_eot;
			this.eof = DFA195_eof;
			this.min = DFA195_min;
			this.max = DFA195_max;
			this.accept = DFA195_accept;
			this.special = DFA195_special;
			this.transition = DFA195_transition;
		}
		@Override
		public String getDescription() {
			return "1419:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA196_eotS =
		"\35\uffff";
	static final String DFA196_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA196_minS =
		"\1\27\32\34\2\uffff";
	static final String DFA196_maxS =
		"\1\u00b7\32\u00d1\2\uffff";
	static final String DFA196_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA196_specialS =
		"\35\uffff}>";
	static final String[] DFA196_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\31\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2"+
			"\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff\1\32\1\2",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\14\uffff\1\34\6\uffff\1\34\13\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA196_eot = DFA.unpackEncodedString(DFA196_eotS);
	static final short[] DFA196_eof = DFA.unpackEncodedString(DFA196_eofS);
	static final char[] DFA196_min = DFA.unpackEncodedStringToUnsignedChars(DFA196_minS);
	static final char[] DFA196_max = DFA.unpackEncodedStringToUnsignedChars(DFA196_maxS);
	static final short[] DFA196_accept = DFA.unpackEncodedString(DFA196_acceptS);
	static final short[] DFA196_special = DFA.unpackEncodedString(DFA196_specialS);
	static final short[][] DFA196_transition;

	static {
		int numStates = DFA196_transitionS.length;
		DFA196_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA196_transition[i] = DFA.unpackEncodedString(DFA196_transitionS[i]);
		}
	}

	protected class DFA196 extends DFA {

		public DFA196(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 196;
			this.eot = DFA196_eot;
			this.eof = DFA196_eof;
			this.min = DFA196_min;
			this.max = DFA196_max;
			this.accept = DFA196_accept;
			this.special = DFA196_special;
			this.transition = DFA196_transition;
		}
		@Override
		public String getDescription() {
			return "1424:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA214_eotS =
		"\44\uffff";
	static final String DFA214_eofS =
		"\44\uffff";
	static final String DFA214_minS =
		"\1\6\2\uffff\1\6\4\uffff\32\u00c7\1\u00ce\1\uffff";
	static final String DFA214_maxS =
		"\1\u00db\2\uffff\1\u00dc\4\uffff\33\u00d0\1\uffff";
	static final String DFA214_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\33\uffff\1\3";
	static final String DFA214_specialS =
		"\44\uffff}>";
	static final String[] DFA214_transitionS = {
			"\1\1\4\uffff\1\1\5\uffff\1\1\3\uffff\1\1\2\uffff\1\1\124\uffff\2\1\4"+
			"\uffff\1\5\13\uffff\2\1\65\uffff\1\7\4\uffff\1\1\2\uffff\1\1\10\uffff"+
			"\1\4\10\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\2\uffff\1"+
			"\12\1\uffff\3\12\4\uffff\1\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff"+
			"\1\12\1\41\2\12\1\uffff\2\12\1\40\1\17\1\uffff\2\12\1\36\1\20\1\12\3"+
			"\uffff\1\42\1\21\1\uffff\1\22\2\uffff\3\12\1\23\1\uffff\1\12\1\uffff"+
			"\2\12\1\uffff\2\12\3\uffff\1\24\2\12\1\uffff\1\25\1\12\2\uffff\2\42\1"+
			"\12\1\uffff\3\12\1\uffff\3\12\1\uffff\1\42\2\12\1\uffff\2\2\1\12\1\uffff"+
			"\1\12\1\uffff\1\2\2\uffff\2\12\2\uffff\5\12\2\2\2\uffff\2\12\1\uffff"+
			"\2\12\3\uffff\1\12\1\26\5\12\1\27\1\37\1\30\1\35\1\31\1\uffff\1\2\1\12"+
			"\1\uffff\1\42\3\12\1\uffff\1\12\2\uffff\2\12\1\uffff\1\32\1\12\1\33\1"+
			"\34\3\uffff\1\42\10\uffff\1\2\1\11\3\uffff\1\2\2\uffff\1\2\10\uffff\1"+
			"\2\4\uffff\1\2\3\uffff\1\2\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\6\uffff\1\2\1\uffff\1\43",
			"\1\2\1\uffff\1\43",
			""
	};

	static final short[] DFA214_eot = DFA.unpackEncodedString(DFA214_eotS);
	static final short[] DFA214_eof = DFA.unpackEncodedString(DFA214_eofS);
	static final char[] DFA214_min = DFA.unpackEncodedStringToUnsignedChars(DFA214_minS);
	static final char[] DFA214_max = DFA.unpackEncodedStringToUnsignedChars(DFA214_maxS);
	static final short[] DFA214_accept = DFA.unpackEncodedString(DFA214_acceptS);
	static final short[] DFA214_special = DFA.unpackEncodedString(DFA214_specialS);
	static final short[][] DFA214_transition;

	static {
		int numStates = DFA214_transitionS.length;
		DFA214_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA214_transition[i] = DFA.unpackEncodedString(DFA214_transitionS[i]);
		}
	}

	protected class DFA214 extends DFA {

		public DFA214(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 214;
			this.eot = DFA214_eot;
			this.eof = DFA214_eof;
			this.min = DFA214_min;
			this.max = DFA214_max;
			this.accept = DFA214_accept;
			this.special = DFA214_special;
			this.transition = DFA214_transition;
		}
		@Override
		public String getDescription() {
			return "1529:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA216_eotS =
		"\34\uffff";
	static final String DFA216_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA216_minS =
		"\1\27\31\u00ac\2\uffff";
	static final String DFA216_maxS =
		"\1\u00b7\31\u00d1\2\uffff";
	static final String DFA216_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA216_specialS =
		"\34\uffff}>";
	static final String[] DFA216_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\32\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\32\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\32\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\32\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\1\uffff\1\33\1\3\1\uffff\1\32\3\3\1\uffff\1\3\2\uffff"+
			"\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\32\10\uffff\1\32\1\2",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"",
			""
	};

	static final short[] DFA216_eot = DFA.unpackEncodedString(DFA216_eotS);
	static final short[] DFA216_eof = DFA.unpackEncodedString(DFA216_eofS);
	static final char[] DFA216_min = DFA.unpackEncodedStringToUnsignedChars(DFA216_minS);
	static final char[] DFA216_max = DFA.unpackEncodedStringToUnsignedChars(DFA216_maxS);
	static final short[] DFA216_accept = DFA.unpackEncodedString(DFA216_acceptS);
	static final short[] DFA216_special = DFA.unpackEncodedString(DFA216_specialS);
	static final short[][] DFA216_transition;

	static {
		int numStates = DFA216_transitionS.length;
		DFA216_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA216_transition[i] = DFA.unpackEncodedString(DFA216_transitionS[i]);
		}
	}

	protected class DFA216 extends DFA {

		public DFA216(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 216;
			this.eot = DFA216_eot;
			this.eof = DFA216_eof;
			this.min = DFA216_min;
			this.max = DFA216_max;
			this.accept = DFA216_accept;
			this.special = DFA216_special;
			this.transition = DFA216_transition;
		}
		@Override
		public String getDescription() {
			return "1548:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA218_eotS =
		"\72\uffff";
	static final String DFA218_eofS =
		"\72\uffff";
	static final String DFA218_minS =
		"\1\27\31\u00c7\1\u00ce\1\u00c7\1\u00ce\1\27\1\6\31\u00c7\2\uffff";
	static final String DFA218_maxS =
		"\1\u00b7\32\u00ce\1\u00c7\1\u00ce\1\u00b7\1\u00db\31\u00c7\2\uffff";
	static final String DFA218_acceptS =
		"\70\uffff\1\1\1\2";
	static final String DFA218_specialS =
		"\72\uffff}>";
	static final String[] DFA218_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\34\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\34\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\34\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\34\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\1\uffff\1\33\1\3\1\uffff\1\34\3\3\1\uffff\1\3\2\uffff"+
			"\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\34\10\uffff\1\32\1\2",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\35",
			"\1\36",
			"\1\35",
			"\1\37\3\uffff\1\41\1\uffff\3\41\4\uffff\1\41\1\uffff\1\42\3\uffff\1"+
			"\43\1\44\1\45\1\uffff\1\41\1\uffff\2\41\1\uffff\2\41\1\67\1\46\1\uffff"+
			"\2\41\1\65\1\47\1\41\4\uffff\1\50\1\uffff\1\51\2\uffff\3\41\1\52\1\uffff"+
			"\1\41\1\uffff\2\41\1\uffff\2\41\3\uffff\1\53\2\41\1\uffff\1\54\1\41\4"+
			"\uffff\1\41\1\uffff\3\41\1\uffff\3\41\2\uffff\2\41\3\uffff\1\41\1\uffff"+
			"\1\41\4\uffff\2\41\2\uffff\5\41\4\uffff\2\41\1\uffff\2\41\3\uffff\1\41"+
			"\1\55\5\41\1\56\1\66\1\57\1\64\1\60\1\uffff\1\33\1\41\2\uffff\3\41\1"+
			"\uffff\1\41\2\uffff\2\41\1\uffff\1\61\1\41\1\62\1\63\15\uffff\1\40",
			"\1\71\4\uffff\1\71\5\uffff\1\71\3\uffff\1\71\1\uffff\2\71\2\uffff\1"+
			"\71\1\uffff\3\71\4\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\uffff\4\71"+
			"\1\uffff\4\71\1\uffff\5\71\3\uffff\2\71\1\uffff\1\71\2\uffff\4\71\1\uffff"+
			"\1\71\1\uffff\2\71\1\uffff\2\71\3\uffff\3\71\1\uffff\2\71\2\uffff\3\71"+
			"\1\uffff\3\71\1\uffff\3\71\1\uffff\3\71\1\uffff\3\71\1\uffff\1\71\1\uffff"+
			"\1\71\2\uffff\2\71\2\uffff\7\71\2\uffff\2\71\1\uffff\2\71\3\uffff\14"+
			"\71\1\uffff\2\71\1\uffff\4\71\1\uffff\1\71\2\uffff\2\71\1\uffff\4\71"+
			"\3\uffff\1\71\10\uffff\2\71\3\uffff\1\71\2\uffff\1\71\10\uffff\1\71\1"+
			"\70\3\uffff\1\71\3\uffff\1\71\6\uffff\1\71\3\uffff\1\71",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"",
			""
	};

	static final short[] DFA218_eot = DFA.unpackEncodedString(DFA218_eotS);
	static final short[] DFA218_eof = DFA.unpackEncodedString(DFA218_eofS);
	static final char[] DFA218_min = DFA.unpackEncodedStringToUnsignedChars(DFA218_minS);
	static final char[] DFA218_max = DFA.unpackEncodedStringToUnsignedChars(DFA218_maxS);
	static final short[] DFA218_accept = DFA.unpackEncodedString(DFA218_acceptS);
	static final short[] DFA218_special = DFA.unpackEncodedString(DFA218_specialS);
	static final short[][] DFA218_transition;

	static {
		int numStates = DFA218_transitionS.length;
		DFA218_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA218_transition[i] = DFA.unpackEncodedString(DFA218_transitionS[i]);
		}
	}

	protected class DFA218 extends DFA {

		public DFA218(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 218;
			this.eot = DFA218_eot;
			this.eof = DFA218_eof;
			this.min = DFA218_min;
			this.max = DFA218_max;
			this.accept = DFA218_accept;
			this.special = DFA218_special;
			this.transition = DFA218_transition;
		}
		@Override
		public String getDescription() {
			return "1559:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA220_eotS =
		"\40\uffff";
	static final String DFA220_eofS =
		"\1\1\37\uffff";
	static final String DFA220_minS =
		"\1\40\1\uffff\1\6\1\uffff\31\u00ab\1\uffff\2\u00ab";
	static final String DFA220_maxS =
		"\1\u00dc\1\uffff\1\u00db\1\uffff\31\u00ce\1\uffff\2\u00ce";
	static final String DFA220_acceptS =
		"\1\uffff\1\3\1\uffff\1\2\31\uffff\1\1\2\uffff";
	static final String DFA220_specialS =
		"\40\uffff}>";
	static final String[] DFA220_transitionS = {
			"\1\1\1\uffff\2\1\31\uffff\1\1\22\uffff\1\1\1\uffff\1\1\5\uffff\1\1\13"+
			"\uffff\1\1\24\uffff\1\1\2\uffff\1\1\4\uffff\1\1\37\uffff\1\1\11\uffff"+
			"\1\1\15\uffff\1\1\16\uffff\1\1\1\2\1\uffff\1\1\1\3\3\uffff\2\1\7\uffff"+
			"\1\1\2\uffff\1\1",
			"",
			"\1\35\4\uffff\1\35\2\uffff\1\1\2\uffff\1\35\3\uffff\1\35\1\uffff\1\4"+
			"\1\35\2\uffff\1\6\1\uffff\3\6\4\uffff\1\6\1\uffff\1\7\3\uffff\1\10\1"+
			"\11\1\12\1\uffff\1\6\1\36\2\6\1\uffff\2\6\1\34\1\13\1\uffff\2\6\1\32"+
			"\1\14\1\6\3\uffff\1\37\1\15\1\uffff\1\16\2\uffff\3\6\1\17\1\uffff\1\6"+
			"\1\uffff\2\6\1\uffff\2\6\3\uffff\1\20\2\6\1\uffff\1\21\1\6\2\uffff\2"+
			"\37\1\6\1\uffff\3\6\1\uffff\3\6\1\uffff\1\37\2\6\1\uffff\2\35\1\6\1\uffff"+
			"\1\6\1\uffff\1\35\2\uffff\2\6\2\uffff\5\6\2\35\2\uffff\2\6\1\uffff\2"+
			"\6\3\uffff\1\6\1\22\5\6\1\23\1\33\1\24\1\31\1\25\1\uffff\1\35\1\6\1\uffff"+
			"\1\37\3\6\1\uffff\1\6\2\uffff\2\6\1\uffff\1\26\1\6\1\27\1\30\3\uffff"+
			"\1\37\10\uffff\1\35\1\5\3\uffff\1\35\2\uffff\1\35\10\uffff\1\35\4\uffff"+
			"\1\35\3\uffff\1\35\6\uffff\1\35\3\uffff\1\35",
			"",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\37\uffff\1\1\2\uffff\1\35"
	};

	static final short[] DFA220_eot = DFA.unpackEncodedString(DFA220_eotS);
	static final short[] DFA220_eof = DFA.unpackEncodedString(DFA220_eofS);
	static final char[] DFA220_min = DFA.unpackEncodedStringToUnsignedChars(DFA220_minS);
	static final char[] DFA220_max = DFA.unpackEncodedStringToUnsignedChars(DFA220_maxS);
	static final short[] DFA220_accept = DFA.unpackEncodedString(DFA220_acceptS);
	static final short[] DFA220_special = DFA.unpackEncodedString(DFA220_specialS);
	static final short[][] DFA220_transition;

	static {
		int numStates = DFA220_transitionS.length;
		DFA220_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA220_transition[i] = DFA.unpackEncodedString(DFA220_transitionS[i]);
		}
	}

	protected class DFA220 extends DFA {

		public DFA220(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 220;
			this.eot = DFA220_eot;
			this.eof = DFA220_eof;
			this.min = DFA220_min;
			this.max = DFA220_max;
			this.accept = DFA220_accept;
			this.special = DFA220_special;
			this.transition = DFA220_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 1575:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*";
		}
	}

	static final String DFA223_eotS =
		"\115\uffff";
	static final String DFA223_eofS =
		"\3\uffff\1\1\45\uffff\1\1\10\uffff\33\44";
	static final String DFA223_minS =
		"\1\6\1\uffff\1\6\1\40\1\uffff\1\u00c7\1\u00c6\32\u00c7\1\u00c8\2\u00c7"+
		"\1\uffff\1\u00c7\1\u00ce\1\u00c7\1\uffff\1\6\1\27\1\6\1\55\1\172\1\46"+
		"\3\u00c7\33\40";
	static final String DFA223_maxS =
		"\1\u00db\1\uffff\1\u00db\1\u00dc\1\uffff\1\u00ce\1\u00d8\2\u00ce\1\u00d2"+
		"\30\u00ce\2\u00d2\1\uffff\1\u00d2\2\u00ce\1\uffff\1\u00dc\1\u00b7\1\u00db"+
		"\3\u00ce\3\u00c8\33\u00dc";
	static final String DFA223_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\37\uffff\1\3\3\uffff\1\4\44\uffff";
	static final String DFA223_specialS =
		"\115\uffff}>";
	static final String[] DFA223_transitionS = {
			"\1\1\4\uffff\1\1\5\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\2\uffff\1\4"+
			"\1\uffff\3\4\4\uffff\1\4\1\uffff\1\4\3\uffff\3\4\1\uffff\1\4\1\5\2\4"+
			"\1\uffff\4\4\1\uffff\5\4\3\uffff\2\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\2\4\3\uffff\3\4\1\uffff\2\4\2\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\3\4\1\uffff\3\4\1\uffff\2\1\1\4\1\uffff\1\4\1\uffff\1\1"+
			"\2\uffff\2\4\2\uffff\5\4\2\1\2\uffff\2\4\1\uffff\2\4\3\uffff\14\4\1\uffff"+
			"\2\4\1\uffff\4\4\1\uffff\1\4\2\uffff\2\4\1\uffff\4\4\3\uffff\1\4\10\uffff"+
			"\1\3\1\4\3\uffff\1\1\2\uffff\1\1\10\uffff\1\2\10\uffff\1\1\6\uffff\1"+
			"\1\3\uffff\1\1",
			"",
			"\1\1\4\uffff\1\1\5\uffff\1\1\3\uffff\1\1\1\uffff\1\7\1\1\2\uffff\1\47"+
			"\1\uffff\3\47\4\uffff\1\47\1\uffff\1\12\3\uffff\1\13\1\14\1\15\1\uffff"+
			"\1\47\1\40\2\47\1\uffff\2\47\1\37\1\16\1\uffff\2\47\1\35\1\17\1\47\3"+
			"\uffff\1\46\1\20\1\uffff\1\21\2\uffff\3\47\1\22\1\uffff\1\45\1\uffff"+
			"\2\47\1\uffff\2\47\3\uffff\1\23\2\47\1\uffff\1\24\1\47\2\uffff\1\46\1"+
			"\41\1\47\1\uffff\3\47\1\uffff\1\42\1\47\1\11\1\uffff\1\46\2\47\1\uffff"+
			"\2\1\1\47\1\uffff\1\47\1\uffff\1\1\2\uffff\2\47\2\uffff\5\47\2\1\2\uffff"+
			"\2\47\1\uffff\2\47\2\uffff\1\44\1\47\1\25\5\47\1\26\1\36\1\27\1\34\1"+
			"\30\1\uffff\1\1\1\47\1\uffff\1\46\1\43\2\47\1\uffff\1\47\2\uffff\2\47"+
			"\1\uffff\1\31\1\47\1\32\1\33\3\uffff\1\46\10\uffff\1\1\1\10\3\uffff\1"+
			"\6\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1\6\uffff\1\1\3\uffff"+
			"\1\1",
			"\1\1\1\uffff\3\1\30\uffff\1\1\22\uffff\1\1\1\uffff\1\1\5\uffff\1\1\13"+
			"\uffff\1\1\24\uffff\1\1\2\uffff\1\1\4\uffff\1\1\37\uffff\1\1\11\uffff"+
			"\1\1\15\uffff\1\1\14\uffff\1\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\4\3"+
			"\1\6\uffff\2\1\2\uffff\1\1",
			"",
			"\1\50\6\uffff\1\4",
			"\1\1\1\uffff\1\51\1\1\1\uffff\2\1\2\uffff\1\1\10\uffff\1\1",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52\3\uffff\1\44",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"\1\1\6\uffff\1\52",
			"\1\1\6\uffff\1\52",
			"\1\44\5\uffff\1\52",
			"\1\1\1\44\5\uffff\1\52\3\uffff\1\44",
			"\1\1\1\44\5\uffff\1\52\3\uffff\1\44",
			"",
			"\1\1\1\44\5\uffff\1\52\3\uffff\1\44",
			"\1\52",
			"\1\1\1\44\5\uffff\1\52",
			"",
			"\1\44\4\uffff\1\44\5\uffff\1\44\3\uffff\1\44\1\uffff\2\44\2\uffff\1"+
			"\44\1\uffff\3\44\1\1\1\uffff\2\1\1\56\1\uffff\1\44\3\uffff\3\44\1\uffff"+
			"\4\44\1\uffff\4\44\1\uffff\5\44\1\1\2\uffff\2\44\1\uffff\1\44\2\uffff"+
			"\4\44\1\uffff\1\44\1\uffff\2\44\1\uffff\1\54\1\44\1\1\2\uffff\3\44\1"+
			"\1\2\44\2\uffff\3\44\1\uffff\3\44\1\1\3\44\1\uffff\3\44\1\uffff\3\44"+
			"\1\uffff\1\44\1\uffff\1\44\2\uffff\2\44\1\uffff\1\1\2\44\1\55\4\44\1"+
			"\1\1\uffff\2\44\1\uffff\2\44\3\uffff\14\44\1\uffff\2\44\1\uffff\4\44"+
			"\1\uffff\1\44\1\1\1\uffff\2\44\1\uffff\4\44\1\uffff\1\1\1\uffff\1\44"+
			"\10\uffff\2\44\1\uffff\1\1\1\uffff\1\44\2\uffff\1\44\7\uffff\1\1\1\44"+
			"\2\1\1\uffff\2\1\2\uffff\1\1\1\53\1\1\5\uffff\1\44\2\1\1\uffff\1\44\1"+
			"\1",
			"\1\57\3\uffff\1\61\1\uffff\3\61\4\uffff\1\61\1\uffff\1\1\3\uffff\3\1"+
			"\1\uffff\1\61\1\uffff\2\61\1\uffff\2\61\2\1\1\uffff\2\61\2\1\1\61\4\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\3\61\1\1\1\uffff\1\61\1\uffff\2\61\1\uffff\2"+
			"\61\3\uffff\1\1\2\61\1\uffff\1\1\1\61\3\uffff\1\44\1\61\1\uffff\3\61"+
			"\1\uffff\3\61\2\uffff\2\61\3\uffff\1\61\1\uffff\1\61\4\uffff\2\61\2\uffff"+
			"\5\61\4\uffff\2\61\1\uffff\2\61\3\uffff\1\61\1\1\5\61\5\1\1\uffff\1\1"+
			"\1\61\2\uffff\3\61\1\uffff\1\61\2\uffff\2\61\1\uffff\1\1\1\61\2\1\15"+
			"\uffff\1\60",
			"\1\1\4\uffff\1\1\5\uffff\1\1\3\uffff\1\1\1\uffff\1\62\1\1\2\uffff\1"+
			"\64\1\uffff\3\64\4\uffff\1\64\1\uffff\1\65\3\uffff\1\66\1\67\1\70\1\uffff"+
			"\1\64\1\113\2\64\1\uffff\2\64\1\112\1\71\1\uffff\2\64\1\110\1\72\1\64"+
			"\3\uffff\1\114\1\73\1\uffff\1\74\2\uffff\3\64\1\75\1\uffff\1\64\1\uffff"+
			"\2\64\1\uffff\2\64\3\uffff\1\76\2\64\1\uffff\1\77\1\64\2\uffff\2\114"+
			"\1\64\1\uffff\3\64\1\uffff\3\64\1\uffff\1\114\2\64\1\uffff\2\1\1\64\1"+
			"\uffff\1\64\1\uffff\1\1\2\uffff\2\64\2\uffff\5\64\2\1\2\uffff\2\64\1"+
			"\uffff\2\64\3\uffff\1\64\1\100\5\64\1\101\1\111\1\102\1\107\1\103\1\uffff"+
			"\1\1\1\64\1\uffff\1\114\3\64\1\uffff\1\64\2\uffff\2\64\1\uffff\1\104"+
			"\1\64\1\105\1\106\3\uffff\1\114\10\uffff\1\1\1\63\3\uffff\1\1\2\uffff"+
			"\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\u0099\uffff\1\44\6\uffff\1\44",
			"\1\1\114\uffff\1\44\6\uffff\1\44",
			"\1\1\3\uffff\3\1\11\uffff\1\1\3\uffff\2\1\5\uffff\1\1\1\uffff\1\1\5"+
			"\uffff\1\1\13\uffff\1\1\3\uffff\1\1\62\uffff\1\1\5\uffff\5\1\17\uffff"+
			"\1\1\1\uffff\2\1\35\uffff\1\44\6\uffff\1\44",
			"\1\1\1\44",
			"\1\1\1\44",
			"\1\1\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\1\2\44\1\uffff\2\44"+
			"\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44",
			"\1\44\1\uffff\3\44\30\uffff\1\44\22\uffff\1\44\1\uffff\1\44\5\uffff"+
			"\1\44\13\uffff\1\44\24\uffff\1\44\2\uffff\1\44\4\uffff\1\44\37\uffff"+
			"\1\44\11\uffff\1\44\15\uffff\1\44\14\uffff\1\44\1\uffff\2\44\1\uffff"+
			"\2\44\1\uffff\1\1\3\44\6\uffff\2\44\2\uffff\1\44"
	};

	static final short[] DFA223_eot = DFA.unpackEncodedString(DFA223_eotS);
	static final short[] DFA223_eof = DFA.unpackEncodedString(DFA223_eofS);
	static final char[] DFA223_min = DFA.unpackEncodedStringToUnsignedChars(DFA223_minS);
	static final char[] DFA223_max = DFA.unpackEncodedStringToUnsignedChars(DFA223_maxS);
	static final short[] DFA223_accept = DFA.unpackEncodedString(DFA223_acceptS);
	static final short[] DFA223_special = DFA.unpackEncodedString(DFA223_specialS);
	static final short[][] DFA223_transition;

	static {
		int numStates = DFA223_transitionS.length;
		DFA223_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA223_transition[i] = DFA.unpackEncodedString(DFA223_transitionS[i]);
		}
	}

	protected class DFA223 extends DFA {

		public DFA223(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 223;
			this.eot = DFA223_eot;
			this.eof = DFA223_eof;
			this.min = DFA223_min;
			this.max = DFA223_max;
			this.accept = DFA223_accept;
			this.special = DFA223_special;
			this.transition = DFA223_transition;
		}
		@Override
		public String getDescription() {
			return "1593:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm | K_CAST '(' t= simpleTerm K_AS n= native_type ')' );";
		}
	}

	static final String DFA226_eotS =
		"\40\uffff";
	static final String DFA226_eofS =
		"\40\uffff";
	static final String DFA226_minS =
		"\1\6\1\uffff\34\30\2\uffff";
	static final String DFA226_maxS =
		"\1\u00db\1\uffff\33\u00ce\1\u00cc\2\uffff";
	static final String DFA226_acceptS =
		"\1\uffff\1\1\34\uffff\1\2\1\3";
	static final String DFA226_specialS =
		"\40\uffff}>";
	static final String[] DFA226_transitionS = {
			"\1\1\4\uffff\1\1\2\uffff\1\35\2\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1"+
			"\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff\1\6\1\7\1\10"+
			"\1\uffff\1\4\1\33\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4\1\30\1\12\1\4"+
			"\3\uffff\1\34\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff\1\4\1\uffff"+
			"\2\4\1\uffff\2\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff\2\34\1\4\1"+
			"\uffff\3\4\1\uffff\3\4\1\uffff\1\34\2\4\1\uffff\2\1\1\4\1\uffff\1\4\1"+
			"\uffff\1\1\2\uffff\2\4\2\uffff\5\4\2\1\2\uffff\2\4\1\uffff\2\4\3\uffff"+
			"\1\4\1\20\5\4\1\21\1\31\1\22\1\27\1\23\1\uffff\1\1\1\4\1\uffff\1\34\3"+
			"\4\1\uffff\1\4\2\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\34\10"+
			"\uffff\1\1\1\3\3\uffff\1\1\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff"+
			"\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00ae\uffff\1\1\1\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00b0\uffff\1\36\2\uffff\1\36\1\uffff\1\1",
			"\1\37\u00b0\uffff\1\36\2\uffff\1\36",
			"",
			""
	};

	static final short[] DFA226_eot = DFA.unpackEncodedString(DFA226_eotS);
	static final short[] DFA226_eof = DFA.unpackEncodedString(DFA226_eofS);
	static final char[] DFA226_min = DFA.unpackEncodedStringToUnsignedChars(DFA226_minS);
	static final char[] DFA226_max = DFA.unpackEncodedStringToUnsignedChars(DFA226_maxS);
	static final short[] DFA226_accept = DFA.unpackEncodedString(DFA226_acceptS);
	static final short[] DFA226_special = DFA.unpackEncodedString(DFA226_specialS);
	static final short[][] DFA226_transition;

	static {
		int numStates = DFA226_transitionS.length;
		DFA226_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA226_transition[i] = DFA.unpackEncodedString(DFA226_transitionS[i]);
		}
	}

	protected class DFA226 extends DFA {

		public DFA226(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 226;
			this.eot = DFA226_eot;
			this.eof = DFA226_eof;
			this.min = DFA226_min;
			this.max = DFA226_max;
			this.accept = DFA226_accept;
			this.special = DFA226_special;
			this.transition = DFA226_transition;
		}
		@Override
		public String getDescription() {
			return "1611:1: normalColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA234_eotS =
		"\35\uffff";
	static final String DFA234_eofS =
		"\35\uffff";
	static final String DFA234_minS =
		"\1\27\31\u00d4\1\6\2\uffff";
	static final String DFA234_maxS =
		"\1\u00b7\31\u00d4\1\u00db\2\uffff";
	static final String DFA234_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA234_specialS =
		"\35\uffff}>";
	static final String[] DFA234_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\2\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\1\31\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff"+
			"\2\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1"+
			"\30\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2"+
			"\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff\1\2",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\33\4\uffff\1\33\5\uffff\1\33\3\uffff\1\33\2\uffff\1\33\2\uffff\1"+
			"\33\1\uffff\3\33\4\uffff\1\33\1\uffff\1\33\3\uffff\3\33\1\uffff\4\33"+
			"\1\uffff\4\33\1\uffff\5\33\3\uffff\2\33\1\uffff\1\33\2\uffff\4\33\1\uffff"+
			"\1\33\1\uffff\2\33\1\uffff\2\33\3\uffff\3\33\1\uffff\2\33\2\uffff\3\33"+
			"\1\uffff\3\33\1\uffff\3\33\1\uffff\3\33\1\uffff\3\33\1\uffff\1\33\4\uffff"+
			"\2\33\2\uffff\7\33\2\uffff\2\33\1\uffff\2\33\3\uffff\14\33\2\uffff\1"+
			"\33\1\uffff\4\33\1\uffff\1\33\2\uffff\2\33\1\uffff\4\33\3\uffff\1\33"+
			"\15\uffff\1\33\2\uffff\1\33\34\uffff\1\34",
			"",
			""
	};

	static final short[] DFA234_eot = DFA.unpackEncodedString(DFA234_eotS);
	static final short[] DFA234_eof = DFA.unpackEncodedString(DFA234_eofS);
	static final char[] DFA234_min = DFA.unpackEncodedStringToUnsignedChars(DFA234_minS);
	static final char[] DFA234_max = DFA.unpackEncodedStringToUnsignedChars(DFA234_maxS);
	static final short[] DFA234_accept = DFA.unpackEncodedString(DFA234_acceptS);
	static final short[] DFA234_special = DFA.unpackEncodedString(DFA234_specialS);
	static final short[][] DFA234_transition;

	static {
		int numStates = DFA234_transitionS.length;
		DFA234_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA234_transition[i] = DFA.unpackEncodedString(DFA234_transitionS[i]);
		}
	}

	protected class DFA234 extends DFA {

		public DFA234(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 234;
			this.eot = DFA234_eot;
			this.eof = DFA234_eof;
			this.min = DFA234_min;
			this.max = DFA234_max;
			this.accept = DFA234_accept;
			this.special = DFA234_special;
			this.transition = DFA234_transition;
		}
		@Override
		public String getDescription() {
			return "1692:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );";
		}
	}

	static final String DFA239_eotS =
		"\101\uffff";
	static final String DFA239_eofS =
		"\101\uffff";
	static final String DFA239_minS =
		"\1\16\32\64\1\uffff\1\16\3\uffff\1\u00b6\2\uffff\32\64\4\uffff";
	static final String DFA239_maxS =
		"\1\u00c7\32\u00d7\1\uffff\1\u00c7\3\uffff\1\u00d0\2\uffff\32\u00d7\4\uffff";
	static final String DFA239_acceptS =
		"\33\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\32\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA239_specialS =
		"\101\uffff}>";
	static final String[] DFA239_transitionS = {
			"\1\1\10\uffff\1\2\3\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff"+
			"\1\6\1\7\1\10\1\uffff\1\4\1\32\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4"+
			"\1\30\1\12\1\4\3\uffff\1\32\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\2\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff"+
			"\2\32\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\1\32\2\4\3\uffff\1\4\1\uffff"+
			"\1\4\4\uffff\2\4\2\uffff\5\4\4\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\20"+
			"\5\4\1\21\1\31\1\22\1\27\1\23\1\uffff\1\33\1\4\1\uffff\1\32\3\4\1\uffff"+
			"\1\4\2\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\32\11\uffff\1\3"+
			"\17\uffff\1\34",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\36\uffff\1\40\10\uffff\1\37\6\uffff\1\36\141\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"",
			"\1\43\10\uffff\1\44\3\uffff\1\46\1\uffff\3\46\4\uffff\1\46\1\uffff\1"+
			"\47\3\uffff\1\50\1\51\1\52\1\uffff\1\46\1\74\2\46\1\uffff\2\46\1\74\1"+
			"\53\1\uffff\2\46\1\72\1\54\1\46\3\uffff\1\74\1\55\1\uffff\1\56\2\uffff"+
			"\3\46\1\57\1\uffff\1\46\1\uffff\2\46\1\uffff\2\46\3\uffff\1\60\2\46\1"+
			"\uffff\1\61\1\46\2\uffff\2\74\1\46\1\uffff\3\46\1\uffff\3\46\1\uffff"+
			"\1\74\2\46\3\uffff\1\46\1\uffff\1\46\4\uffff\2\46\2\uffff\5\46\4\uffff"+
			"\2\46\1\uffff\2\46\3\uffff\1\46\1\62\5\46\1\63\1\73\1\64\1\71\1\65\1"+
			"\uffff\1\75\1\46\1\uffff\1\74\3\46\1\uffff\1\46\2\uffff\2\46\1\uffff"+
			"\1\66\1\46\1\67\1\70\3\uffff\1\74\11\uffff\1\45\17\uffff\1\75",
			"",
			"",
			"",
			"\1\76\20\uffff\1\77\10\uffff\1\76",
			"",
			"",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\36\uffff\1\75\10\uffff\1\75\6\uffff\1\75\141\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"",
			"",
			"",
			""
	};

	static final short[] DFA239_eot = DFA.unpackEncodedString(DFA239_eotS);
	static final short[] DFA239_eof = DFA.unpackEncodedString(DFA239_eofS);
	static final char[] DFA239_min = DFA.unpackEncodedStringToUnsignedChars(DFA239_minS);
	static final char[] DFA239_max = DFA.unpackEncodedStringToUnsignedChars(DFA239_maxS);
	static final short[] DFA239_accept = DFA.unpackEncodedString(DFA239_acceptS);
	static final short[] DFA239_special = DFA.unpackEncodedString(DFA239_specialS);
	static final short[][] DFA239_transition;

	static {
		int numStates = DFA239_transitionS.length;
		DFA239_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA239_transition[i] = DFA.unpackEncodedString(DFA239_transitionS[i]);
		}
	}

	protected class DFA239 extends DFA {

		public DFA239(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 239;
			this.eot = DFA239_eot;
			this.eof = DFA239_eof;
			this.min = DFA239_min;
			this.max = DFA239_max;
			this.accept = DFA239_accept;
			this.special = DFA239_special;
			this.transition = DFA239_transition;
		}
		@Override
		public String getDescription() {
			return "1711:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA238_eotS =
		"\12\uffff";
	static final String DFA238_eofS =
		"\12\uffff";
	static final String DFA238_minS =
		"\1\123\1\uffff\6\u00b6\2\uffff";
	static final String DFA238_maxS =
		"\1\u00d6\1\uffff\6\u00d0\2\uffff";
	static final String DFA238_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA238_specialS =
		"\12\uffff}>";
	static final String[] DFA238_transitionS = {
			"\1\1\161\uffff\1\7\14\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"",
			""
	};

	static final short[] DFA238_eot = DFA.unpackEncodedString(DFA238_eotS);
	static final short[] DFA238_eof = DFA.unpackEncodedString(DFA238_eofS);
	static final char[] DFA238_min = DFA.unpackEncodedStringToUnsignedChars(DFA238_minS);
	static final char[] DFA238_max = DFA.unpackEncodedStringToUnsignedChars(DFA238_maxS);
	static final short[] DFA238_accept = DFA.unpackEncodedString(DFA238_acceptS);
	static final short[] DFA238_special = DFA.unpackEncodedString(DFA238_specialS);
	static final short[][] DFA238_transition;

	static {
		int numStates = DFA238_transitionS.length;
		DFA238_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA238_transition[i] = DFA.unpackEncodedString(DFA238_transitionS[i]);
		}
	}

	protected class DFA238 extends DFA {

		public DFA238(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 238;
			this.eot = DFA238_eot;
			this.eof = DFA238_eof;
			this.min = DFA238_min;
			this.max = DFA238_max;
			this.accept = DFA238_accept;
			this.special = DFA238_special;
			this.transition = DFA238_transition;
		}
		@Override
		public String getDescription() {
			return "1724:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA249_eotS =
		"\40\uffff";
	static final String DFA249_eofS =
		"\1\uffff\25\35\2\32\1\uffff\1\32\1\uffff\1\32\4\uffff";
	static final String DFA249_minS =
		"\1\27\27\110\1\uffff\1\110\1\uffff\1\110\4\uffff";
	static final String DFA249_maxS =
		"\1\u00bb\27\u00d5\1\uffff\1\u00d5\1\uffff\1\u00d5\4\uffff";
	static final String DFA249_acceptS =
		"\30\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA249_specialS =
		"\40\uffff}>";
	static final String[] DFA249_transitionS = {
			"\1\32\3\uffff\1\32\1\uffff\3\32\4\uffff\1\32\1\uffff\1\1\3\uffff\1\2"+
			"\1\3\1\4\1\uffff\4\32\1\uffff\3\32\1\5\1\uffff\2\32\1\24\1\6\1\32\3\uffff"+
			"\1\32\1\7\1\uffff\1\10\2\uffff\3\32\1\11\1\uffff\1\33\1\uffff\2\32\1"+
			"\uffff\2\32\3\uffff\1\12\2\32\1\uffff\1\13\1\32\2\uffff\3\32\1\uffff"+
			"\3\32\1\uffff\1\27\1\32\1\26\1\uffff\3\32\3\uffff\1\32\1\uffff\1\32\4"+
			"\uffff\2\32\2\uffff\5\32\4\uffff\2\32\1\uffff\2\32\2\uffff\1\30\1\32"+
			"\1\14\5\32\1\15\1\25\1\16\1\23\1\17\2\uffff\1\32\1\uffff\1\32\1\31\2"+
			"\32\1\uffff\1\32\2\uffff\2\32\1\uffff\1\20\1\32\1\21\1\22\3\uffff\1\32"+
			"\11\uffff\1\32\3\uffff\1\34",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\15\uffff\1\35\13\uffff\1\35\36\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\32\15\uffff\1\32\13\uffff\1\32\36\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"\1\32\15\uffff\1\32\13\uffff\1\32\36\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"",
			"\1\32\15\uffff\1\32\13\uffff\1\32\36\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\36\2\uffff\1\32",
			"",
			"\1\32\15\uffff\1\32\13\uffff\1\32\36\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\37\2\uffff\1\32",
			"",
			"",
			"",
			""
	};

	static final short[] DFA249_eot = DFA.unpackEncodedString(DFA249_eotS);
	static final short[] DFA249_eof = DFA.unpackEncodedString(DFA249_eofS);
	static final char[] DFA249_min = DFA.unpackEncodedStringToUnsignedChars(DFA249_minS);
	static final char[] DFA249_max = DFA.unpackEncodedStringToUnsignedChars(DFA249_maxS);
	static final short[] DFA249_accept = DFA.unpackEncodedString(DFA249_acceptS);
	static final short[] DFA249_special = DFA.unpackEncodedString(DFA249_specialS);
	static final short[][] DFA249_transition;

	static {
		int numStates = DFA249_transitionS.length;
		DFA249_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA249_transition[i] = DFA.unpackEncodedString(DFA249_transitionS[i]);
		}
	}

	protected class DFA249 extends DFA {

		public DFA249(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 249;
			this.eot = DFA249_eot;
			this.eof = DFA249_eof;
			this.min = DFA249_min;
			this.max = DFA249_max;
			this.accept = DFA249_accept;
			this.special = DFA249_special;
			this.transition = DFA249_transition;
		}
		@Override
		public String getDescription() {
			return "1785:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_describeStatement_in_cqlStatement991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1030 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1068 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1094 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1111 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1115 = new BitSet(new long[]{0x0000000100000002L,0x1200001000010000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1125 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000004000080L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1129 = new BitSet(new long[]{0x0000000100000002L,0x1200001000010000L});
	public static final BitSet FOLLOW_K_GROUP_in_selectStatement1142 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1144 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1146 = new BitSet(new long[]{0x0000000100000002L,0x1200001000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_selectStatement1151 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1153 = new BitSet(new long[]{0x0000000100000002L,0x1200001000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1170 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1172 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1174 = new BitSet(new long[]{0x0000000100000002L,0x1000001000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_selectStatement1179 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1181 = new BitSet(new long[]{0x0000000100000002L,0x1000001000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1198 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1200 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1202 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1206 = new BitSet(new long[]{0x0000000100000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1221 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1225 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectClause1297 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_selectors_in_selectClause1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectors_in_selectClause1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectors1338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_selectors1343 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selector_in_selectors1347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_216_in_selectors1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1392 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1395 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_selector1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionAddition_in_unaliasedSelector1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_selectionAddition1471 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_selectionAddition1489 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_216_in_selectionMultiplication1547 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_207_in_selectionMultiplication1565 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_198_in_selectionMultiplication1583 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_selectionGroup1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroup1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_204_in_selectionGroup1651 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionGroup1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionGroupWithField1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldSelectorModifier_in_selectorModifier1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_selectorModifier1727 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x4AC023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_collectionSubSelection_in_selectorModifier1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_selectorModifier1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_206_in_fieldSelectorModifier1771 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_fieldSelectorModifier1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1819 = new BitSet(new long[]{0x1F7BDC50E9A20842L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1839 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionList_in_selectionGroupWithoutField1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_selectionTypeHint1979 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_selectionTypeHint1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionTypeHint1985 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008810080L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_selectionList2030 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x000000000A811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000800L});
	public static final BitSet FOLLOW_203_in_selectionList2042 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000800L});
	public static final BitSet FOLLOW_217_in_selectionList2056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_selectionMapOrSet2077 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMapOrSet2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010010800L});
	public static final BitSet FOLLOW_selectionMap_in_selectionMapOrSet2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_selectionSet_in_selectionMapOrSet2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_220_in_selectionMapOrSet2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_selectionMapOrSet2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_220_in_selectionMapOrSet2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_selectionMap2157 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_selectionMap2169 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_selectionMap2175 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_selectionSet2231 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionSet2235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_199_in_selectionTupleOrNestedSelector2281 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_selectionTupleOrNestedSelector2290 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_selectionTupleOrNestedSelector2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sident_in_simpleUnaliasedSelector2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionFunction_in_simpleUnaliasedSelector2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_selectionFunction2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_selectionFunction2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_216_in_selectionFunction2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAXWRITETIME_in_selectionFunction2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_selectionFunction2514 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_sident_in_selectionFunction2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804100L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionFunction2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WRITETIME_in_selectionFunction2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_selectionFunction2549 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_sident_in_selectionFunction2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804100L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionFunction2557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_selectionFunction2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_selectionFunction2590 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_sident_in_selectionFunction2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000804100L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionFunction2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CAST_in_selectionFunction2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_selectionFunction2630 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunction2634 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_K_AS_in_selectionFunction2636 = new BitSet(new long[]{0x0C401C4000000000L,0x000000000220020AL,0x00000340007C1000L});
	public static final BitSet FOLLOW_native_type_in_selectionFunction2640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_selectionFunction2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_selectionFunction2658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_selectionLiteral2704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_selectionLiteral2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_selectionLiteral2768 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_selectionLiteral2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_selectionLiteral2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_selectionFunctionArgs2849 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811180L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_selectionFunctionArgs2870 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_selectionFunctionArgs2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sident2912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_sident2937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_sident2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2987 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause2991 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000004000080L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2993 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression3024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_218_in_customIndexExpression3052 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_customIndexExpression3057 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_customIndexExpression3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_customIndexExpression3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause3093 = new BitSet(new long[]{0x4000002000000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause3096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause3100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_groupByClause3126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement3153 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement3171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0840000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_normalInsertStatement3226 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_normalInsertStatement3237 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_normalInsertStatement3248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement3256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_normalInsertStatement3264 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_normalInsertStatement3274 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_normalInsertStatement3285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement3295 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement3297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement3299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement3314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement3360 = new BitSet(new long[]{0x1000000000000002L,0x0000000000040000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_DEFAULT_in_jsonInsertStatement3370 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_NULL_in_jsonInsertStatement3374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_UNSET_in_jsonInsertStatement3382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement3398 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement3402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_jsonValue3462 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue3466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008100000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3513 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause3518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008100000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3520 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective3542 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective3556 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement3594 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement3598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000400L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement3608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement3620 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_updateStatement3626 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement3639 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000004000080L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement3643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement3653 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement3657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement3665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3707 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions3712 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3714 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement3751 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36FCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement3770 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement3774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000082000000000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement3796 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000004000080L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement3800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement3810 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement3814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement3822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_deleteSelection3884 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_cident_in_deleteOp3915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_215_in_deleteOp3944 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_deleteOp3948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_deleteOp3950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_deleteOp3964 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_deleteOp3968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete3990 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete3994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement4028 = new BitSet(new long[]{0x0040010000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement4038 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement4044 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement4057 = new BitSet(new long[]{0x2000000800000000L,0x0000000001000000L,0x0000002200000000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement4061 = new BitSet(new long[]{0x2000000800000000L,0x0000000001000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement4081 = new BitSet(new long[]{0x2000000800000000L,0x0000000001000000L,0x0000000200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_batchStatement4083 = new BitSet(new long[]{0x2000000800000000L,0x0000000001000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement4097 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement4099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective4130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective4143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective4156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement4189 = new BitSet(new long[]{0x0000000020000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement4192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement4194 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement4206 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement4215 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement4217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement4219 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement4233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_createAggregateStatement4241 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L,0x0000000000000100L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_createAggregateStatement4281 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_createAggregateStatement4309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement4317 = new BitSet(new long[]{0x1F7B5C50E8800000L,0x7CC28CEE86E36BCAL,0x008003D9737FF8D8L});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement4331 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400100L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement4355 = new BitSet(new long[]{0x1F7B5C50E8800000L,0x7CC28CEE86E36BCAL,0x008003D9737FF8D8L});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement4388 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement4394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement4441 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement4443 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement4454 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement4469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_dropAggregateStatement4487 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L,0x0000000000000100L});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_dropAggregateStatement4533 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_dropAggregateStatement4565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement4622 = new BitSet(new long[]{0x0000000000000000L,0x0100000000002000L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement4639 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement4648 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement4650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement4652 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_createFunctionStatement4674 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000100L});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4698 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_createFunctionStatement4718 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4722 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_createFunctionStatement4750 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4761 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4763 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement4769 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement4775 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement4779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4787 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement4801 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement4807 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement4815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement4821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement4859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement4861 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement4870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement4872 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement4887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_dropFunctionStatement4905 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L,0x0000000000000100L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_dropFunctionStatement4951 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_dropFunctionStatement4983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement5042 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement5044 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement5047 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement5049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement5051 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement5060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement5068 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement5070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement5105 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement5107 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement5110 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement5112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement5114 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement5129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_tableDefinition_in_createTableStatement5139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tableDefinition5158 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8DAL});
	public static final BitSet FOLLOW_tableColumns_in_tableDefinition5160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tableDefinition5165 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8DAL,0x0000000000000900L});
	public static final BitSet FOLLOW_tableColumns_in_tableDefinition5167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tableDefinition5174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_tableDefinition5184 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_tableProperty_in_tableDefinition5186 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_tableDefinition5191 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_tableProperty_in_tableDefinition5193 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_ident_in_tableColumns5228 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_tableColumns5232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002002L});
	public static final BitSet FOLLOW_K_STATIC_in_tableColumns5235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_tableColumns5252 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_KEY_in_tableColumns5254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_tableColumns5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_KEY_in_tableColumns5268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_tableColumns5270 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_tablePartitionKey_in_tableColumns5272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tableColumns5276 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_tableColumns5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tableColumns5287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tablePartitionKey5334 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tablePartitionKey5344 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tablePartitionKey5355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_tableProperty5373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_tableProperty5382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_STORAGE_in_tableProperty5384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_tableProperty5394 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_tableProperty5396 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_K_BY_in_tableProperty5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_tableProperty5400 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_tableClusteringOrder_in_tableProperty5402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tableProperty5406 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_tableClusteringOrder_in_tableProperty5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tableProperty5413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_tableClusteringOrder5441 = new BitSet(new long[]{0x4000002000000000L});
	public static final BitSet FOLLOW_K_ASC_in_tableClusteringOrder5444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_tableClusteringOrder5448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement5486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement5488 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement5491 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement5493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement5495 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_createTypeStatement5526 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_createTypeStatement5533 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000900L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_createTypeStatement5542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_typeColumns5562 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns5566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement5600 = new BitSet(new long[]{0x0100000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement5603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement5609 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CE28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement5612 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement5614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement5616 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CE28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement5632 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement5637 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement5641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_createIndexStatement5643 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E37BDBL,0x008023D97A7FF8D8L,0x0000000000000100L});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_createIndexStatement5650 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E37BDBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_createIndexStatement5659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement5674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement5689 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_properties_in_createIndexStatement5691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent5723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent5751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_indexIdent5753 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_indexIdent5757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent5770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_indexIdent5772 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_indexIdent5776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent5791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_indexIdent5793 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_indexIdent5797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent5809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_indexIdent5811 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_indexIdent5815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement5854 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement5858 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement5861 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement5863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement5865 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5873 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement5885 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_selectors_in_createMaterializedViewStatement5889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement5891 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000002L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement5906 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000004000080L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_viewPrimaryKey_in_createMaterializedViewStatement5932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement5945 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_viewProperty_in_createMaterializedViewStatement5947 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement5952 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_viewProperty_in_createMaterializedViewStatement5954 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_viewPrimaryKey5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_KEY_in_viewPrimaryKey5980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_viewPrimaryKey5982 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_viewPartitionKey_in_viewPrimaryKey5984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_viewPrimaryKey5988 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_viewPrimaryKey5992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_viewPrimaryKey5999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey6036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_viewPartitionKey6046 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey6050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_viewPartitionKey6056 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey6060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_viewPartitionKey6067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_viewProperty6085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_viewProperty6094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_STORAGE_in_viewProperty6096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_viewProperty6106 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_viewProperty6108 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_K_BY_in_viewProperty6110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_viewProperty6112 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_viewClusteringOrder_in_viewProperty6114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_viewProperty6118 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_viewClusteringOrder_in_viewProperty6120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_viewProperty6125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_viewClusteringOrder6153 = new BitSet(new long[]{0x4000002000000000L});
	public static final BitSet FOLLOW_K_ASC_in_viewClusteringOrder6156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_viewClusteringOrder6160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement6198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement6200 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement6203 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement6205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement6207 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_createTriggerStatement6217 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement6228 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement6232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement6234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement6238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement6279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement6281 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement6286 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_dropTriggerStatement6296 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement6299 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement6303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement6343 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6345 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterKeyspaceStatement6348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterKeyspaceStatement6350 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement6359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement6369 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement6371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6406 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6408 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterTableStatement6411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTableStatement6413 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement6428 = new BitSet(new long[]{0x0000000210000000L,0x0000000000000004L,0x0000100000000004L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6448 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement6454 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement6471 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_alterTableStatement6475 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_alterTableStatement6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTableStatement6479 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6511 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_alterTableStatement6543 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6548 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L,0x0000000000000900L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_alterTableStatement6579 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6583 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L,0x0000000000000900L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_alterTableStatement6598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement6612 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_alterTableStatement6616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTableStatement6618 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_199_in_alterTableStatement6672 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_alterTableStatement6700 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_alterTableStatement6711 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_USING_in_alterTableStatement6733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_alterTableStatement6735 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_INTEGER_in_alterTableStatement6739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement6755 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterTableStatement6759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTableStatement6761 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6796 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6800 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement6822 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6828 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6832 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement6850 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_K_COMPACT_in_alterTableStatement6852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_STORAGE_in_alterTableStatement6854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement6867 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_properties_in_alterTableStatement6869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_STATIC_in_isStaticColumn6911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement6947 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement6951 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterMaterializedViewStatement6954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterMaterializedViewStatement6956 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement6977 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement6979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement7019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement7021 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterTypeStatement7024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTypeStatement7026 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement7035 = new BitSet(new long[]{0x0000000210000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement7055 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement7063 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement7067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement7080 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterTypeStatement7083 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_alterTypeStatement7085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTypeStatement7087 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7100 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement7104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement7124 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterTypeStatement7127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterTypeStatement7129 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement7140 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7144 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement7166 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement7172 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement7176 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement7228 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement7230 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement7233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement7235 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement7244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement7278 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7280 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement7283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement7285 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement7294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement7328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement7330 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement7333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement7335 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement7344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement7378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement7380 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement7383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement7385 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement7394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement7434 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement7438 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement7441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7443 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement7483 = new BitSet(new long[]{0x1F7FDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement7486 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement7492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement7517 = new BitSet(new long[]{0x8080008280000000L,0x0000100000000024L,0x0000000000000200L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement7529 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement7537 = new BitSet(new long[]{0x1F7FDC50E8800000L,0x7CC28EEFE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement7549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement7557 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement7571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement7602 = new BitSet(new long[]{0x8080008280000000L,0x0000100000000024L,0x0000000000000200L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement7614 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement7622 = new BitSet(new long[]{0x1F7FDC50E8800000L,0x7CC28EEFE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement7634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement7642 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement7656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement7687 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement7709 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement7754 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement7776 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement7828 = new BitSet(new long[]{0x8080008280000000L,0x0000100000000024L,0x0000000000000200L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement7840 = new BitSet(new long[]{0x0000000000000002L,0x0031000000000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement7850 = new BitSet(new long[]{0x1F7FDC50E8800000L,0x7CC28EEFE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement7852 = new BitSet(new long[]{0x0000000000000002L,0x0011000000000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement7867 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement7869 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission7919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll7976 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll7980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll8001 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll8005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_permissionOrAll8014 = new BitSet(new long[]{0x8080008200000000L,0x0000100000000024L,0x0000000000000200L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll8018 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll8022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_dataResource_in_resource8053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource8065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource8077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource8089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource8112 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource8114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource8124 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource8130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource8142 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource8151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource8161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_TABLES_in_dataResource8163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_IN_in_dataResource8165 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource8167 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource8173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource8196 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource8198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource8218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource8220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource8230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource8232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource8255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource8257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource8267 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource8273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_IN_in_functionResource8321 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource8323 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource8329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource8344 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_functionResource8348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_functionResource8366 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L,0x0000000000000100L});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_functionResource8412 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_functionResource8444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement8492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement8494 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L,0x0880000000000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement8497 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement8499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement8501 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0880000000000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement8509 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000100000010000L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement8521 = new BitSet(new long[]{0x0000000000000000L,0x0800000000020000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement8523 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement8537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement8543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement8588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement8590 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L,0x0880000000000000L});
	public static final BitSet FOLLOW_K_IF_in_alterUserStatement8593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterUserStatement8595 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0880000000000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement8603 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000100000010000L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement8615 = new BitSet(new long[]{0x0000000000000000L,0x0800000000020000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement8617 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement8631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement8645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement8691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement8693 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L,0x0880000000000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement8696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement8698 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0880000000000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement8706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement8731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement8733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement8767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement8769 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement8772 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement8776 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement8784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement8794 = new BitSet(new long[]{0x0000000008000000L,0x0880004000020000L,0x0000000000010000L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement8796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement8840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement8842 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_alterRoleStatement8845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_alterRoleStatement8847 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement8855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement8865 = new BitSet(new long[]{0x0000000008000000L,0x0880004000020000L,0x0000000000010000L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement8867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement8911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement8913 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E76BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement8916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement8918 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement8926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement8966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement8968 = new BitSet(new long[]{0x0000000000000002L,0x0011000000000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement8978 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x08C023D97A7FF8D8L});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement8980 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement8993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions9024 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions9028 = new BitSet(new long[]{0x0000000008000000L,0x0880004000020000L,0x0000000000010000L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions9030 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption9052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_roleOption9054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption9058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_HASHED_in_roleOption9069 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption9071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_roleOption9073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption9077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption9088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_roleOption9090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_roleOption9094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption9105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_roleOption9107 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption9111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption9122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_roleOption9124 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption9128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ACCESS_in_roleOption9139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_roleOption9141 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_ALL_in_roleOption9143 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_DATACENTERS_in_roleOption9145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ACCESS_in_roleOption9156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_TO_in_roleOption9158 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_DATACENTERS_in_roleOption9160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_219_in_roleOption9162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_dcPermission_in_roleOption9164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_203_in_roleOption9168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_dcPermission_in_roleOption9170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_220_in_roleOption9175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_dcPermission9195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword9217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword9221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_HASHED_in_userPassword9232 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword9234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword9238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_describeStatement9272 = new BitSet(new long[]{0x1F7FDC50E8800000L,0x7CC28FEFE6F37BCBL,0x008023D97A7FF9D8L});
	public static final BitSet FOLLOW_K_CLUSTER_in_describeStatement9293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_FULL_in_describeStatement9324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_SCHEMA_in_describeStatement9330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_describeStatement9349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_ONLY_in_describeStatement9376 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_describeStatement9382 = new BitSet(new long[]{0x1F7BDC50E8800002L,0x7CC28EEEE6E36BCBL,0x00C033D97A7FF8D8L});
	public static final BitSet FOLLOW_keyspaceName_in_describeStatement9388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_TABLES_in_describeStatement9457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_describeStatement9488 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_INDEX_in_describeStatement9511 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_describeStatement9540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_describeStatement9542 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_TYPES_in_describeStatement9562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_describeStatement9595 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_userTypeName_in_describeStatement9599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_describeStatement9636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_describeStatement9661 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_describeStatement9665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_AGGREGATES_in_describeStatement9698 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_describeStatement9721 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97B7FF8D8L});
	public static final BitSet FOLLOW_functionName_in_describeStatement9725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_IDENT_in_describeStatement9757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_describeStatement9797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_unreserved_keyword_in_describeStatement9831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_describeStatement9846 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_IDENT_in_describeStatement9863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_describeStatement9904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_unreserved_keyword_in_describeStatement9939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WITH_in_describeStatement10023 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_INTERNALS_in_describeStatement10025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTY_QUOTED_NAME_in_cident10056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cident10071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident10109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident10134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident10153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fident10178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_fident10203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_fident10222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident10248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident10273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident10292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName10325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName10359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_indexName10362 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_idxName_in_indexName10366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName10398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_columnFamilyName10401 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x00C023D97A7FF8D8L});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName10405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName10430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_userTypeName10432 = new BitSet(new long[]{0x131B4010E8800000L,0x7CC28CEEC4C369C0L,0x008000997203E8D8L});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName10438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName10470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName10493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName10518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName10537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName10547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName10569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName10594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName10613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName10623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName10645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName10670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName10689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName10699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName10721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName10746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName10762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName10781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName10791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant10816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant10828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant10847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant10868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_constant10887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant10905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant10927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_constant10943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_POSITIVE_INFINITY_in_constant10963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NEGATIVE_INFINITY_in_constant10978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_fullMapLiteral11019 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000018811080L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral11025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_fullMapLiteral11027 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral11031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_203_in_fullMapLiteral11037 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral11041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_fullMapLiteral11043 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral11047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_220_in_fullMapLiteral11063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapLiteral_in_setOrMapLiteral11087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setLiteral_in_setOrMapLiteral11100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_203_in_setLiteral11145 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_setLiteral11149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_208_in_mapLiteral11194 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_mapLiteral11198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_mapLiteral11204 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_mapLiteral11208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_mapLiteral11210 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_mapLiteral11214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_listLiteral_in_collectionLiteral11242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_collectionLiteral11252 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_collectionLiteral11256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010800L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral11260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_220_in_collectionLiteral11265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_collectionLiteral11283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_220_in_collectionLiteral11285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_listLiteral11326 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x000000000A811080L});
	public static final BitSet FOLLOW_term_in_listLiteral11332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000800L});
	public static final BitSet FOLLOW_203_in_listLiteral11338 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_listLiteral11342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000800L});
	public static final BitSet FOLLOW_217_in_listLiteral11352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_usertypeLiteral11396 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral11400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_usertypeLiteral11402 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral11406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_203_in_usertypeLiteral11412 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral11416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_208_in_usertypeLiteral11418 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral11422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000800L});
	public static final BitSet FOLLOW_220_in_usertypeLiteral11429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tupleLiteral11466 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_tupleLiteral11470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tupleLiteral11476 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_tupleLiteral11480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tupleLiteral11487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value11510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value11532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value11545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value11560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value11576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_value11600 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_value11604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value11615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue11655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_intValue11669 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_intValue11673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue11684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName11730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_206_in_functionName11732 = new BitSet(new long[]{0x1F7B5C50E8800000L,0x7CC28CEE86E36BCAL,0x008003D9737FF8D8L});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName11738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName11765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName11799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName11827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName11837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName11869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function11916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_function11918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_function11920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function11950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_function11952 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_functionArgs_in_function11956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_function11958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs11991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_functionArgs11997 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_functionArgs12001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_termAddition_in_term12029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition12081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_termAddition12097 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition12101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_termAddition12115 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition12119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication12157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_216_in_termMultiplication12173 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication12177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_207_in_termMultiplication12191 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication12195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_198_in_termMultiplication12209 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication12213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001008040L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup12249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_204_in_termGroup12272 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008810080L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup12277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_simpleTerm12310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_simpleTerm12361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_simpleTerm12407 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_simpleTerm12411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_simpleTerm12413 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008810080L});
	public static final BitSet FOLLOW_simpleTerm_in_simpleTerm12417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CAST_in_simpleTerm12436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_199_in_simpleTerm12438 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008810080L});
	public static final BitSet FOLLOW_simpleTerm_in_simpleTerm12442 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_K_AS_in_simpleTerm12444 = new BitSet(new long[]{0x0C401C4000000000L,0x000000000220020AL,0x00000340007C1000L});
	public static final BitSet FOLLOW_native_type_in_simpleTerm12448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_simpleTerm12450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation12472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000906400L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation12474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_212_in_columnOperationDifferentiator12493 = new BitSet(new long[]{0x1F7BDC50E9A24840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator12495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator12504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_columnOperationDifferentiator12513 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator12517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_columnOperationDifferentiator12519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator12521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_206_in_columnOperationDifferentiator12530 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_columnOperationDifferentiator12534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator12536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation12557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_normalColumnOperation12560 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation12589 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation12599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12617 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation12621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_shorthandColumnOperation12649 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_shorthandColumnOperation12659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_212_in_collectionColumnOperation12685 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation12689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_212_in_udtColumnOperation12715 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation12719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition12752 = new BitSet(new long[]{0x0010000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000FC4020L});
	public static final BitSet FOLLOW_relationType_in_columnCondition12766 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnCondition12770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_containsOperator_in_columnCondition12786 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnCondition12790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition12804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010080L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition12822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition12842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_columnCondition12870 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnCondition12874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_columnCondition12876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_relationType_in_columnCondition12894 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnCondition12898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition12916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010080L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition12938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition12962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_206_in_columnCondition13008 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_fident_in_columnCondition13012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_relationType_in_columnCondition13030 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_columnCondition13034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition13052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010080L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition13074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition13098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties13160 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_K_AND_in_properties13164 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_property_in_properties13166 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property13189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_property13191 = new BitSet(new long[]{0x1F7BDC50E9220840L,0xFCC2EEEEE6E36BCBL,0x480023D97A7FF8D9L});
	public static final BitSet FOLLOW_propertyValue_in_property13195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property13207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_212_in_property13209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_property13213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue13238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue13260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_212_in_relationType13283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_210_in_relationType13294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_211_in_relationType13305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_213_in_relationType13315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_214_in_relationType13326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_197_in_relationType13336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_relationType_in_relation13362 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13378 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation13380 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13396 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_IS_in_relation13398 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation13400 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation13402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation13412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation13416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_relationType_in_relation13420 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_IN_in_relation13446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_inMarker_in_relation13450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_IN_in_relation13472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation13476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13496 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_containsOperator_in_relation13500 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_215_in_relation13518 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_relation13524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_relationType_in_relation13528 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_relation13532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation13544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x00000000007C0020L});
	public static final BitSet FOLLOW_K_IN_in_relation13554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010080L});
	public static final BitSet FOLLOW_199_in_relation13568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_relation13570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation13602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation13636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation13670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation13712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation13716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation13742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation13746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_relation13776 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97B7FF8D8L,0x0000000000000080L});
	public static final BitSet FOLLOW_relation_in_relation13778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_relation13781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONTAINS_in_containsOperator13802 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_KEY_in_containsOperator13807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker13832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_inMarker13842 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker13846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tupleOfIdentifiers13878 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers13882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tupleOfIdentifiers13887 = new BitSet(new long[]{0x1F7BDC50E8804000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers13891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tupleOfIdentifiers13897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_singleColumnInValues13927 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811180L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues13935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_singleColumnInValues13940 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000008811080L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues13944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_singleColumnInValues13953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tupleOfTupleLiterals13983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tupleOfTupleLiterals13992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tupleOfTupleLiterals14002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple14023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_markerForTuple14033 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple14037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_199_in_tupleOfMarkersForTuples14069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples14073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_203_in_tupleOfMarkersForTuples14078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples14082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000900L});
	public static final BitSet FOLLOW_200_in_tupleOfMarkersForTuples14088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple14109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_208_in_inMarkerForTuple14119 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x008023D97A7FF8D8L});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple14123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType14148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType14164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType14176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType14192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType14204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_comparatorType14206 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType14210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_comparatorType14212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType14230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type14259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type14273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type14286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type14301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type14313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type14325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type14337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DURATION_in_native_type14350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type14361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type14375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type14390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type14406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type14417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type14432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type14442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type14454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type14469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type14481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type14494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type14505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type14520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type14548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_collection_type14551 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_203_in_collection_type14557 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_collection_type14563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type14581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_collection_type14583 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_collection_type14589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type14607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_collection_type14610 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_collection_type14616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type14665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_tuple_type14667 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type14671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_203_in_tuple_type14676 = new BitSet(new long[]{0x1F7BDC50E8800000L,0x7CC28EEEE6E36BCBL,0x088023D97A7FFCD8L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type14680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_213_in_tuple_type14686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username14703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username14711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username14719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean14738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident14763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident14794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident14819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident14831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword14874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword14890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword14945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword14957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword14995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_synpred1_Parser1088 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_selectClause_in_synpred1_Parser1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_synpred2_Parser1291 = new BitSet(new long[]{0x1F7BDC50E9A20840L,0xFCCAEEEEE6E36BCBL,0x48C023D97B7FF8D9L,0x0000000009811080L});
	public static final BitSet FOLLOW_selectors_in_synpred2_Parser1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_synpred3_Parser1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_synpred4_Parser1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTER_in_synpred5_Parser9289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_synpred6_Parser9345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TABLES_in_synpred7_Parser9452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TYPES_in_synpred8_Parser9557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_synpred9_Parser9631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_AGGREGATES_in_synpred10_Parser9693 = new BitSet(new long[]{0x0000000000000002L});
}
