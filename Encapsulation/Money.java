class Money{
private long rubs;
private byte cents;
 
public Money( long rubs, byte cents ){
    this.rubs = rubs;
    this.cents = cents;
}
 
public static double division( Money operand1, Money operand2 ){
    long operand1Total = operand1.getRubs( ) * 100 + operand1.getCents( );
    long operand2Total = operand2.getRubs( ) * 100 + operand2.getCents( );
    return operand1Total / (double) operand2Total;
}
 
public static Money add( Money operand1, Money operand2 ){
    long rubs = operand1.getRubs( ) + operand2.getRubs( );
    int cents = operand1.getCents( ) + operand2.getCents( );
    if( cents > 99 ){
        rubs++;
        cents -= 100;
    }
    if( cents < 0 ){
        rubs--;
        cents += 100;
    }
    return new Money( rubs, (byte) cents );
}
 
public static Money subtruct( Money operand1, Money operand2 ){
    return add( operand1, new Money( -operand2.getRubs( ), (byte) -operand2.getCents( ) ) );
}
 
public static Money division( Money operand, double by ){
    long operandTotal = (long) ( ( operand.getRubs( ) * 100 + operand.getCents( ) ) / by );
    return new Money( operandTotal / 100, (byte) ( operandTotal % 100 ) );
}
 
public static Money mult( Money operand, double times ){
    return division( operand, 1 / times );
}
 
public long getRubs( ){
    return rubs;
}
 
public byte getCents( ){
    return cents;
}
 
public String toString( ){
    return rubs + "," + cents;
}
 
public boolean equals( Money test ){
    return test.getRubs( ) == rubs && test.getCents( ) == cents;
}
}
