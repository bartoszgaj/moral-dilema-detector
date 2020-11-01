//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.3
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

public interface RoadPrx extends BaseItemPrx
{
    default void setStartAngle(float angle)
    {
        setStartAngle(angle, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setStartAngle(float angle, java.util.Map<String, String> context)
    {
        _iceI_setStartAngleAsync(angle, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setStartAngleAsync(float angle)
    {
        return _iceI_setStartAngleAsync(angle, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setStartAngleAsync(float angle, java.util.Map<String, String> context)
    {
        return _iceI_setStartAngleAsync(angle, context, false);
    }

    /**
     * @hidden
     * @param iceP_angle -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setStartAngleAsync(float iceP_angle, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setStartAngle", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeFloat(iceP_angle);
                 }, null);
        return f;
    }

    default void setEndAngle(float angle)
    {
        setEndAngle(angle, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setEndAngle(float angle, java.util.Map<String, String> context)
    {
        _iceI_setEndAngleAsync(angle, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setEndAngleAsync(float angle)
    {
        return _iceI_setEndAngleAsync(angle, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setEndAngleAsync(float angle, java.util.Map<String, String> context)
    {
        return _iceI_setEndAngleAsync(angle, context, false);
    }

    /**
     * @hidden
     * @param iceP_angle -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setEndAngleAsync(float iceP_angle, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setEndAngle", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeFloat(iceP_angle);
                 }, null);
        return f;
    }

    default void setStarts(String roadPointId)
    {
        setStarts(roadPointId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setStarts(String roadPointId, java.util.Map<String, String> context)
    {
        _iceI_setStartsAsync(roadPointId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setStartsAsync(String roadPointId)
    {
        return _iceI_setStartsAsync(roadPointId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setStartsAsync(String roadPointId, java.util.Map<String, String> context)
    {
        return _iceI_setStartsAsync(roadPointId, context, false);
    }

    /**
     * @hidden
     * @param iceP_roadPointId -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setStartsAsync(String iceP_roadPointId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setStarts", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_roadPointId);
                 }, null);
        return f;
    }

    default void setEnds(String roadPointId)
    {
        setEnds(roadPointId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setEnds(String roadPointId, java.util.Map<String, String> context)
    {
        _iceI_setEndsAsync(roadPointId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setEndsAsync(String roadPointId)
    {
        return _iceI_setEndsAsync(roadPointId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setEndsAsync(String roadPointId, java.util.Map<String, String> context)
    {
        return _iceI_setEndsAsync(roadPointId, context, false);
    }

    /**
     * @hidden
     * @param iceP_roadPointId -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setEndsAsync(String iceP_roadPointId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setEnds", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_roadPointId);
                 }, null);
        return f;
    }

    default void setRoadAttributes(String roadAttributesId)
    {
        setRoadAttributes(roadAttributesId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setRoadAttributes(String roadAttributesId, java.util.Map<String, String> context)
    {
        _iceI_setRoadAttributesAsync(roadAttributesId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setRoadAttributesAsync(String roadAttributesId)
    {
        return _iceI_setRoadAttributesAsync(roadAttributesId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setRoadAttributesAsync(String roadAttributesId, java.util.Map<String, String> context)
    {
        return _iceI_setRoadAttributesAsync(roadAttributesId, context, false);
    }

    /**
     * @hidden
     * @param iceP_roadAttributesId -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setRoadAttributesAsync(String iceP_roadAttributesId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setRoadAttributes", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_roadAttributesId);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static RoadPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static RoadPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, RoadPrx.class, _RoadPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default RoadPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (RoadPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default RoadPrx ice_adapterId(String newAdapterId)
    {
        return (RoadPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default RoadPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (RoadPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default RoadPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (RoadPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default RoadPrx ice_invocationTimeout(int newTimeout)
    {
        return (RoadPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default RoadPrx ice_connectionCached(boolean newCache)
    {
        return (RoadPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default RoadPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (RoadPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default RoadPrx ice_secure(boolean b)
    {
        return (RoadPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default RoadPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (RoadPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default RoadPrx ice_preferSecure(boolean b)
    {
        return (RoadPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default RoadPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (RoadPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default RoadPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (RoadPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default RoadPrx ice_collocationOptimized(boolean b)
    {
        return (RoadPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default RoadPrx ice_twoway()
    {
        return (RoadPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default RoadPrx ice_oneway()
    {
        return (RoadPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default RoadPrx ice_batchOneway()
    {
        return (RoadPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default RoadPrx ice_datagram()
    {
        return (RoadPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default RoadPrx ice_batchDatagram()
    {
        return (RoadPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default RoadPrx ice_compress(boolean co)
    {
        return (RoadPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default RoadPrx ice_timeout(int t)
    {
        return (RoadPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default RoadPrx ice_connectionId(String connectionId)
    {
        return (RoadPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default RoadPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (RoadPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::adapter::Road";
    }
}
