////////////////////////////////////////////////////////////////////////
//
// processType.java
//
// This file was generated by XMLSpy 2009sp1 Enterprise Edition.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the XMLSpy Documentation for further details.
// http://www.altova.com/xmlspy
//
////////////////////////////////////////////////////////////////////////

package com.jbpm5processdoc;


public class processType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getTypes()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_ti_altova_processType]); }
	
	public processType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{
		processType2 = new MemberAttribute_processType2 (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._processType2]);
		packageName = new MemberAttribute_packageName (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._packageName]);
		name = new MemberAttribute_name (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._name]);
		isExecutable = new MemberAttribute_isExecutable (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._isExecutable]);
		id = new MemberAttribute_id (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._id]);

		startEvent= new MemberElement_startEvent (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._startEvent]);
		userTask= new MemberElement_userTask (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._userTask]);
		exclusiveGateway= new MemberElement_exclusiveGateway (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._exclusiveGateway]);
		endEvent= new MemberElement_endEvent (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._endEvent]);
		sequenceFlow= new MemberElement_sequenceFlow (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_processType._sequenceFlow]);
	}
	// Attributes
	public MemberAttribute_processType2 processType2;
		public static class MemberAttribute_processType2
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_processType2 (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}
	public MemberAttribute_packageName packageName;
		public static class MemberAttribute_packageName
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_packageName (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}
	public MemberAttribute_name name;
		public static class MemberAttribute_name
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_name (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}
	public MemberAttribute_isExecutable isExecutable;
		public static class MemberAttribute_isExecutable
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_isExecutable (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public boolean getValue() {
				return (boolean)com.migration.xml.XmlTreeOperations.castToBool(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(boolean value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}
	public MemberAttribute_id id;
		public static class MemberAttribute_id
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_id (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}


	// Elements
	
	public MemberElement_startEvent startEvent;

		public static class MemberElement_startEvent
		{
			public static class MemberElement_startEvent_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_startEvent member;
				public MemberElement_startEvent_Iterator(MemberElement_startEvent member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					startEventType nx = new startEventType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_startEvent (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public startEventType at(int index) {return new startEventType(owner.getElementAt(info, index));}
			public startEventType first() {return new startEventType(owner.getElementFirst(info));}
			public startEventType last(){return new startEventType(owner.getElementLast(info));}
			public startEventType append(){return new startEventType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_startEvent_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_userTask userTask;

		public static class MemberElement_userTask
		{
			public static class MemberElement_userTask_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_userTask member;
				public MemberElement_userTask_Iterator(MemberElement_userTask member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					userTaskType nx = new userTaskType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_userTask (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public userTaskType at(int index) {return new userTaskType(owner.getElementAt(info, index));}
			public userTaskType first() {return new userTaskType(owner.getElementFirst(info));}
			public userTaskType last(){return new userTaskType(owner.getElementLast(info));}
			public userTaskType append(){return new userTaskType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_userTask_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_exclusiveGateway exclusiveGateway;

		public static class MemberElement_exclusiveGateway
		{
			public static class MemberElement_exclusiveGateway_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_exclusiveGateway member;
				public MemberElement_exclusiveGateway_Iterator(MemberElement_exclusiveGateway member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					exclusiveGatewayType nx = new exclusiveGatewayType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_exclusiveGateway (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public exclusiveGatewayType at(int index) {return new exclusiveGatewayType(owner.getElementAt(info, index));}
			public exclusiveGatewayType first() {return new exclusiveGatewayType(owner.getElementFirst(info));}
			public exclusiveGatewayType last(){return new exclusiveGatewayType(owner.getElementLast(info));}
			public exclusiveGatewayType append(){return new exclusiveGatewayType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_exclusiveGateway_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_endEvent endEvent;

		public static class MemberElement_endEvent
		{
			public static class MemberElement_endEvent_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_endEvent member;
				public MemberElement_endEvent_Iterator(MemberElement_endEvent member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					endEventType nx = new endEventType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_endEvent (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public endEventType at(int index) {return new endEventType(owner.getElementAt(info, index));}
			public endEventType first() {return new endEventType(owner.getElementFirst(info));}
			public endEventType last(){return new endEventType(owner.getElementLast(info));}
			public endEventType append(){return new endEventType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_endEvent_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_sequenceFlow sequenceFlow;

		public static class MemberElement_sequenceFlow
		{
			public static class MemberElement_sequenceFlow_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_sequenceFlow member;
				public MemberElement_sequenceFlow_Iterator(MemberElement_sequenceFlow member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					sequenceFlowType nx = new sequenceFlowType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_sequenceFlow (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public sequenceFlowType at(int index) {return new sequenceFlowType(owner.getElementAt(info, index));}
			public sequenceFlowType first() {return new sequenceFlowType(owner.getElementFirst(info));}
			public sequenceFlowType last(){return new sequenceFlowType(owner.getElementLast(info));}
			public sequenceFlowType append(){return new sequenceFlowType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_sequenceFlow_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}