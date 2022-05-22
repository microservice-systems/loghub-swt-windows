/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.win32;

public class TBBUTTONINFO {
	public int cbSize;
	public int dwMask;
	public int idCommand;
	public int iImage;
	public byte fsState;
	public byte fsStyle;
	public short cx;
	public long lParam;
	/** @field cast=(LPTSTR) */
	public long pszText;
	public int cchText;
	public static final int sizeof = OS.TBBUTTONINFO_sizeof ();
}
