package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringBuf extends haxe.lang.HxObject
{
	public    StringBuf(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    StringBuf()
	{
		haxe.root.StringBuf.__hx_ctor__StringBuf(this);
	}
	
	
	public static   void __hx_ctor__StringBuf(haxe.root.StringBuf __temp_me4)
	{
		java.lang.StringBuilder _0 = new java.lang.StringBuilder();
		__temp_me4.b = _0;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.StringBuf(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.StringBuf();
	}
	
	
	public  java.lang.StringBuilder b;
	
	public  <T> void add(T x)
	{
		boolean _0 = haxe.lang.Runtime.isInt(x);
		if (_0) 
		{
			int x1 = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (x) ))) );
			java.lang.Object xd = x1;
			this.b.append(((java.lang.Object) (xd) ));
		}
		 else 
		{
			this.b.append(((java.lang.Object) (x) ));
		}
		
	}
	
	
	@Override public   java.lang.String toString()
	{
		java.lang.String _0 = this.b.toString();
		return _0;
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef80 = true;
			switch (field.hashCode())
			{
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef80 = false;
						this.b = ((java.lang.StringBuilder) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef80) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef81 = true;
			switch (field.hashCode())
			{
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef81 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("toString"))) );
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef81 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef81 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("add"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef81) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef82 = true;
			switch (field.hashCode())
			{
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef82 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef82 = false;
						this.add(dynargs.__get(0));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef82) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("b");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


