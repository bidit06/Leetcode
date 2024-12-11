/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *t = head;
    struct ListNode *r = head;

    while(r!=NULL && r->next != NULL){
        t=t->next;
        r=r->next->next;
    }
    return t;

    
}