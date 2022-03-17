/*
 * Copyright (c) 2018 NetSec Lab - University of Parma (Italy)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND. IN NO EVENT
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package it.unipr.netsec.mjcoap.coap.observe;


import it.unipr.netsec.mjcoap.coap.message.CoapResponse;
import it.unipr.netsec.mjcoap.coap.message.CoapResponseCode;


/** It listens for observe client events.
 */
public interface ObserveTransactionClientListener {
	
	/** When a resource change notification is received.
	 * @param observe_client the observe client
	 * @param resp_code the response code
	 * @param state updated representation of the new resource state
	 * @param seq_num notification sequence number
	 * @param resp the CoAP response message */
	public void onObserveNotification(ObserveTransactionClient observe_client, CoapResponseCode resp_code, byte[] state, int seq_num, CoapResponse resp);


	/** When the observe client terminates.
	 * @param observe_client the observe client */
	public void onObserveClientTerminated(ObserveTransactionClient observe_client);


}