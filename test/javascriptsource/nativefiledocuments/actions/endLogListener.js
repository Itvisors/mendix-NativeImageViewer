// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";

// BEGIN EXTRA CODE

import LogListener from "../LogListener";

// END EXTRA CODE

/**
 * Stops the active log listener, if any. Nothing happens and no exception is thrown when no listener was active.
 * @returns {Promise.<void>}
 */
export async function endLogListener() {
	// BEGIN USER CODE

	await LogListener.endListener();

	// END USER CODE
}