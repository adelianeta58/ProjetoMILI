package br.com.ifba.mili.infraestrutura.suport;

/**
 *
 * @author jonatasbastos
 */

public class StringUtil {
    private volatile static StringUtil instance;
    
    public static StringUtil getInstance () {
        if (instance == null) {
            synchronized(StringUtil.class) {
                if (instance == null) {
                    instance = new StringUtil();
                }
            }
        }
        
        return instance;
    }
    
    public boolean isNull (final String str) {
        return (str == null);
    }
    
    public boolean isEmpty (final String str) {
        return (isNull(str) ? true : (str.trim().equals("")));
    }
    
    public boolean isNullAndEmpty(final String str) {
        return (isNull(str) && isEmpty(str));
    }
    
    public boolean isNullOrEmpty(final String str) {
        return (isNull(str) || isEmpty(str));
    }
}