package hxDaedalus.iterators;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FromMeshToVertices extends haxe.lang.HxObject
{
	public    FromMeshToVertices(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FromMeshToVertices()
	{
		hxDaedalus.iterators.FromMeshToVertices.__hx_ctor_hxDaedalus_iterators_FromMeshToVertices(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_iterators_FromMeshToVertices(hxDaedalus.iterators.FromMeshToVertices __temp_me43)
	{
		{
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.iterators.FromMeshToVertices(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.iterators.FromMeshToVertices();
	}
	
	
	
	
	public  hxDaedalus.data.Mesh _fromMesh;
	
	public  int _currIndex;
	
	public  hxDaedalus.data.Vertex _resultVertex;
	
	public   hxDaedalus.data.Mesh set_fromMesh(hxDaedalus.data.Mesh value)
	{
		this._fromMesh = value;
		this._currIndex = 0;
		return value;
	}
	
	
	public   hxDaedalus.data.Vertex next()
	{
		while (true)
		{
			int _0 = this._currIndex;
			int _1 = this._fromMesh._vertices.length;
			boolean _2 = ( _0 < _1 );
			if (_2) 
			{
				haxe.root.Array<hxDaedalus.data.Vertex> _3 = this._fromMesh._vertices;
				int _4 = this._currIndex;
				hxDaedalus.data.Vertex _5 = _3.__get(_4);
				this._resultVertex = _5;
				this._currIndex++;
			}
			 else 
			{
				this._resultVertex = null;
				break;
			}
			
			boolean _6 = this._resultVertex.get_isReal();
			boolean _7 =  ! (_6) ;
			boolean _8 =  ! (_7) ;
			if (_8) 
			{
				break;
			}
			
		}
		
		hxDaedalus.data.Vertex _9 = this._resultVertex;
		return _9;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef156 = true;
			switch (field.hashCode())
			{
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						__temp_executeDef156 = false;
						this._currIndex = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef156) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef157 = true;
			switch (field.hashCode())
			{
				case -1844345344:
				{
					if (field.equals("_resultVertex")) 
					{
						__temp_executeDef157 = false;
						this._resultVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1244873545:
				{
					if (field.equals("fromMesh")) 
					{
						__temp_executeDef157 = false;
						this.set_fromMesh(((hxDaedalus.data.Mesh) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						__temp_executeDef157 = false;
						this._currIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -1154355690:
				{
					if (field.equals("_fromMesh")) 
					{
						__temp_executeDef157 = false;
						this._fromMesh = ((hxDaedalus.data.Mesh) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef157) 
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
			boolean __temp_executeDef158 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef158 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case -1154355690:
				{
					if (field.equals("_fromMesh")) 
					{
						__temp_executeDef158 = false;
						return this._fromMesh;
					}
					
					break;
				}
				
				
				case -1618935820:
				{
					if (field.equals("set_fromMesh")) 
					{
						__temp_executeDef158 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_fromMesh"))) );
					}
					
					break;
				}
				
				
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						__temp_executeDef158 = false;
						return this._currIndex;
					}
					
					break;
				}
				
				
				case -1844345344:
				{
					if (field.equals("_resultVertex")) 
					{
						__temp_executeDef158 = false;
						return this._resultVertex;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef158) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef159 = true;
			switch (field.hashCode())
			{
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						__temp_executeDef159 = false;
						return ((double) (this._currIndex) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef159) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
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
			boolean __temp_executeDef160 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef160 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case -1618935820:
				{
					if (field.equals("set_fromMesh")) 
					{
						__temp_executeDef160 = false;
						return this.set_fromMesh(((hxDaedalus.data.Mesh) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef160) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_resultVertex");
		baseArr.push("_currIndex");
		baseArr.push("_fromMesh");
		baseArr.push("fromMesh");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


