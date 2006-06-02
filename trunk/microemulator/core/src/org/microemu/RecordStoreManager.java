/*
 *  MicroEmulator
 *  Copyright (C) 2001-2005 Bartek Teodorczyk <barteo@barteo.net>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
 
package org.microemu;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

import org.microemu.util.RecordStoreImpl;



public interface RecordStoreManager 
{	
	
	void deleteRecordStore(String recordStoreName) 
			throws RecordStoreNotFoundException, RecordStoreException;
	
	RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) 
			throws RecordStoreNotFoundException;
	
	String[] listRecordStores();
	
	void saveChanges(RecordStoreImpl recordStoreImpl) 
			throws RecordStoreNotOpenException;

    /**
     * Delete all record stores.
     */
    void deleteStores();
    
}
