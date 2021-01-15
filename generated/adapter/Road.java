//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.4
//
// <auto-generated>
//
// Generated from file `adapter.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package adapter;

public interface Road extends BaseItem
{
    void setStartAngle(float angle, com.zeroc.Ice.Current current);

    void setEndAngle(float angle, com.zeroc.Ice.Current current);

    void setStarts(String roadPointId, com.zeroc.Ice.Current current);

    void setEnds(String roadPointId, com.zeroc.Ice.Current current);

    void setRoadAttributes(String roadAttributesId, com.zeroc.Ice.Current current);

    void setAverageSpeed(int averageSpeed, com.zeroc.Ice.Current current);

    void setSpeedLimit(int speedLimit, com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::adapter::BaseItem",
        "::adapter::Road"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::adapter::Road";
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setStartAngle(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        float iceP_angle;
        iceP_angle = istr.readFloat();
        inS.endReadParams();
        obj.setStartAngle(iceP_angle, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setEndAngle(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        float iceP_angle;
        iceP_angle = istr.readFloat();
        inS.endReadParams();
        obj.setEndAngle(iceP_angle, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setStarts(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_roadPointId;
        iceP_roadPointId = istr.readString();
        inS.endReadParams();
        obj.setStarts(iceP_roadPointId, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setEnds(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_roadPointId;
        iceP_roadPointId = istr.readString();
        inS.endReadParams();
        obj.setEnds(iceP_roadPointId, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setRoadAttributes(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_roadAttributesId;
        iceP_roadAttributesId = istr.readString();
        inS.endReadParams();
        obj.setRoadAttributes(iceP_roadAttributesId, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setAverageSpeed(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_averageSpeed;
        iceP_averageSpeed = istr.readInt();
        inS.endReadParams();
        obj.setAverageSpeed(iceP_averageSpeed, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setSpeedLimit(Road obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_speedLimit;
        iceP_speedLimit = istr.readInt();
        inS.endReadParams();
        obj.setSpeedLimit(iceP_speedLimit, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /** @hidden */
    final static String[] _iceOps =
    {
        "getId",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setAverageSpeed",
        "setEndAngle",
        "setEnds",
        "setRoadAttributes",
        "setSpeedLimit",
        "setStartAngle",
        "setStarts"
    };

    /** @hidden */
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return BaseItem._iceD_getId(this, in, current);
            }
            case 1:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 5:
            {
                return _iceD_setAverageSpeed(this, in, current);
            }
            case 6:
            {
                return _iceD_setEndAngle(this, in, current);
            }
            case 7:
            {
                return _iceD_setEnds(this, in, current);
            }
            case 8:
            {
                return _iceD_setRoadAttributes(this, in, current);
            }
            case 9:
            {
                return _iceD_setSpeedLimit(this, in, current);
            }
            case 10:
            {
                return _iceD_setStartAngle(this, in, current);
            }
            case 11:
            {
                return _iceD_setStarts(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
