package com.profitbricks.api.ws;

public class ProfitbricksApiServicePortTypeProxy implements com.profitbricks.api.ws.ProfitbricksApiServicePortType {
  private String _endpoint = null;
  private com.profitbricks.api.ws.ProfitbricksApiServicePortType profitbricksApiServicePortType = null;
  
  public ProfitbricksApiServicePortTypeProxy() {
    _initProfitbricksApiServicePortTypeProxy();
  }
  
  public ProfitbricksApiServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initProfitbricksApiServicePortTypeProxy();
  }
  
  private void _initProfitbricksApiServicePortTypeProxy() {
    try {
      profitbricksApiServicePortType = (new com.profitbricks.api.ws.ProfitbricksApiServiceLocator()).getProfitbricksApiServicePort();
      if (profitbricksApiServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)profitbricksApiServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)profitbricksApiServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (profitbricksApiServicePortType != null)
      ((javax.xml.rpc.Stub)profitbricksApiServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.profitbricks.api.ws.ProfitbricksApiServicePortType getProfitbricksApiServicePortType() {
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType;
  }
  
  public com.profitbricks.api.ws.CreateDcResponse createDataCenter(java.lang.String dataCenterName, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createDataCenter(dataCenterName, region);
  }
  
  public com.profitbricks.api.ws.VersionResponse updateDataCenter(com.profitbricks.api.ws.UpdateDcRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateDataCenter(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse clearDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.clearDataCenter(dataCenterId);
  }
  
  public com.profitbricks.api.ws.RequestResponse deleteDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteDataCenter(dataCenterId);
  }
  
  public com.profitbricks.api.ws.DataCenterIdentifier[] getAllDataCenters() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getAllDataCenters();
  }
  
  public com.profitbricks.api.ws.CreateServerResponse createServer(com.profitbricks.api.ws.CreateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createServer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse updateServer(com.profitbricks.api.ws.UpdateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateServer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse deleteServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteServer(serverId);
  }
  
  public com.profitbricks.api.ws.RequestResponse stopServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.stopServer(serverId);
  }
  
  public com.profitbricks.api.ws.RequestResponse startServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.startServer(serverId);
  }
  
  public com.profitbricks.api.ws.RequestResponse resetServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.resetServer(serverId);
  }
  
  public com.profitbricks.api.ws.Server getServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getServer(serverId);
  }
  
  public com.profitbricks.api.ws.CreateNicResponse createNic(com.profitbricks.api.ws.CreateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createNic(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse deleteNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteNic(nicId);
  }
  
  public com.profitbricks.api.ws.VersionResponse updateNic(com.profitbricks.api.ws.UpdateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateNic(request);
  }
  
  public com.profitbricks.api.ws.Nic getNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getNic(nicId);
  }
  
  public com.profitbricks.api.ws.VersionResponse setInternetAccess(java.lang.String dataCenterId, java.lang.Integer lanId, boolean internetAccess) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.setInternetAccess(dataCenterId, lanId, internetAccess);
  }
  
  public com.profitbricks.api.ws.CreateStorageResponse createStorage(com.profitbricks.api.ws.CreateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createStorage(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse updateStorage(com.profitbricks.api.ws.UpdateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateStorage(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse deleteStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteStorage(storageId);
  }
  
  public com.profitbricks.api.ws.VersionResponse connectStorageToServer(com.profitbricks.api.ws.ConnectStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.connectStorageToServer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse disconnectStorageFromServer(java.lang.String storageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.disconnectStorageFromServer(storageId, serverId);
  }
  
  public com.profitbricks.api.ws.Image[] getAllImages() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getAllImages();
  }
  
  public com.profitbricks.api.ws.RequestResponse setImageOsType(java.lang.String imageId, com.profitbricks.api.ws.OsType osType) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.setImageOsType(imageId, osType);
  }
  
  public com.profitbricks.api.ws.VersionResponse addRomDriveToServer(com.profitbricks.api.ws.RomDriveRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.addRomDriveToServer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse removeRomDriveFromServer(java.lang.String imageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.removeRomDriveFromServer(imageId, serverId);
  }
  
  public com.profitbricks.api.ws.Image getImage(java.lang.String imageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getImage(imageId);
  }
  
  public com.profitbricks.api.ws.DataCenter getDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getDataCenter(dataCenterId);
  }
  
  public com.profitbricks.api.ws.ProvisioningState getDataCenterState(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getDataCenterState(dataCenterId);
  }
  
  public com.profitbricks.api.ws.Storage getStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getStorage(storageId);
  }
  
  public com.profitbricks.api.ws.IpBlockResponse reservePublicIpBlock(int blockSize, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.reservePublicIpBlock(blockSize, region);
  }
  
  public com.profitbricks.api.ws.RequestResponse releasePublicIpBlock(java.lang.String blockId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.releasePublicIpBlock(blockId);
  }
  
  public com.profitbricks.api.ws.VersionResponse addPublicIpToNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.addPublicIpToNic(ip, nicId);
  }
  
  public com.profitbricks.api.ws.VersionResponse removePublicIpFromNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.removePublicIpFromNic(ip, nicId);
  }
  
  public com.profitbricks.api.ws.IpBlock[] getAllPublicIpBlocks() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getAllPublicIpBlocks();
  }
  
  public com.profitbricks.api.ws.CreateLbResponse createLoadBalancer(com.profitbricks.api.ws.CreateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createLoadBalancer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse updateLoadBalancer(com.profitbricks.api.ws.UpdateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateLoadBalancer(request);
  }
  
  public com.profitbricks.api.ws.VersionResponse deleteLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteLoadBalancer(loadBalancerId);
  }
  
  public com.profitbricks.api.ws.LoadBalancer getLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getLoadBalancer(loadBalancerId);
  }
  
  public com.profitbricks.api.ws.RegisterLbServerResponse registerServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.registerServersOnLoadBalancer(serverIds, loadBalancerId);
  }
  
  public com.profitbricks.api.ws.VersionResponse deregisterServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deregisterServersOnLoadBalancer(serverIds, loadBalancerId);
  }
  
  public com.profitbricks.api.ws.VersionResponse activateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.activateLoadBalancingOnServers(loadBalancerId, serverIds);
  }
  
  public com.profitbricks.api.ws.VersionResponse deactivateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deactivateLoadBalancingOnServers(loadBalancerId, serverIds);
  }
  
  public com.profitbricks.api.ws.Firewall addFirewallRulesToNic(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.addFirewallRulesToNic(request, nicId);
  }
  
  public com.profitbricks.api.ws.Firewall addFirewallRulesToLoadBalancer(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.addFirewallRulesToLoadBalancer(request, loadBalancerId);
  }
  
  public com.profitbricks.api.ws.VersionResponse removeFirewallRules(java.lang.String[] firewallRuleIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.removeFirewallRules(firewallRuleIds);
  }
  
  public com.profitbricks.api.ws.VersionResponse activateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.activateFirewalls(firewallIds);
  }
  
  public com.profitbricks.api.ws.VersionResponse deactivateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deactivateFirewalls(firewallIds);
  }
  
  public com.profitbricks.api.ws.VersionResponse deleteFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteFirewalls(firewallIds);
  }
  
  public com.profitbricks.api.ws.Firewall getFirewall(java.lang.String firewallId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getFirewall(firewallId);
  }
  
  public com.profitbricks.api.ws.Snapshot[] getAllSnapshots() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getAllSnapshots();
  }
  
  public com.profitbricks.api.ws.RequestResponse updateSnapshot(com.profitbricks.api.ws.UpdateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.updateSnapshot(request);
  }
  
  public com.profitbricks.api.ws.Snapshot getSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getSnapshot(snapshotId);
  }
  
  public com.profitbricks.api.ws.CreateSnapshotResponse createSnapshot(com.profitbricks.api.ws.CreateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.createSnapshot(request);
  }
  
  public com.profitbricks.api.ws.RequestResponse deleteSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.deleteSnapshot(snapshotId);
  }
  
  public com.profitbricks.api.ws.VersionResponse rollbackSnapshot(com.profitbricks.api.ws.RollbackSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.rollbackSnapshot(request);
  }
  
  public com.profitbricks.api.ws.Notification[] getNotifications(java.lang.String networkUUID) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    return profitbricksApiServicePortType.getNotifications(networkUUID);
  }
  
  public void deleteNotifications(java.lang.String[] notificationId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault{
    if (profitbricksApiServicePortType == null)
      _initProfitbricksApiServicePortTypeProxy();
    profitbricksApiServicePortType.deleteNotifications(notificationId);
  }
  
  
}