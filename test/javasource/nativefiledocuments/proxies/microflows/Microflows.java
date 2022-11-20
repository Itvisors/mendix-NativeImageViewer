// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativefiledocuments.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the NativeFileDocuments module
	public static void aSu_NativeFileDocuments(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("NativeFileDocuments.ASu_NativeFileDocuments").withParams(params).execute(context);
	}
	public static boolean bCo_NativeActionLog(IContext context, nativefiledocuments.proxies.NativeActionLog _nativeActionLog)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NativeActionLog", _nativeActionLog == null ? null : _nativeActionLog.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("NativeFileDocuments.BCo_NativeActionLog").withParams(params).execute(context);
	}
	public static void sCE_NativeActionLog_Cleanup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("NativeFileDocuments.SCE_NativeActionLog_Cleanup").withParams(params).execute(context);
	}
}
