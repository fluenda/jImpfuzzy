/*
 * (C) Copyright 2016-2017 Fluenda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.fluenda.jImpfuzzy.utils;

import java.util.HashMap;
import java.util.Map;

public class ws2_32 {
    static Map<Integer, String> ord_names = new HashMap<Integer, String>()
    {{
        put(1,"accept");
        put(2,"bind");
        put(3,"closesocket");
        put(4,"connect");
        put(5,"getpeername");
        put(6,"getsockname");
        put(7,"getsockopt");
        put(8,"htonl");
        put(9,"htons");
        put(10,"ioctlsocket");
        put(11,"inet_addr");
        put(12,"inet_ntoa");
        put(13,"listen");
        put(14,"ntohl");
        put(15,"ntohs");
        put(16,"recv");
        put(17,"recvfrom");
        put(18,"select");
        put(19,"send");
        put(20,"sendto");
        put(21,"setsockopt");
        put(22,"shutdown");
        put(23,"socket");
        put(24,"GetAddrInfoW");
        put(25,"GetNameInfoW");
        put(26,"WSApSetPostRoutine");
        put(27,"FreeAddrInfoW");
        put(28,"WPUCompleteOverlappedRequest");
        put(29,"WSAAccept");
        put(30,"WSAAddressToStringA");
        put(31,"WSAAddressToStringW");
        put(32,"WSACloseEvent");
        put(33,"WSAConnect");
        put(34,"WSACreateEvent");
        put(35,"WSADuplicateSocketA");
        put(36,"WSADuplicateSocketW");
        put(37,"WSAEnumNameSpaceProvidersA");
        put(38,"WSAEnumNameSpaceProvidersW");
        put(39,"WSAEnumNetworkEvents");
        put(40,"WSAEnumProtocolsA");
        put(41,"WSAEnumProtocolsW");
        put(42,"WSAEventSelect");
        put(43,"WSAGetOverlappedResult");
        put(44,"WSAGetQOSByName");
        put(45,"WSAGetServiceClassInfoA");
        put(46,"WSAGetServiceClassInfoW");
        put(47,"WSAGetServiceClassNameByClassIdA");
        put(48,"WSAGetServiceClassNameByClassIdW");
        put(49,"WSAHtonl");
        put(50,"WSAHtons");
        put(51,"gethostbyaddr");
        put(52,"gethostbyname");
        put(53,"getprotobyname");
        put(54,"getprotobynumber");
        put(55,"getservbyname");
        put(56,"getservbyport");
        put(57,"gethostname");
        put(58,"WSAInstallServiceClassA");
        put(59,"WSAInstallServiceClassW");
        put(60,"WSAIoctl");
        put(61,"WSAJoinLeaf");
        put(62,"WSALookupServiceBeginA");
        put(63,"WSALookupServiceBeginW");
        put(64,"WSALookupServiceEnd");
        put(65,"WSALookupServiceNextA");
        put(66,"WSALookupServiceNextW");
        put(67,"WSANSPIoctl");
        put(68,"WSANtohl");
        put(69,"WSANtohs");
        put(70,"WSAProviderConfigChange");
        put(71,"WSARecv");
        put(72,"WSARecvDisconnect");
        put(73,"WSARecvFrom");
        put(74,"WSARemoveServiceClass");
        put(75,"WSAResetEvent");
        put(76,"WSASend");
        put(77,"WSASendDisconnect");
        put(78,"WSASendTo");
        put(79,"WSASetEvent");
        put(80,"WSASetServiceA");
        put(81,"WSASetServiceW");
        put(82,"WSASocketA");
        put(83,"WSASocketW");
        put(84,"WSAStringToAddressA");
        put(85,"WSAStringToAddressW");
        put(86,"WSAWaitForMultipleEvents");
        put(87,"WSCDeinstallProvider");
        put(88,"WSCEnableNSProvider");
        put(89,"WSCEnumProtocols");
        put(90,"WSCGetProviderPath");
        put(91,"WSCInstallNameSpace");
        put(92,"WSCInstallProvider");
        put(93,"WSCUnInstallNameSpace");
        put(94,"WSCUpdateProvider");
        put(95,"WSCWriteNameSpaceOrder");
        put(96,"WSCWriteProviderOrder");
        put(97,"freeaddrinfo");
        put(98,"getaddrinfo");
        put(99,"getnameinfo");
        put(101,"WSAAsyncSelect");
        put(102,"WSAAsyncGetHostByAddr");
        put(103,"WSAAsyncGetHostByName");
        put(104,"WSAAsyncGetProtoByNumber");
        put(105,"WSAAsyncGetProtoByName");
        put(106,"WSAAsyncGetServByPort");
        put(107,"WSAAsyncGetServByName");
        put(108,"WSACancelAsyncRequest");
        put(109,"WSASetBlockingHook");
        put(110,"WSAUnhookBlockingHook");
        put(111,"WSAGetLastError");
        put(112,"WSASetLastError");
        put(113,"WSACancelBlockingCall");
        put(114,"WSAIsBlocking");
        put(115,"WSAStartup");
        put(116,"WSACleanup");
        put(151,"__WSAFDIsSet");
        put(500,"WEP");
    }};

}
