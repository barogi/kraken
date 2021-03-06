// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `Locator.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public final class LocatorRegistryHolder extends Ice.ObjectHolderBase<LocatorRegistry>
{
    public
    LocatorRegistryHolder()
    {
    }

    public
    LocatorRegistryHolder(LocatorRegistry value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        try
        {
            value = (LocatorRegistry)v;
        }
        catch(ClassCastException ex)
        {
            IceInternal.Ex.throwUOE(type(), v.ice_id());
        }
    }

    public String
    type()
    {
        return _LocatorRegistryDisp.ice_staticId();
    }
}
