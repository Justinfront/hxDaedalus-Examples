package hxDaedalus.iterators;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FromVertexToHoldingFaces extends haxe.lang.HxObject
{
	public    FromVertexToHoldingFaces(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FromVertexToHoldingFaces()
	{
		hxDaedalus.iterators.FromVertexToHoldingFaces.__hx_ctor_hxDaedalus_iterators_FromVertexToHoldingFaces(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_iterators_FromVertexToHoldingFaces(hxDaedalus.iterators.FromVertexToHoldingFaces __temp_me44)
	{
		{
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.iterators.FromVertexToHoldingFaces(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.iterators.FromVertexToHoldingFaces();
	}
	
	
	
	
	public  hxDaedalus.data.Vertex _fromVertex;
	
	public  hxDaedalus.data.Edge _nextEdge;
	
	public  hxDaedalus.data.Face _resultFace;
	
	public   hxDaedalus.data.Vertex set_fromVertex(hxDaedalus.data.Vertex value)
	{
		this._fromVertex = value;
		hxDaedalus.data.Edge _0 = this._fromVertex.get_edge();
		this._nextEdge = _0;
		return value;
	}
	
	
	public   hxDaedalus.data.Face next()
	{
		hxDaedalus.data.Edge _0 = this._nextEdge;
		boolean _1 = ( _0 != null );
		if (_1) 
		{
			while (true)
			{
				hxDaedalus.data.Face _2 = this._nextEdge.get_leftFace();
				this._resultFace = _2;
				hxDaedalus.data.Edge _3 = this._nextEdge.get_rotLeftEdge();
				this._nextEdge = _3;
				hxDaedalus.data.Edge _4 = this._nextEdge;
				hxDaedalus.data.Edge _5 = this._fromVertex.get_edge();
				boolean _6 = ( _4 == _5 );
				if (_6) 
				{
					this._nextEdge = null;
					boolean _7 = this._resultFace.get_isReal();
					boolean _8 =  ! (_7) ;
					if (_8) 
					{
						this._resultFace = null;
					}
					
					break;
				}
				
				boolean _9 = this._resultFace.get_isReal();
				boolean _10 =  ! (_9) ;
				boolean _11 =  ! (_10) ;
				if (_11) 
				{
					break;
				}
				
			}
			
		}
		 else 
		{
			this._resultFace = null;
		}
		
		hxDaedalus.data.Face _12 = this._resultFace;
		return _12;
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef161 = true;
			switch (field.hashCode())
			{
				case 516035001:
				{
					if (field.equals("_resultFace")) 
					{
						__temp_executeDef161 = false;
						this._resultFace = ((hxDaedalus.data.Face) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -2064921106:
				{
					if (field.equals("fromVertex")) 
					{
						__temp_executeDef161 = false;
						this.set_fromVertex(((hxDaedalus.data.Vertex) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef161 = false;
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef161 = false;
						this._fromVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef161) 
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
			boolean __temp_executeDef162 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef162 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef162 = false;
						return this._fromVertex;
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef162 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_fromVertex"))) );
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef162 = false;
						return this._nextEdge;
					}
					
					break;
				}
				
				
				case 516035001:
				{
					if (field.equals("_resultFace")) 
					{
						__temp_executeDef162 = false;
						return this._resultFace;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef162) 
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
			boolean __temp_executeDef163 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef163 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef163 = false;
						return this.set_fromVertex(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef163) 
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
		baseArr.push("_resultFace");
		baseArr.push("_nextEdge");
		baseArr.push("_fromVertex");
		baseArr.push("fromVertex");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


