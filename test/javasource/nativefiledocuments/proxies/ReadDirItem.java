// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativefiledocuments.proxies;

public class ReadDirItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject readDirItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NativeFileDocuments.ReadDirItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Path("Path"),
		Size("Size"),
		IsFile("IsFile"),
		IsDirectory("IsDirectory"),
		LastModified("LastModified");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ReadDirItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ReadDirItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject readDirItemMendixObject)
	{
		if (readDirItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, readDirItemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.readDirItemMendixObject = readDirItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReadDirItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static nativefiledocuments.proxies.ReadDirItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nativefiledocuments.proxies.ReadDirItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static nativefiledocuments.proxies.ReadDirItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nativefiledocuments.proxies.ReadDirItem(context, mendixObject);
	}

	public static nativefiledocuments.proxies.ReadDirItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nativefiledocuments.proxies.ReadDirItem.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Path
	 */
	public final java.lang.String getPath()
	{
		return getPath(getContext());
	}

	/**
	 * @param context
	 * @return value of Path
	 */
	public final java.lang.String getPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Path.toString());
	}

	/**
	 * Set value of Path
	 * @param path
	 */
	public final void setPath(java.lang.String path)
	{
		setPath(getContext(), path);
	}

	/**
	 * Set value of Path
	 * @param context
	 * @param path
	 */
	public final void setPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String path)
	{
		getMendixObject().setValue(context, MemberNames.Path.toString(), path);
	}

	/**
	 * @return value of Size
	 */
	public final java.lang.String getSize()
	{
		return getSize(getContext());
	}

	/**
	 * @param context
	 * @return value of Size
	 */
	public final java.lang.String getSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Size.toString());
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final void setSize(java.lang.String size)
	{
		setSize(getContext(), size);
	}

	/**
	 * Set value of Size
	 * @param context
	 * @param size
	 */
	public final void setSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String size)
	{
		getMendixObject().setValue(context, MemberNames.Size.toString(), size);
	}

	/**
	 * @return value of IsFile
	 */
	public final java.lang.Boolean getIsFile()
	{
		return getIsFile(getContext());
	}

	/**
	 * @param context
	 * @return value of IsFile
	 */
	public final java.lang.Boolean getIsFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsFile.toString());
	}

	/**
	 * Set value of IsFile
	 * @param isfile
	 */
	public final void setIsFile(java.lang.Boolean isfile)
	{
		setIsFile(getContext(), isfile);
	}

	/**
	 * Set value of IsFile
	 * @param context
	 * @param isfile
	 */
	public final void setIsFile(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isfile)
	{
		getMendixObject().setValue(context, MemberNames.IsFile.toString(), isfile);
	}

	/**
	 * @return value of IsDirectory
	 */
	public final java.lang.Boolean getIsDirectory()
	{
		return getIsDirectory(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDirectory
	 */
	public final java.lang.Boolean getIsDirectory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDirectory.toString());
	}

	/**
	 * Set value of IsDirectory
	 * @param isdirectory
	 */
	public final void setIsDirectory(java.lang.Boolean isdirectory)
	{
		setIsDirectory(getContext(), isdirectory);
	}

	/**
	 * Set value of IsDirectory
	 * @param context
	 * @param isdirectory
	 */
	public final void setIsDirectory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdirectory)
	{
		getMendixObject().setValue(context, MemberNames.IsDirectory.toString(), isdirectory);
	}

	/**
	 * @return value of LastModified
	 */
	public final java.util.Date getLastModified()
	{
		return getLastModified(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModified
	 */
	public final java.util.Date getLastModified(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastModified.toString());
	}

	/**
	 * Set value of LastModified
	 * @param lastmodified
	 */
	public final void setLastModified(java.util.Date lastmodified)
	{
		setLastModified(getContext(), lastmodified);
	}

	/**
	 * Set value of LastModified
	 * @param context
	 * @param lastmodified
	 */
	public final void setLastModified(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastmodified)
	{
		getMendixObject().setValue(context, MemberNames.LastModified.toString(), lastmodified);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return readDirItemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final nativefiledocuments.proxies.ReadDirItem that = (nativefiledocuments.proxies.ReadDirItem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
