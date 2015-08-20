package org.hl7.fhir.instance.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Thu, Aug 13, 2015 16:43-0400 for FHIR v0.5.0


public enum V3ResponseMode {

        /**
         * The receiver may respond in a non-immediate manner. Note: this will be the default value.
         */
        D, 
        /**
         * The receiver is required to assume that the sender is blocking and behave appropriately by sending an immediate response.
         */
        I, 
        /**
         * The receiver shall keep any application responses in a queue until such time as the queue is polled.
         */
        Q, 
        /**
         * added to help the parsers
         */
        NULL;
        public static V3ResponseMode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("D".equals(codeString))
          return D;
        if ("I".equals(codeString))
          return I;
        if ("Q".equals(codeString))
          return Q;
        throw new Exception("Unknown V3ResponseMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case D: return "D";
            case I: return "I";
            case Q: return "Q";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/v3/ResponseMode";
        }
        public String getDefinition() {
          switch (this) {
            case D: return "The receiver may respond in a non-immediate manner. Note: this will be the default value.";
            case I: return "The receiver is required to assume that the sender is blocking and behave appropriately by sending an immediate response.";
            case Q: return "The receiver shall keep any application responses in a queue until such time as the queue is polled.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case D: return "deferred";
            case I: return "immediate";
            case Q: return "queue";
            default: return "?";
          }
    }


}

